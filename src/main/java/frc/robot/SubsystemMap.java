package frc.robot;

import frc.robot.subsystems.ExampleSubsystem;

/**
 * A way for all of the subsystems to be publicly available.
 */
public class SubsystemMap {
	public static ExampleSubsystem exampleSubsystem;
	
	/**
	 * This method must be called inside Robot.robotInit() and it must construct all
	 * of the subsystems.
	 */
	public SubsystemMap() {
        exampleSubsystem = new ExampleSubsystem();
	}
}
