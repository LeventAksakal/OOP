
package classes;
import java.util.Scanner;

public class Classes 
{
    public static void main(String[] args) 
    {
        Basic_Arithmetic fourOperations = new Basic_Arithmetic();
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int result = fourOperations.multiply(x, y);
        System.out.println("x * y : " + result);
    } 
}
