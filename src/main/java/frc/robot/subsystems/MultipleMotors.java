/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.JoystickMove;
import frc.robot.subsystems.SimpleSubsystem;

public class MultipleMotors extends Subsystem implements SimpleSubsystem{
  SpeedController[] motors;

  public MultipleMotors(SpeedController[] motors){
    this.motors = motors;
  }

  public void move(double power){
    for (SpeedController m : this.motors) {
      m.set(power);
    }
  }

  @Override
  public void initDefaultCommand() {
    //setDefaultCommand();
  }
  public void initDefaultCommand(Command command) {
    setDefaultCommand(command);
  }
}
