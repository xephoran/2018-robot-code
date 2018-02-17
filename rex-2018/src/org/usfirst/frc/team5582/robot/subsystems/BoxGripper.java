package org.usfirst.frc.team5582.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;

import org.usfirst.frc.team5582.robot.RobotMap;
import org.usfirst.frc.team5582.robot.commands.StopGripper;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 *
 */
public class BoxGripper extends Subsystem {
	WPI_TalonSRX gripperTalon;
	AnalogInput physicalSwitch;
	DigitalInput magneticSwitch;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//one rev robotics magnetic limit switch
	//one analog limit switch
	
	public BoxGripper(){
		
		gripperTalon = new WPI_TalonSRX(RobotMap.gripperCANTalon);
		
		//limit switches
		physicalSwitch = new AnalogInput(RobotMap.gripperPhysicalLimit);
		magneticSwitch = new DigitalInput(RobotMap.gripperMagneticLimit);
	}

	public void closeGripper() {
		//negative/positive is a guess at moment
		//need to look for a way to get current spike from Talon if possible to avoid destroying box
		//Talon has a current limit, which may stop it from crushing box
		//this limit can be configured with configPeakCurrentLimit if needed
		if(!(physicalSwitch.getValue() <1))
		{
		gripperTalon.set(0.1);
		}
	}
	
	public void openGripper(){
		if (!magneticSwitch.get())
		{
		gripperTalon.set(-0.1);
		}
	}
	
	public void stopGripper(){
		gripperTalon.set(0);
		SmartDashboard.putNumber("Box Gripper Physical Output: ", physicalSwitch.getVoltage());
		SmartDashboard.putNumber("Box Gripper Magnet Output: ", magneticSwitch.getAnalogTriggerTypeForRouting());
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new StopGripper());
    }
}

