package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.SoftLimitDirection;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.team5431.titan.core.joysticks.LogitechExtreme3D; 

/**
 * @author Aahana Shrivastava
 */
public class Pivot {
        private CANSparkMax pivotMotor;

    public static final double PIVOT_DOWN_LIMIT = -42000; // -45k // -49k
    public static final double PIVOT_UP_LIMIT = 0;

public Pivot(CANSparkMax pivotMotor) {
    this.pivotMotor = pivotMotor;
    this.pivotMotor.enableSoftLimit(SoftLimitDirection.kForward, true);
    this.pivotMotor.enableSoftLimit(SoftLimitDirection.kReverse, true);
    this.pivotMotor.setSoftLimit(SoftLimitDirection.kForward, 100);
    this.pivotMotor.setSoftLimit(SoftLimitDirection.kReverse, 100);

}

public void calibrateMode(boolean value) {
    this.pivotMotor.enableSoftLimit(SoftLimitDirection.kForward, !value);
    this.pivotMotor.enableSoftLimit(SoftLimitDirection.kReverse, !value);
}

public void reset() {
    this.pivotMotor.getEncoder().setPosition(0);
}

}
