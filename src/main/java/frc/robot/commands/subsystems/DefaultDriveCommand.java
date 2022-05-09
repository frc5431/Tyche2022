package frc.robot.commands.subsystems;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivebase;
import frc.team5431.titan.core.misc.Logger;


public class DefaultDriveCommand extends CommandBase {
    private final Drivebase m_drivetrainSubsystem;
    

    private final DoubleSupplier m_leftSupplier;
    private final DoubleSupplier m_rightSupplier;

    public DefaultDriveCommand(Drivebase drivetrainSubsystem,
                               DoubleSupplier leftSupplier,
                               DoubleSupplier rightSupplier) {
        this.m_drivetrainSubsystem = drivetrainSubsystem;
        this.m_leftSupplier = leftSupplier;
        this.m_rightSupplier = rightSupplier;

        addRequirements(drivetrainSubsystem);
    }

    @Override
    public void initialize() {
        Logger.l("Default drive starting");
    }

    @Override
    public void execute() {
        // You can use `new ChassisSpeeds(...)` for robot-oriented movement instead of field-oriented movement

        // m_drivetrainSubsystem.driveController(
        //                 m_leftSupplier.getAsDouble(),
        //                 m_rightSupplier.getAsDouble()
        //         );
        
        m_drivetrainSubsystem.driveArcade(m_leftSupplier.getAsDouble(), m_rightSupplier.getAsDouble());

    }
}
