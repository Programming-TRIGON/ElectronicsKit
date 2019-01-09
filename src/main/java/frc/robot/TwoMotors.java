/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class TwoMotors extends Subsystem {
  private SpeedController motor1;
  private SpeedController motor2;
  public TwoMotors (SpeedController motor1, SpeedController motor2){
    this.motor1 = motor1;
    this.motor2 = motor2;
  }
  public void moveBoth(double power){
    motor1.set(power);
    motor2.set(power);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
