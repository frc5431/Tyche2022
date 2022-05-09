// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.photonvision.PhotonCamera;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.subsystems.DefaultDriveCommand;
import frc.robot.subsystems.Drivebase;
import frc.team5431.titan.core.joysticks.LogitechExtreme3D;
import frc.team5431.titan.core.joysticks.Xbox;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
    // The robot's subsystems and commands are defined here...
    private final Systems systems = new Systems();
    private final Drivebase drivebase = systems.getDrivebase();
   private final PhotonCamera camera = systems.getCamera();

//     private final PowerDistribution pdh = new PowerDistribution();

    private final Xbox driver = new Xbox(0);
  //private final Joystick vjoy = new vjoy(4);
    private final Xbox buttonController = new Xbox(1);
    private final LogitechExtreme3D operator = new LogitechExtreme3D(2);

    //private final SendableChooser<AutonCommand.State> autonChooser;

    /**
     * The container for the robot. Contains subsystems, OI devices, and commands.
     */
    public RobotContainer() {
        // Set up the default command for the drivetrain.
        // The controls are for field-oriented driving:
        // Left stick Y axis -> forward and backwards movement
        // Left stick X axis -> left and right movement
        drivebase.setDefaultCommand(new DefaultDriveCommand(
            drivebase,
            () -> modifyAxis(-driver.getRawAxis(Xbox.Axis.LEFT_Y)),
            () -> modifyAxis(-driver.getRawAxis(Xbox.Axis.LEFT_X))
));


      
        /**systems.getClimber().getExtend().setDefaultCommand(new ClimberExtendCommand(systems, () -> {
            return modifyAxis(buttonController.getRawAxis(Xbox.Axis.TRIGGER_RIGHT))
                  - modifyAxis(buttonController.getRawAxis(Xbox.Axis.TRIGGER_LEFT));
        }));*/

        // Configure the button bindings
        configureButtonBindings();
    }

    private void configureButtonBindings() {
    }

    private static double deadband(double value, double deadband) { 
        if (Math.abs(value) > deadband) {
            if (value > 0.0) {
                return (value - deadband) / (1.0 - deadband);
            } else {
                return (value + deadband) / (1.0 - deadband);
            }
        } else { 
            return 0.0;
            }
        }
        
    private static double modifyAxis(double value) {
        //Deadband 
        value = deadband(value, 0.075);

        value = value * value * value;

        // Square the axis
        // value = Math.copySign(value * value, value);

        return value;
    }

    public Command getAutonomousCommand() {
        return null;
    }

        
    }  

     
