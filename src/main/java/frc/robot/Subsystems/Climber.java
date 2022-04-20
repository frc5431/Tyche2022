package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMax.SoftLimitDirection;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.subsystems.Climber.ClimberBase.ClimberExtend;
import frc.robot.subsystems.Climber.ClimberBase.ClimberHinge;

import static java.lang.Math.max;
import static java.lang.Math.min;

 /**
  @author Aahana Shrivastava
   */

public class Climber extends SubsystemBase {

    ClimberBase climberExtend;
    private ClimberBase climberHinge;

    public Climber(CANSparkMax motorExtend, CANSparkMax motorHinge) {
        motorExtend.setInverted(false);
        motorExtend.setIdleMode(IdleMode.kBrake);
        motorHinge.setInverted(false);
        motorHinge.setIdleMode(IdleMode.kCoast);

        motorExtend.setSoftLimit(Constants.FORWARD_DIRECTION, 1);
        motorHinge.setSoftLimit(Constants.FORWARD_DIRECTION, 1);
        motorExtend.setSoftLimit(Constants.REVERSE_DIRECTION, 1);
        motorHinge.setSoftLimit(Constants.REVERSE_DIRECTION, 1);

        motorExtend.setSoftLimit(SoftLimitDirection.kForward, max(Constants.EXTEND_DOWN_LIMIT, Constants.EXTEND_UP_LIMIT));
        motorHinge.setSoftLimit(SoftLimitDirection.kForward, max(Constants.HINGE_CLOSE_LIMIT, Constants.HINGE_OPEN_LIMIT));
        motorExtend.setSoftLimit(SoftLimitDirection.kReverse, min(Constants.EXTEND_DOWN_LIMIT, Constants.EXTEND_UP_LIMIT));
        motorHinge.setSoftLimit(SoftLimitDirection.kReverse, min(Constants.HINGE_CLOSE_LIMIT, Constants.HINGE_OPEN_LIMIT));

       /**  climberExtend = new ClimberExtend(motorExtend);
        climberHinge = new ClimberHinge(motorHinge); */

    }

    public void setExtend(double speed) {
        climberExtend.set(speed);
    }

    public void setHinge(double speed) {
        climberHinge.set(speed);
    }

    public ClimberBase getExtend() {
        return climberExtend;
    }

    public ClimberBase getHinge() {
        return climberHinge;
    }

    public class ClimberBase extends SubsystemBase {
        protected CANSparkMax motor;

        public ClimberBase(CANSparkMax motor) {
            this.motor = motor;
        }

        public void set(double speed) {
            motor.set(speed);
        }

        public void calibrateMode(boolean value) {
            motor.setSoftLimit(SoftLimitDirection.kForward,0);
            motor.setSoftLimit(SoftLimitDirection.kReverse,0);
        
    }

    public class ClimberExtend extends ClimberBase {
        public ClimberExtend(CANSparkMax motor) {
            super(motor);

            Constants.tab_subsystems.addNumber("Climber Extend Position", () -> motor.getEncoder().getPosition())
                    .withPosition(15, 0)
                    .withSize(3, 1);
        }
    }

    public class ClimberHinge extends ClimberBase {
        public ClimberHinge(CANSparkMax motor) {
            super(motor);

            Constants.tab_subsystems.addNumber("Climber Hinge Position", () -> motor.getEncoder().getPosition())
                    .withPosition(15, 1)
                    .withSize(3, 1);
        }
    }
}



    }
