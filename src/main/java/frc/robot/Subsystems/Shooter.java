package frc.robot.Subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


 /**
  @author Aahana Shrivastava
   */

public class Shooter extends SubsystemBase  {
    private WPI_TalonFX shooter, shooterFollow;

    public Shooter(WPI_TalonFX left, WPI_TalonFX right) {
        shooter = left;
        shooterFollow = right;
        shooterFollow.follow(shooter);

        // Set inverted mode
        shooter.setInverted(Constants.FORWARD);
		shooterFollow.setInverted(InvertType.OpposeMaster);

        shooter.setNeutralMode(Constants.NEUTRAL_MODE);
        shooterFollow.setNeutralMode(Constants.NEUTRAL_MODE);

        shooter.configClosedloopRamp(Constants.RAMPING_FROM_0_TO_FULL);
        shooterFollow.configClosedloopRamp(Constants.RAMPING_FROM_0_TO_FULL);
        shooter.configOpenloopRamp(Constants.RAMPING_FROM_0_TO_FULL);
        shooterFollow.configOpenloopRamp(Constants.RAMPING_FROM_0_TO_FULL);

        shooter.config_kP(0, Constants.KP);
        shooterFollow.config_kP(0, Constants.KP);
        shooter.config_kI(0, Constants.KI);
        shooterFollow.config_kI(0, Constants.KI);
        shooter.config_kD(0, Constants.KD);
        shooterFollow.config_kD(0, Constants.KD);
        shooter.config_kF(0, Constants.KF);
        shooterFollow.config_kF(0, Constants.KF);
        }
    
    }




    

