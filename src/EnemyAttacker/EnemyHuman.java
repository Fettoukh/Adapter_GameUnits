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

public class EnemyHuman implements EnemyAttacker {

    Random generator = new Random();

    @Override
    public void fireWeapon() 
    {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Human did " + attackDamage + " Damage");

    }

    @Override
    public void walkForward() 
    {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Human moved " + movement + " spaces");
    }

    @Override
    public void Heal() 
    {
        int health = generator.nextInt(5) + 1;
        System.out.println("Enemy Human healed himself restaured " + health + " health");    }
    
}
