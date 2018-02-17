package org.usfirst.frc.team5582.robot.subsystems;

import org.usfirst.frc.team5582.robot.RobotMap;
import org.usfirst.frc.team5582.robot.commands.ArcadeDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.drive.*;
import edu.wpi.first.wpilibj.Spark;

/**
 *
 */

//supressing depreciation warning until I can understand why only 1 of the new drive types will allow import
@SuppressWarnings("deprecation")


public class DriveTrain extends Subsystem {

	//setting up drive class instance and speed controllers
    RobotDrive rexDrive;
	Spark leftSparkA;
	Spark leftSparkB;
	Spark rightSparkA;
	Spark rightSparkB;
	//TODO set up a pwm encoder
		
	    public DriveTrain() {
	    	// Drivetrain setup
			leftSparkA = new Spark(RobotMap.leftSparkA);
			leftSparkB = new Spark(RobotMap.leftSparkB);
			rightSparkA = new Spark(RobotMap.rightSparkA);
			rightSparkB = new Spark(RobotMap.rightSparkB);
			//possibly depreciated, but included as the main drive type in FRC Control systems???
			rexDrive = new RobotDrive(leftSparkA,leftSparkB,rightSparkA,rightSparkB);
	    }
	    
	    public void arcadeDrive(double leftY, double leftX) {
    		//also depreciated but given as reference on frc site?
    		rexDrive.arcadeDrive(leftY, leftX);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ArcadeDrive());
    }
}
