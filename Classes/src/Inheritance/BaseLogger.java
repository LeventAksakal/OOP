
package Inheritance;
import java.util.Scanner;

public class BaseLogger 
{
    Scanner in = new Scanner(System.in);
            
    public void log()
    {
        System.out.println("e-posta giriniz.");
        in.nextLine();
        System.out.println("Şifre giriniz");
        in.nextLine();
        System.out.println("Giriş yapıldı");
    }
}
