package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

 /**
  @author Aahana Shrivastava
   */

public class Drivebase extends SubsystemBase {
  private DifferentialDrive m_myRobot;

  private final CANSparkMax m_leftMotor1 = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax m_rightMotor1 = new CANSparkMax(2, MotorType.kBrushless);
  private final CANSparkMax m_leftMotor2 = new CANSparkMax(11, MotorType.kBrushless);
  private final CANSparkMax m_rightMotor2 = new CANSparkMax(5, MotorType.kBrushless);
  private final CANSparkMax m_midMotor1 = new CANSparkMax(69, MotorType.kBrushless);
  
  public Drivebase() {
  
    m_rightMotor1.setInverted(true);
    m_rightMotor2.follow(m_rightMotor1);
    m_leftMotor1.setInverted(false);
    m_leftMotor2.follow(m_leftMotor1);
    m_midMotor1.setInverted(true);

    m_myRobot = new DifferentialDrive(m_leftMotor1, m_rightMotor1);
  }

  public void driveController(double left, double right) {
    m_myRobot.tankDrive(left, right);

    // System.out.println ("Debug Drivebase");
  }
  
  public void driveArcade(double forward, double turn) {
    m_myRobot.curvatureDrive(forward, turn, true);
  }

}