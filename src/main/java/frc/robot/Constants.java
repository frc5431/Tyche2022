package frc.robot;

import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.TalonFXConfiguration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;

public class Constants {
    public static final TalonFXInvertType REVERSE = TalonFXInvertType.CounterClockwise;
    public static final TalonFXInvertType FORWARD = TalonFXInvertType.Clockwise;

    public static final NeutralMode NEUTRAL_MODE = null;
    public static final double RAMPING_FROM_0_TO_FULL = 0;
    public static final double KP = 0;
    public static final double KI = 0;
    public static final double KD = 0;
    public static final double KF = 0;

    public static final ControlMode Velocity = null;
    public static final String tab_subsystems = null;
}
