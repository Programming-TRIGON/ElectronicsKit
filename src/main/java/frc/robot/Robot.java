/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalSource;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableBuilder;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.JoystickMove;
import frc.robot.subsystems.MultipleMotors;


public class Robot extends TimedRobot {
  static final MultipleMotors ss= new MultipleMotors(new VictorSP[] {new VictorSP(0), new VictorSP(1)});
  OI oi = new OI();
  
  @Override
  public void robotInit() {
    Robot.ss.initDefaultCommand(new JoystickMove(ss, this.oi.xbox));
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
}

