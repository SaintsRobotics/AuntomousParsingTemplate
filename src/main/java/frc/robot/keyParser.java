/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.ManyParameterCommand;
import frc.robot.commands.OneParameterCommand;
import frc.robot.commands.ZeroParameterCommand;
import frc.robot.subsystems.ExampleSubsystem;


/**
 * Do NOT add any static variables to this class, or any initialization at all.
 * Unless you know what you are doing, do not modify this file except to change
 * the parameter class to the startRobot call.
 */
public class KeyParser {
    private static SequentialCommandGroup group;
    private static String[] keyArray;

    /**
     * This function separates a string input from the user into a sequence of 
     * commands. 
     * @param rawInput the input from the user to be parsed
     * @return the sequence of commands to be run in autonomous 
     * 
     */
    public static SequentialCommandGroup parse(String rawInput) {
        keyArray = rawInput.split("; ");
        group = new SequentialCommandGroup();
        
        for (String key : keyArray) {
        
            String[] arr = key.split("@"); // keys will be formatted: ID@params 
            String ID = arr[0];
            String params = "";
            if(arr.length > 1){
                params = arr[1];
            }

            if (ID.equals("zero")) {
                group.addCommands(new ZeroParameterCommand(params, new ExampleSubsystem()));
            } else if (ID.equals("one")) {                
                group.addCommands(new OneParameterCommand(params, new ExampleSubsystem()));
            } else if (ID.equals("many")) {
                group.addCommands(new ManyParameterCommand(params, new ExampleSubsystem()));
            }
            // continue chaining if-else statements for each key
            
        }
        return group;
    }
}
