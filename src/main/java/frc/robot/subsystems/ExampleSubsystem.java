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

  public ExampleSubsystem() {

    testTalon.setSelectedSensorPosition(0);

  }

  public void spinMotor() {
      
    testTalon.set(ControlMode.PercentOutput, 0.5);
    
  }

  public void zeroEncoder() {

    testTalon.setSelectedSensorPosition(0);
    
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
