package frc.robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.TimedRobot;

 /**
  @author Aahana Shrivastava
   */
public class Intake extends TimedRobot {

    public static final double DEFAULT_SPEED = 1.0;
    public static final boolean REVERSE = false;
    public static final NeutralMode NEUTRALMODE = NeutralMode.Coast;
    public static final double RAMPING_FROM_0_TO_FULL = 0.0; // 0.5

    private CANSparkMax intakeMotor;

    public Intake(CANSparkMax motor) {
        intakeMotor = motor;
        intakeMotor.setInverted(REVERSE);

    }

    public void setSpeed(double speed) {
        intakeMotor.set(speed);
    }
}

