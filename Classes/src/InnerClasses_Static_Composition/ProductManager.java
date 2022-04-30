/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InnerClasses_Static_Composition;

/**
 *
 * @author leven
 */
public class ProductManager 
{
    public void add(Product product)
    {
        if(ProductValidator.isValid(product))
        {
            System.out.println("Product: " + product + " saved.");
        }
        else
        {
            System.out.println("Invalid product");
        }
    }
}
