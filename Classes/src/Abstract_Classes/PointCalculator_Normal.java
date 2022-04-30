/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Classes;

/**
 *
 * @author leven
 */
public class PointCalculator_Normal extends PointCalculator
{
     @Override
     public void calculatePoints(int points)
    {
        System.out.println("Score: " + 0.9*points);   
    }
}
