/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author leven
 */
/*
OOP projelerinde katmanlı bir yapı vardır; Interface, Manage, DAL(Data Access Layer). Bu katmanlar arasındaki iletişimi çoğunlukla interface
ile sağlarız çünkü interface'ler yanlızca referans tutar, tanımladığı metotları bu interface'i implement eden classlar belirler. Ayrıca
bir class birden fazla interface implement edebilirken ancak bir class'ı inherit edebilir.
Bu pakette DAL ve Manage katmanı var. DB class'larıyla Manage class'ı arasında iletişimi IUserDAL interface'i sağlıyor.
*/
public class Main 
{
    public static void main(String[] args)
    {
        /*
        AbstractClassesPractise'te yapılan yöntemle yapılsaydı:
        
        UserManager userManage = new UserManager();
        
        userManage.userDal = new MySQL_DB();
        userManage.add();
        userManage.show();
        
        System.out.println("********");
        
        userManage.userDal = new Oracle_DB();
        userManage.add();
        userManage.show();
        */
        //UserManager'daki IUserDAL'ı tanımlayıp kullanmaktansa parametre olarak verebiliriz.
        
        UserManager userManage = new UserManager(new Oracle_DB());
        userManage.add();
        userManage.show();
        
        System.out.println("*******");
        
        UserManager userManage1 = new UserManager(new MySQL_DB());
        userManage1.add();
        userManage1.show();
        
    }
}
