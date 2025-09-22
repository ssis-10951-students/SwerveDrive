package frc.robot;

import edu.wpi.first.util.sendable.Sendable;
import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj.drive.RobotDriveBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

// Based on the WPILib DifferentialDrive implementation
public class SwerveDrive extends RobotDriveBase implements Sendable, AutoCloseable {
    private final MotorController motorTopLeft;
    private final MotorController motorTopRight;
    private final MotorController motorBottomLeft;
    private final MotorController motorBottomRight;

    public SwerveDrive(
        MotorController motorTopLeft,
        MotorController motorTopRight,
        MotorController motorBottomLeft,
        MotorController motorBottomRight
    ) {
        this.motorTopLeft = motorTopLeft;
        this.motorTopRight = motorTopRight;
        this.motorBottomLeft = motorBottomLeft;
        this.motorBottomRight = motorBottomRight;
    }

    @Override
    public String getDescription() {
      return "SwerveDrive";
    }

    @Override
    public void stopMotor() {
        
    }

    @Override
    public void initSendable(SendableBuilder builder) {
        // not yet implemented
    }

    @Override
    public void close() throws Exception {
        // not yet implemented
    }
}
