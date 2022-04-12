package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team5431.titan.core.joysticks.LogitechExtreme3D;

public class Pivot {
    public class Drivebase extends TimedRobot {
        private LogitechExtreme3D operator;
        Math power;

        private final CANSparkMax pivotMotor = new CANSparkMax(5, MotorType.kBrushless);
}