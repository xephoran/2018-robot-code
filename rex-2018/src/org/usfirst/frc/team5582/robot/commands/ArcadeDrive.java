package org.usfirst.frc.team5582.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5582.robot.OI;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5582.robot.Robot;

/**
 *
 */
public class ArcadeDrive extends Command {

	
    public ArcadeDrive() {
    		requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        SmartDashboard.putData(this);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		//Robot.driveTrain.arcadeDrive(OI.xboxControllerOne.leftStick.getY(),
    		//OI.xboxControllerOne.leftStick.getX());
		
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
    }
}
