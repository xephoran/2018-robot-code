package org.usfirst.frc.team5582.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5582.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


/**
 *
 */
public class Elevator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//device setup
	WPI_TalonSRX elevatorTalon;
	//TODO set up pwm encoder?
	
	
	
	public Elevator()
	{
		elevatorTalon = new WPI_TalonSRX(RobotMap.elevatorCANTalon);
	}

	public void elevatorUp()
	{
		elevatorTalon.set(0.1);
	}
	
	public void elevatorStop()
	{
		elevatorTalon.set(0);
	}
	
	public void elevatorDown()
	{
		elevatorTalon.set(-0.1);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

}

