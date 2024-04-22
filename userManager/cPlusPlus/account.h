#ifndef ACCOUNT_H
#define ACCOUNT_H

#include <string>

class account
{
    
    private:
        // variables, declare, initialise,
        std::string username;
        std::string password;
        int accountCounter;
        void setAccountCounter();

    public:

        // construct, object, null,
        account();

        // construct, object, parameters,
        account(std::string username, std::string password);

        // access, object, parameters,
        std::string getUsername();
        std::string getPassword();
        int getAccountCounter();
    
        // update, object, parameters,
        void setUsername(std::string username);
        void setPassword(std::string password);
        void setPrinter();
};

#endif // ACCOUNT_H