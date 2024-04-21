public class account 
{
    //
    private String userName = "";
    private String password = "";
    private static int numberOfAccounts = 0;

    //
    account()
    {
        setNumberOfAccounts();
    }

    //
    
    
    //
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    //
    public String getUserName()
    {
        return this.userName;
    }
    public String getPassword()
    {
        return this.password;
    }

    //
    private static void setNumberOfAccounts()
    {
        numberOfAccounts++;
    }

    //
    public int getNumberOfAccounts()
    {
        return numberOfAccounts;
    }

    //
    public String toString()
    {
        return "userName = " + getUserName() + "\npassword = " + getPassword() + "\naccountCounter = " + getNumberOfAccounts();
    }
}
