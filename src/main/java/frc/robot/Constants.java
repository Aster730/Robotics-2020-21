/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //Xbox controller port
    public static final int kControllerPort = 0;

    //drivetrain ports
    public static final int kLFrontWheelPort = 1;
    public static final int kRFrontWheelPort = 3;
    public static final int kLBackWheelPort = 2;
    public static final int kRBackWheelPort = 4;

    //shooter port
    public static final int kShooterPort = 5;

    //compressor port
    public static final int compressorModule = 20;

    //solenoid ports
    public static final int leftPistonPort = 0;
    public static final int rightPistonPort = 1;

    //shooter voltages
    public static final int intakeVolts = -4;
    public static final int shooterVolts = 12;
}
