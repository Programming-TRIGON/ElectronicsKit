/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.commands.JoystickMove;
import frc.robot.subsystems.DoubleSolenoidSubsystem;
import frc.robot.subsystems.MultipleMotors;


public class Robot extends TimedRobot {
  OI oi = new OI();
  static final Compressor compressor = new Compressor();
  static final MultipleMotors multipleMotors = new MultipleMotors(new VictorSP[] {new VictorSP(0)});
  public static final DoubleSolenoidSubsystem doubleSolenoidSubsystem = new DoubleSolenoidSubsystem(new DoubleSolenoid(0, 1));
  @Override

  public void robotInit() {
    Robot.multipleMotors.initDefaultCommand(new JoystickMove(multipleMotors, this.oi.xbox));
    compressor.start();
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
}

