/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5582.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

import java.awt.image.DataBufferShort;

import org.usfirst.frc.team5582.robot.commands.*;
import org.usfirst.frc.team5582.robot.subsystems.BoxGripper;
import org.usfirst.frc.team5582.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5582.robot.subsystems.Elevator;
import org.usfirst.frc.team5582.robot.subsystems.ManipulatorPivot;
import org.usfirst.frc.team5582.robot.OI;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 * 

 */

public class Robot extends IterativeRobot {

	//need to initialize Subsystem instances here now instead of in CommandBase?
	public static final DriveTrain driveTrain = new DriveTrain();
	public static final Elevator elevator = new Elevator();
	public static final BoxGripper boxGripper = new BoxGripper();
	public static final ManipulatorPivot manipulatorPivot = new ManipulatorPivot();
	
    Command firstCommand;
    Command autonomousCommand;
    SendableChooser autoChooser;
    String[] autoChoices;
    SmartDashboard dash;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	dash = new SmartDashboard();
		autoChooser = new SendableChooser();
		autoChoices = new String[]{
				"NOT YET IMPLEMENTED"
				
		};
		dash.putStringArray("Auto List", autoChoices);
   }
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){
    		
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
    	
    	String autoSelection = new String(dash.getString("Auto Selector", "simple"));
    	SmartDashboard.putString("Autonomous mode", autoSelection);
    }
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
       Scheduler.getInstance().run();
    }

    public void teleopInit() {
        Scheduler.getInstance().add(firstCommand);
        SmartDashboard.putData(Scheduler.getInstance());
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
