public class Driver
{
    public static void Main(string[] args)
    {
        Account accountTS = new Account();
        accountTS.SetUsername("TS");
        accountTS.SetPassword("TSim");
        accountTS.SetPrinter();
    }
}