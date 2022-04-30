/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Classes;

/**
 *
 * @author leven
 */
/*
Oyunlardaki puanlama sistemini ele alalım. BO2 Zombies mesela. Oynanış aynı ancak zorluk seviyesi arttırıldığında öldürülen zombi başına gelen 
puan azalıyor. Böyle bir sistemde zorluk seviyesine göre puan hesaplamalıyız. Hesaplama algoritmasının temel durumu için PointCalculator
class'ını oluşturduk. İki zorluk seviyesi için de bu class'ı miras alan iki class daha oluşturduk. Inheritance'nin sebebi Main classında
temel class'ımızdan diğerlerine(Normal, Expert) ulaşabilmek. Peki iki class için ortak yönü olmayan bir metot olsa
, puan hesaplamada ortak yönü olmayan bir kısım, bu durumu nasıl kurtarabiliriz? Bir seçenek: Metotu iki class için override etmek. Diğeri, class'ı abstract
olarak tanımlamak ve fonksiyonu da abstract yapmak. Yani PointCalculator'da calculatePoints() diye bir metot var ancak bu metot kullanılacağı class'ın 
, mesela PointCalculator_Expert, içinde tanımlı.
*/
/*
S.O.L.I.D. prensibi; Sisteme gelen yeni bir özellik varolan sistemi değiştirmemeli
*/
public class Main 
{
    public static void main(String[] args)
    {
        PointCalculator[] pointCalculate = new PointCalculator[] {new PointCalculator_Normal(), new PointCalculator_Expert()};
        for(PointCalculator i:pointCalculate)
        {
            System.out.println(i);
            i.calculatePoints(1000);
            i.gameOver();
        }
    }
}
