/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_game_units;

import EnemyAttacker.EnemyAttacker;
import EnemyAttacker.EnemyHuman;
import EnemyAttacker.EnemyRobot;
import EnemyAttacker.EnemyRobotAdapter;

/**
 *
 * @author Fettoukh Amine
 */
public class Adapter_Game_units {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnemyAttacker enemyhuman = new EnemyHuman();

        EnemyRobot enemyRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);

        System.out.println("The Robot\n");
        enemyRobot.smashWithHands();
        enemyRobot.FlyForward();
        enemyRobot.Repaire();


        System.out.println("\nThe Enemy Tank\n");
        enemyhuman.fireWeapon();
        enemyhuman.walkForward();
        enemyhuman.Heal();

        
        System.out.println("\nThe Robot with Adapter\n");
        robotAdapter.walkForward();
        robotAdapter.fireWeapon();
        robotAdapter.Heal();

    }
    
}
