package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team5431.titan.core.joysticks.Xbox;

 /**
  @author Aahana Shrivastava
   */

public class Drivebase extends TimedRobot {
  private DifferentialDrive m_myRobot;
  private Xbox driver;
  private Xbox operator;
  Math power;

  private final CANSparkMax m_leftMotor1 = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax m_rightMotor1 = new CANSparkMax(2, MotorType.kBrushless);
  private final CANSparkMax m_leftMotor2 = new CANSparkMax(11, MotorType.kBrushless);
  private final CANSparkMax m_rightMotor2 = new CANSparkMax(5, MotorType.kBrushless);
  
  @Override
  public void robotInit() {
  
    m_rightMotor1.setInverted(true);
    m_rightMotor2.follow(m_rightMotor1);
    m_leftMotor1.setInverted(true);
    m_leftMotor2.follow(m_leftMotor1);

    // m_myRobot = new DifferentialDrive(m_leftMotor1, m_rightMotor1);
    driver = new Xbox(0);
    operator = new Xbox(1);

  }

  @Override
  public void teleopPeriodic() {
    // m_myRobot.arcadeDrive(driver.getRawAxis(Xbox.Axis.LEFT_Y), driver.getRawAxis(Xbox.Axis.LEFT_X));
    m_leftMotor1.set(driver.getRawAxis(Xbox.Axis.LEFT_Y));
    m_rightMotor1.set(driver.getRawAxis(Xbox.Axis.RIGHT_Y));
  
  }

  public void stop() {
  }

public void driveRaw(ChassisSpeeds chassisSpeeds) {
}

public void driveRelative(Double left, Double middle, Boolean right) {
}
}
