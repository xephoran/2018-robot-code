package org.usfirst.frc.team5582.robot.commands;

import org.usfirst.frc.team5582.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ManipulatorPivotLeft extends Command {

    public ManipulatorPivotLeft() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.manipulatorPivot);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.manipulatorPivot.pivotLeft();
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.manipulatorPivot.pivotStop();
    }
}