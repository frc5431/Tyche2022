package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import org.photonvision.PhotonCamera;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;
import frc.robot.subsystems.*;

public class Systems {
    private WPI_TalonFX shooterLeft;
    private WPI_TalonFX shooterRight;

    private Servo anglerServo;
    private Drivebase drivebase;

    private Feeder feeder;
    private Shooter shooter;
    private Intake intake;
    private Pivot pivot;
    private Climber climber;
    private Angler angler;

    private PhotonCamera camera;

  //  private Blinkin led;

    public Systems() {

        drivebase = new Drivebase();

        // shooter = new Shooter(shooterLeft, shooterRight);
        // angler = new Angler(anglerServo);
    }

    public Drivebase getDrivebase() {
        return drivebase;
    }

    public Feeder getFeeder() {
        return feeder;
    }

    public Shooter getShooter() {
        return shooter;
    }

    public Intake getIntake() {
        return intake;
    }

    public Pivot getPivot() {
        return pivot;
    }

    public Climber getClimber() {
        return climber;
    }  

    public Angler getAngler() {
        return angler;
    }

    public PhotonCamera getCamera() {
        return camera;
    }
}
