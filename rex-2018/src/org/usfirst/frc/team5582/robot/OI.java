/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5582.robot;
import org.usfirst.frc.team5582.robot.subsystems.*;
import org.usfirst.frc.team5582.robot.commands.*;

import edu.wpi.first.wpilibj.DriverStation;
//import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	public static DriverStation driverStation;
	public static XboxController xboxControllerOne;
	public static XboxController xboxControllerTwo;
	//button definitions
	public static Button elevatorUpButton;
	public static Button elevatorDownButton;
	public static Button gripperCloseButton;
	public static Button gripperOpenButton;
	public static Button manipulatorLeftButton;
	public static Button manipulatorRightButton;
	
	public static void init()
	{
		driverStation = DriverStation.getInstance();
		
		// Tank controls
		xboxControllerOne = new XboxController(RobotMap.xboxControllerOne);
		xboxControllerTwo = new XboxController(RobotMap.xboxControllerTwo);
		xboxControllerOne.setDeadZone(0.1); //deadzone kept the same as last year for time being
		/** BUTTONS **/
		//all are temporary for now, just setting layout randomly for test
		elevatorUpButton = xboxControllerOne.a;
		elevatorDownButton = xboxControllerOne.b;
		gripperCloseButton = xboxControllerOne.x;
		gripperOpenButton = xboxControllerOne.y;
		manipulatorLeftButton = xboxControllerOne.lb;
		manipulatorRightButton= xboxControllerOne.rb;
		
		//commands
		elevatorUpButton.whileHeld(new ElevatorUp());
		elevatorDownButton.whileHeld(new elevatorDown());
		gripperCloseButton.whileHeld(new CloseGripper());
		gripperOpenButton.whileHeld(new CloseGripper());
		manipulatorLeftButton.whileHeld(new ManipulatorPivotLeft());
		manipulatorRightButton.whileHeld(new ManipulatorPivotRight());
		
		
	}	
	
}
