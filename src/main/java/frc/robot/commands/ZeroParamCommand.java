package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ExampleSubsystem;

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/



/**
 * A mock version of the  Command
 */
public class ZeroParamCommand extends ParsableCommand {
    private final ExampleSubsystem m_subsystem;

    String inputParam;

    public ZeroParamCommand(ExampleSubsystem subsystem) {
        m_subsystem = subsystem;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
    }

    public ZeroParamCommand(String params, ExampleSubsystem subsystem) {
        m_subsystem = subsystem;
        addRequirements(subsystem);
        inputParam = params;
    }

    public void parse () { 
        
    }
    
    @Override
    public void initialize() {
        SmartDashboard.putString("OneParamCommand Parameter: " + inputParam, inputParam);
    }

    @Override
    public void execute() {

    }
    
    public boolean isFinished(){
        return true;
    }

}