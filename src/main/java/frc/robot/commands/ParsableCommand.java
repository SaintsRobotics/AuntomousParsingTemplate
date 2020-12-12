/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ExampleSubsystem;

/**
 * A framework for the commands which can be called with the autonomous parser
 * some examples or use cases for this could be:
 * - distance to drive in a move command
 * - robot heading angles
 * - shooter RPMs 
 * - delays for commands
 */

 
public abstract class ParsableCommand extends CommandBase {
    
    /**
     * Default constructor 
     * This constructor is not compatible with the rest of the autonomous parsing framework.
     * 
     */
    public ParsableCommand() {
       
    }
    /**
     * Constructor to be used with autonomous parsing
     * @param param the parameters for the command passed in by the user
     */
    public ParsableCommand (String param) {
       this.parse();
    }

    /**
     * Separates the parameters out
     * See ZeroParameterCommand, OneParameterCommand, ManyParameterCommand for examples of the parse method.
     * 
     * YOU NEED TO IMPLEMENT THIS METHOD FOR EACH INDIVIDUAL COMMAND
     */
    public abstract void parse ();

}