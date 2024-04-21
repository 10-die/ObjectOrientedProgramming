#ifndef ACCOUNT_H
#define ACCOUNT_H

#include <string>

class account
{
    private:
        std::string userName;
        std::string password;

    public:
        account(std::string userName, std::string password);
        void printAccount();
};

#endif // ACCOUNT_H