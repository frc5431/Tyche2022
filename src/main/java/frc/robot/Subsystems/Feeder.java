package frc.robot.Subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
 /**
  @author Aahana Shrivastava
   */
public class Feeder extends SubsystemBase {

    public static final double DEFAULT_SPEED_BOTTOM = 1.0;  // 0.9 // 0.7 // 0.6
    public static final double DEFAULT_SPEED_TOP = 1.0; // 1.0 // 0.8
    public static final double DEFAULT_SPEED_MID = 1.0; // TBD
    public static final NeutralMode NEUTRALMODE = NeutralMode.Brake;
    public static final boolean REVERSE_BOTTOM = false;
    public static final boolean REVERSE_TOP = true;
    public static final boolean REVERSE_MID = false;

    VictorSPX feederBottom;
    private VictorSPX feederTop, feederMid;
    private static final VictorSPXControlMode VictorSPXControlMode = null;
    private static final VictorSPX motor = null;

    public Feeder (int motorBottom, int motorTop, int motorMid) {

        feederBottom = new VictorSPX(motorBottom);
        feederTop = new VictorSPX(motorTop);
        feederMid = new VictorSPX(motorMid);

    }

    public void setBottom(double speed) {
        feederBottom.set(VictorSPXControlMode, speed);
    }

    public void setTop(double speed) {
        feederTop.set(VictorSPXControlMode, speed);
    }

    public void setMid(double speed) {
        feederTop.set(VictorSPXControlMode, speed);
    }

    public VictorSPX getBottom() {
        return feederBottom;
    }
    public VictorSPX getTop() {
        return feederTop;
    }

    public VictorSPX getMid() {
        return feederMid;
    }

    public class FeederBase {
        protected VictorSPX motor;

        public FeederBase(VictorSPX motor) {
            this.motor = motor;
        }
    }

        public void set(double speed) {
            motor.set(ControlMode.PercentOutput, speed);
        }

    public class Bottom extends FeederBase {
        public Bottom(VictorSPX motor) {
            super(motor);
        }
    }

    public class Top extends FeederBase {
        public Top(VictorSPX motor) {
            super(motor);
            
        }
    }
    public class Mid extends FeederBase {
            public Mid(VictorSPX motor) {
                super(motor);
            }
    }
}

  

