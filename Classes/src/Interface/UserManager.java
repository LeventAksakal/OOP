/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author leven
 */
public class UserManager 
{
    private IUserDAL userDal;
    public UserManager(IUserDAL userDal)
    {
        this.userDal = userDal;
    }
            
    public void add()
    {
        userDal.add();    
    }
    public void show()
    {
        userDal.show();
    }
}
