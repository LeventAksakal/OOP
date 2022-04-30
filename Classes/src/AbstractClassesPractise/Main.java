/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClassesPractise;

/**
 *
 * @author leven
 */
/*
Bu örnekte bir yazılım kullanıcılarına, kullanıcıların veri tabanlarındaki verilere ulaşmasını onları rahatça değiştirebilmesini sağlasın.
Yazılımın desteklediği DB'ler Oracle ve SQL. Tabi her veri tabanı için ayrı kodlar gerekeceğinden bu veri tabanlarını(classlar) abstract DataBaseManager
class'ında topladık. Kullanımın iyice pratikleşmesi ve tek taraflı yönetilmesi için UserManager class'ını oluşturup getData() metodunu oraya da tanımladık.
DataBaseManager türünde dataBaseManager pointer'ı oluşturduk. Hangi veri tabanının kullanılacağını yalnızca main class'ından kontrol edebiliyoruz.
Yeni bir veri tabanı desteği geldiği zaman hiçbir kodu değiştirmeden DataBaseManager'ı extend'leyen bir class oluşturmamız yeterli.
*/
public class Main 
{
    public static void main(String[] args)
    {
        UserManager userManage = new UserManager();
        userManage.dataBaseManager = new SQL_DataBaseManager();
        userManage.getData();
        userManage.dataBaseManager = new OracleDataBaseManager();
        userManage.getData();
        
    }
}
