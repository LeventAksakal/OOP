/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InnerClasses_Static_Composition;

/**
 *
 * @author leven
 */
public class Main 
{
    public static void main(String[] args)
    {
        Product[] products = new Product[3];
        products[0].name = "Steel Series Arctic 7";
        products[0].price = 1000;
        
        products[1].name = "  ";
        products[1].price = 234;
        
        products[2].name = "Acer Nitro 5";
        products[2].price = -156;
        
        ProductManager productManager = new ProductManager();
        for (Product product:products)
        {
            productManager.add(product);
        }
    }
}
