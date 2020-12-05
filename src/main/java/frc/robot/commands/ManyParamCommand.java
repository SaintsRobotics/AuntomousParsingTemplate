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
public class ManyParamCommand extends ParsableCommand {
    private final ExampleSubsystem m_subsystem;

    String a;

    public ManyParamCommand(ExampleSubsystem subsystem) {
        m_subsystem = subsystem;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
      }

    public ManyParamCommand(String params, ExampleSubsystem subsystem) {
        m_subsystem = subsystem;
        a = params;
    }

    
    @Override
    public void initialize() {
        SmartDashboard.putString("ManyParamCommand Parameters: " + a, a);
    }

    @Override
    public void execute() {

    }
    
    public boolean isFinished(){
        return true;
    }

    @Override
    public void parse() {
        // TODO Auto-generated method stub

    }

}