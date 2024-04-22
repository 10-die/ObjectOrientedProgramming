using System;
public class Account
{
    // variables, declare, initialise, 
    public string Username = "";
    public string Password = "";
    private static int AccountCounter = 0;

    // construct, object, null,
    public Account()
    {
        GetAccountCounter();
    }

    // construct, object, parameters,
    public Account(string Username, string Password)
    {
        this.Username = Username;
        this.Password = Password;
        GetAccountCounter();
    }

    // access, object, parameters,
    public string GetUsername()
    {
        return this.Username;
    }
    public string GetPassword()
    {
        return this.Password;
    }
    public int GetAccountCounter()
    {
        return AccountCounter;
    }

    // update, object, parameters,
    public void SetUsername(string Username)
    {
        this.Username = Username;
    }
    public void SetPassword(string Password)
    {
        this.Password = Password;
    }
    // update, class, parameter
    private static void SetAccountCounter()
    {
        AccountCounter++;
    }
    // update, object, printer,
    public void SetPrinter()
    {
        Console.WriteLine(GetUsername());
        Console.WriteLine(GetPassword());
        Console.WriteLine(GetAccountCounter());
    }
}