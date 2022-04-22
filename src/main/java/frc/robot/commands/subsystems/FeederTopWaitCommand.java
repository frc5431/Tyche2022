package frc.robot.commands.subsystems;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Systems;
import frc.robot.subsystems.Feeder;
import frc.team5431.titan.core.misc.Logger;

public class FeederTopWaitCommand extends CommandBase {
        private final Feeder feeder;
        private final boolean reverse;
        private final double speed;
    
        public FeederTopWaitCommand(Systems systems, boolean reverse) {
            this(systems, Feeder.DEFAULT_SPEED_TOP*0.5, reverse);
        }
    
        public FeederTopWaitCommand(Systems systems, double speed) {
            this(systems, speed, false);
        }
    
        public FeederTopWaitCommand(Systems systems, double speed, boolean reverse) {
            this.feeder = systems.getFeeder();
            this.reverse = reverse;
            this.speed = speed;
    
            addRequirements(feeder.getTop());
        }
    
        private void addRequirements(VictorSPX top) {
        }

        @Override
        public void initialize() {
    
        }
        
        @Override
        public void execute() {
                feeder.setTop(reverse ? -speed : speed);
        }
    
        @Override
        public void end(boolean interrupted) {
            Logger.l("Feeder Top Command Done");
            feeder.setTop(0);
        }
        
        @Override
        public boolean isFinished() {
            return false;
        }
    }
    

