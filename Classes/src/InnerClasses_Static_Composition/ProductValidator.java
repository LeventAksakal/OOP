/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InnerClasses_Static_Composition;

/**
 *
 * @author leven
 */
public class ProductValidator 
{
    public static boolean isValid(Product product)
    {
        return product.price > 0 && !product.name.isBlank();
    }
}
