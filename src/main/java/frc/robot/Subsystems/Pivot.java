package frc.robot.subsystems;

import static java.lang.Math.max;
import static java.lang.Math.min;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
/**
 * @author Aahana Shrivastava
 */
public class Pivot extends SubsystemBase {
       // private VictorSPX pivotMotor;
        private final VictorSPX pivotMotor = new VictorSPX(10);

    public static final double PIVOT_DOWN_LIMIT = -42000; // -45k // -49k
    public static final double PIVOT_UP_LIMIT = 0;

public Pivot(VictorSPX pivotMotor) {
    this.pivotMotor.configForwardSoftLimitEnable(true);
    this.pivotMotor.configForwardSoftLimitThreshold(max(PIVOT_UP_LIMIT, PIVOT_DOWN_LIMIT));
    this.pivotMotor.configReverseSoftLimitEnable(true);
    this.pivotMotor.configReverseSoftLimitThreshold(min(PIVOT_UP_LIMIT, PIVOT_DOWN_LIMIT));
}

public void calibrateMode(boolean value) {
    this.pivotMotor.configForwardSoftLimitEnable(!value);
    this.pivotMotor.configReverseSoftLimitEnable(!value);
}

public void reset() {
    this.pivotMotor.setSelectedSensorPosition(0);

    
}

}
