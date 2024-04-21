#include "account.h"
#include <iostream>
using namespace std;

// constructor, parameterized, 
account::account(std::string userName, std::string password)
{
    this->userName = userName;
    this->password = password;
}

void account::printAccount()
{
    std::cout << "username = " << userName << "\npassword = " << password << endl;
}