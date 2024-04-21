public class account 
{
    // variables, declare, initialise,
    private String username = "";
    private String password = "";
    private static int numberOfAccounts = 0;

    // construct, object, null,
    public account()
    {
        setAccountCounter();
    }

    // construct, object, parameters,
    public account(String username, String password)
    {
        this.username = username;
        this.password = password;
        setAccountCounter();
    }

    // access, object, parameters,
    public String getUsername()
    {
        return this.username;
    }
    public String getPassword()
    {
        return this.password;
    }
    public int getAccountCounter()
    {
        return numberOfAccounts;
    }

    // update, class, parameter,
    private static void setAccountCounter()
    {
        numberOfAccounts++;
    }
    // update, object, parameters,
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    // update, object, printer,
    public void setPrinter() 
    {
        System.out.println(getUsername());    
        System.out.println(getPassword());
        System.out.println(getAccountCounter());
    }
}
