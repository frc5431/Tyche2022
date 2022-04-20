package frc.robot;

import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.TalonFXConfiguration;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.VictorSPXConfiguration;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.SoftLimitDirection;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;

/**
  @author Aahana Shrivastava
   */

public class Constants {
    public static final TalonFXInvertType REVERSE = TalonFXInvertType.CounterClockwise;
    public static final TalonFXInvertType FORWARD = TalonFXInvertType.Clockwise;

    public static final NeutralMode NEUTRAL_MODE = null;
    public static final double RAMPING_FROM_0_TO_FULL = 0;
    public static final double KP = 0;
    public static final double KI = 0;
    public static final double KD = 0;
    public static final double KF = 0; 
 
    public static final ShuffleboardTab tab_subsystems = Shuffleboard.getTab("Subsystems");
    public static final SoftLimitDirection FORWARD_DIRECTION = SoftLimitDirection.kForward;
    public static final SoftLimitDirection REVERSE_DIRECTION = SoftLimitDirection.kReverse;

        
    public static final int EXTEND_DOWN_LIMIT = 0;
    public static final int EXTEND_UP_LIMIT = 0;
    public static final int HINGE_CLOSE_LIMIT = 0;
    public static final int HINGE_OPEN_LIMIT = 0;
    public static final double CAMERA_HEIGHT_METERS = 0;
    public static final double TARGET_HEIGHT_METERS = 0;
    public static final double CAMERA_PITCH_RADIANS = 0;
    public static final int ID_FEEDER_BOTTOM = 0;
    public static final int ID_FEEDER_TOP = 0;
    public static final int ID_SHOOTER_LEFT = 0;
    public static final int ID_SHOOTER_RIGHT = 0;
    public static final int ID_INTAKE = 0;
    public static final int ID_PIVOT = 0;
    public static final int ID_CLIMBER_EXTEND = 0;
    public static final int ID_CLIMBER_HINGE = 0;
    public static final int SLOT_ANGLER = 0;
    public static final int SLOT_FEEDER_SENSOR = 0;

    }


