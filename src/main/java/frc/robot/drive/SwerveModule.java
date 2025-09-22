package frc.robot.drive;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.AnalogInput;
import frc.robot.Constants;

public class SwerveModule {
    private final TalonSRX driveMotor;
    private final TalonSRX turningMotor;

    private final PIDController turningPidController;

    private final AnalogInput absoluteEncoder;
    private double absoluteEncoderOffsetRad = 0;
    private boolean absoluteEncoderInverted = false;

    public SwerveModule(TalonSRX driveMotor, TalonSRX turningMotor, AnalogInput absoluteEncoder) {
        this.driveMotor = driveMotor;
        this.turningMotor = turningMotor;
        this.absoluteEncoder = absoluteEncoder;

        this.turningPidController = new PIDController(Constants.kPTurning, 0, 0);
    }

    public SwerveModule setAbsoluteEncoderOffsetRad(double offsetRad) {
        this.absoluteEncoderOffsetRad = offsetRad;
        return this;
    }

    public SwerveModule setAbsoluteEncoderInverted(boolean isInverted) {
        this.absoluteEncoderInverted = isInverted;
        return this;
    }

    public SwerveModule setDriveMotorInverted(boolean isInverted) {
        this.driveMotor.setInverted(isInverted);
        return this;
    }

    public SwerveModule setTurningMotorInverted(boolean isInverted) {
        this.turningMotor.setInverted(isInverted);
        return this;
    }
}
