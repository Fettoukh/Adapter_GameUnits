/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnemyAttacker;

/**
 *
 * @author Fettoukh Amine
 */
public class EnemyRobotAdapter implements EnemyAttacker{
    
    EnemyRobot theRobot;
    
    public EnemyRobotAdapter(EnemyRobot newRobot)
    {
        theRobot = newRobot;
    }

    public void fireWeapon() 
    {
        theRobot.smashWithHands();
    }
    

    public void Heal() 
    {
        theRobot.Repaire();
    }

    @Override
    public void walkForward() 
    {
        theRobot.FlyForward();   
    }

}
