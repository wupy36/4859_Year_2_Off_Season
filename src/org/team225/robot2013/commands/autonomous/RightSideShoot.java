/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team225.robot2013.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.team225.robot2013.commands.LEDSet;
import org.team225.robot2013.commands.shooter.HoldTurretAtSetpoint;
import org.team225.robot2013.commands.shooter.SafeFeedFrisbee;
import org.team225.robot2013.commands.shooter.SetAngle;
import org.team225.robot2013.commands.shooter.SetFlywheel;
import org.team225.robot2013.commands.shooter.SetTurret;
import org.team225.robot2013.commands.shooter.StowShooter;
import org.team225.robot2013.commands.shooter.WaitForTurret;

/**
 *
 * @author Andrew
 */
public class RightSideShoot extends CommandGroup {
    public RightSideShoot()
    {
        addSequential(new SetFlywheel(0.0145, 0.007));
        addSequential(new SetAngle(true));
        addSequential(new SetTurret(661));
        addParallel(new HoldTurretAtSetpoint(661));
        addSequential(new WaitForTurret());
        
        addSequential(new LEDSet(LEDSet.GREEN));
        
        addSequential(new SafeFeedFrisbee());
        addSequential(new SafeFeedFrisbee());
        addSequential(new SafeFeedFrisbee());
        addSequential(new SafeFeedFrisbee());
        addSequential(new SafeFeedFrisbee());
        addSequential(new SafeFeedFrisbee());
        addSequential(new SafeFeedFrisbee());
        addSequential(new SafeFeedFrisbee());
        
        addSequential(new LEDSet(LEDSet.RED));
        
        addSequential(new StowShooter());
    }
}
