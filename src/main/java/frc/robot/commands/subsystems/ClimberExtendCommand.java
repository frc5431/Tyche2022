/**package frc.robot.commands.subsystems;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Systems;
import frc.robot.subsystems.Climber;
import frc.team5431.titan.core.misc.Logger;

public class ClimberExtendCommand extends CommandBase {
    private final Climber climber;
    private final boolean reverse;
	private final DoubleSupplier supplier;

    public ClimberExtendCommand(Systems systems, boolean reverse) {
        this(systems, () -> Climber.DEFAULT_SPEED_EXTEND, reverse);
    }

    public ClimberExtendCommand(Systems systems, double speed) {
        this(systems, () -> speed, false);
    }

    public ClimberExtendCommand(Systems systems, DoubleSupplier supplier) {
        this(systems, supplier, false);
    }

    public ClimberExtendCommand(Systems systems, DoubleSupplier supplier, boolean reverse) {
        this.climber = systems.getClimber();
        this.reverse = reverse;
		this.supplier = supplier;

        addRequirements(climber.getExtend());
    }

    public ClimberExtendCommand(Systems systems, Object object, boolean reverse2) {
    }

    public ClimberExtendCommand(Systems systems, Object object, boolean reverse2) {
    }

    public ClimberExtendCommand(Systems systems, Object object, boolean reverse2) {
    }

    @Override
    public void initialize() {

	}
	
	@Override
	public void execute() {
        double value = supplier.getAsDouble();
        climber.setExtend(reverse ? -value : value);
	}

    @Override
    public void end(boolean interrupted) {
        Logger.l("Climber Extend Command Done");
        climber.setExtend(0);
    }
    
    @Override
    public boolean isFinished() {
        return false;
    }
}
*/
