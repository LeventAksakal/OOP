/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Classes;

/**
 *
 * @author leven
 */
public abstract class PointCalculator 
{
    public abstract void calculatePoints(int points);
    public final void gameOver()
    {
        System.out.println("Game Over");
    }
}
