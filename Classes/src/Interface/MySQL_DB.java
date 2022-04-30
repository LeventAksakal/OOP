/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author leven
 */
public class MySQL_DB implements IUserDAL
{
    @Override
    public void add()
    {
        System.out.println("MySQL veri tabanına eklendi.");
    }
    @Override
    public void show()
    {
        System.out.println("MySQL veri tabanından getirildi.");
    }
}
