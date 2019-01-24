/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DoubleSolenoidSubsystem extends Subsystem {

  private DoubleSolenoid doubleSolenoid;

  public DoubleSolenoidSubsystem(DoubleSolenoid doubleSolenoid){
    this.doubleSolenoid=doubleSolenoid;
  }

  public void movePiston(){
    if(this.doubleSolenoid.get()==Value.kForward)
      this.doubleSolenoid.set(Value.kReverse);
    else
      this.doubleSolenoid.set(Value.kForward);
  }
  @Override
  public void initDefaultCommand() {

  }
}
