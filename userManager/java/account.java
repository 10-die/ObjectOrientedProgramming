public class account 
{
    // variables, declare, initialise,
    private String email = "";
    private String password = "";
    private String firstName = "";
    private String lastName = "";
    private static int numberOfAccounts = 0;

    // construct, object, null,
    public account()
    {
        setAccountCounter();
    }

    // construct, object, parameters,
    public account(String email, String password)
    {
        this.email = email;
        this.password = password;
        setAccountCounter();
    }

    // access, object, parameters,
    public String getEmail()
    {
        return this.email;
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
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setEmail(String username)
    {
        this.email = username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    // update, object, printer,
    public void setPrinter() 
    {
        System.out.println(getEmail());    
        System.out.println(getPassword());
        System.out.println(getAccountCounter());
    }
}
