// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  final TalonFX testTalon = new TalonFX(Constants.TESTTALONFX);

  final TalonFX frontLeftTalon = new TalonFX(Constants.FRONT_LEFT_TALON);
  final TalonFX backLeftTalon = new TalonFX(Constants.BACK_LEFT_TALON);
  final TalonFX frontRightTalon = new TalonFX(Constants.FRONT_RIGHT_TALON);
  final TalonFX backRightTalon = new TalonFX(Constants.BACK_RIGHT_TALON);

  public ExampleSubsystem() {

    testTalon.setInverted(false);

    frontLeftTalon.setInverted(true);
    backLeftTalon.setInverted(false);
    frontRightTalon.setInverted(true);
    backRightTalon.setInverted(false);

  }

  public void spinMotor() {
      
    if (testTalon.getSelectedSensorPosition() <= Constants.ROTATIONAL_CONSTANT * Constants.AUTO_DISTANCE) {

      testTalon.set(ControlMode.PercentOutput, 0.5);
      /*
      frontLeftTalon.set(ControlMode.PercentOutput, 0.5);
      backLeftTalon.set(ControlMode.PercentOutput, 0.5);
      frontRightTalon.set(ControlMode.PercentOutput, 0.5);
      backRightTalon.set(ControlMode.PercentOutput, 0.5);
      */
    }
    
  }

  public void zeroEncoder() {

    testTalon.setSelectedSensorPosition(0);

    frontLeftTalon.setSelectedSensorPosition(0);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
