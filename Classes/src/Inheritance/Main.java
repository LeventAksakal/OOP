
package Inheritance;


public class Main 
{

    public static void main(String[] args)
    {
        BaseLogger[] Loggers = new BaseLogger[]{new AuthorizedLogger(),};
        for(BaseLogger loger:Loggers)
        {
            loger.log();
        }
    }
}
