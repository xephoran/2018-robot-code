/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5582.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	//xbox controllers
	public static int xboxControllerOne = 0;
	public static int xboxControllerTwo = 1;
	
	//Drive Train Sparks
	public static int leftSparkA = 1;
    public static int leftSparkB = 2;
    public static int rightSparkA = 3;
    public static int rightSparkB = 4;
    
    //Talons
    public static int gripperCANTalon = 1;
    public static int elevatorCANTalon = 5;
    public static int manipulatorCANTalon = 6;
    
    //Analog
    public static int gripperPhysicalLimit = 1;
    
    //Digital
    public static int gripperMagneticLimit = 1;
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
