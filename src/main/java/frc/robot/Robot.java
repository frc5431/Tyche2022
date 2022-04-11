/**
  @author Aahana Shrivastava
  */
package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team5431.titan.core.joysticks.Xbox;

public class Robot extends TimedRobot {
  private DifferentialDrive m_myRobot;
  private Xbox driver;
  private Xbox operator;
  Math power;

  private final CANSparkMax m_leftMotor1 = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax m_rightMotor1 = new CANSparkMax(2, MotorType.kBrushless);
  private final CANSparkMax m_leftMotor2 = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax m_rightMotor2 = new CANSparkMax(4, MotorType.kBrushless);
  
  @Override
  public void robotInit() {
  
    m_rightMotor1.setInverted(true);
    m_rightMotor2.follow(m_rightMotor1);
    m_leftMotor1.setInverted(true);
    m_leftMotor2.follow(m_leftMotor1);

    m_myRobot = new DifferentialDrive(m_leftMotor1, m_rightMotor1);
    driver = new Xbox(0);
    operator = new Xbox(1);

  }

  @Override
  public void teleopPeriodic() {
    m_myRobot.arcadeDrive(driver.getRawAxis(Xbox.Axis.LEFT_Y), driver.getRawAxis(Xbox.Axis.LEFT_X));
   
  
  }
}
