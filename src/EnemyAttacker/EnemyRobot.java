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

import java.util.Random;

public class EnemyRobot {
    Random generator = new Random();
    
    public void smashWithHands() {

        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");

    }

    public void FlyForward() 
    {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot flied Forward " + movement + " spaces");

    }

    public void Repaire()
    {
        int health = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot repaired himself and restaured " + health + " health");
    }

    
}
