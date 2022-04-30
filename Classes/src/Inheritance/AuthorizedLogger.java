
package Inheritance;


public class AuthorizedLogger extends BaseLogger
{
    public void log()
    {
        System.out.println("Çalışan kartınızın id numarasını giriniz");      
        in.nextLine();
        System.out.println("Giriş yapıldı.");
    }
}
