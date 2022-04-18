
package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;
import frc.robot.Subsystems.Drivebase;
 /**
  @author Aahana Shrivastava
   */
public final class Main {
  private Main() {}

  public static void main(String... args) {
    RobotBase.startRobot(Drivebase::new);
  }
}
