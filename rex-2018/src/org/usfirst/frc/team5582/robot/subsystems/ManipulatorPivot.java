package org.usfirst.frc.team5582.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import org.usfirst.frc.team5582.robot.RobotMap;
import org.usfirst.frc.team5582.robot.commands.ManipulatorPivotStop;

/**
 *
 */
public class ManipulatorPivot extends Subsystem {

	//devices setup
	WPI_TalonSRX manipulatorTalon;
	
	public ManipulatorPivot()
	{
		manipulatorTalon = new WPI_TalonSRX(RobotMap.manipulatorCANTalon);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void pivotRight()
	{
		manipulatorTalon.set(0.1);
	}
	
	public void pivotLeft()
	{
		manipulatorTalon.set(-0.1);
	}
	
	public void pivotStop()
	{
		manipulatorTalon.set(0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ManipulatorPivotStop());
    }
}

