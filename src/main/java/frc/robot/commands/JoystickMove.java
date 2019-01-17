package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.subsystems.SimpleSubsystem;

public class JoystickMove extends Command {
  XboxController xbox;
  SimpleSubsystem subsystem;
  
  public JoystickMove(SimpleSubsystem subsystem, XboxController xbox) {
    requires((Subsystem)subsystem);
    this.xbox = xbox;
    this.subsystem = subsystem;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
   
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    this.subsystem.move(this.xbox.getY());
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
   return false;
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
