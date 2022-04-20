
package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;
import frc.robot.subsystems.Drivebase;
 /**
  @author Aahana Shrivastava
   */
public final class Main {
  private Main() {}

  public static void main(String... args) {
    RobotBase.startRobot(Drivebase::new);
  }
}
