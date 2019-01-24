package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ToggleSolenoid;


public class OI{
    XboxController xbox;
    Button AButton;
    public OI(){
        this.xbox = new XboxController(0);
        this.AButton = new JoystickButton(xbox, 1);
        AButton.whenPressed(new ToggleSolenoid());
    }
}