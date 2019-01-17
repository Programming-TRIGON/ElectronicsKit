/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.subsystems.SimpleSubsystem;

public class MotorMove extends Command {
  double power;
  double time;
  SimpleSubsystem subsystem;

  public MotorMove(SimpleSubsystem subsystem, double power,double time) {
    requires((Subsystem)subsystem);
    this.power = power;
    this.time = time;
    this.subsystem = subsystem;
    setTimeout(time);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
   
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    this.subsystem.move(power);
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
   return isTimedOut();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    this.subsystem.move(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
