#include "account.h"
#include <iostream>
using namespace std;

static int accountCounter = 0;

// construct, object, null,
account::account()
{
    setAccountCounter();
}

// construct, object, parameters, 
account::account(std::string username, std::string password)
{
    this->username = username;
    this->password = password;
    setAccountCounter();
}

// access, object, parameters,
std::string account::getUsername()
{
    return username;
}
std::string account::getPassword()
{
    return password;
}
// access, class, parameter,
int account::getAccountCounter()
{
    return accountCounter;
}

// update, class, parameters,
void account::setAccountCounter()
{
    accountCounter++;
}
// update, object, parameters,
void account::setUsername(std::string username)
{
    this->username = username;
}
void account::setPassword(std::string password)
{
    this->password = password;
}
// update, object, printer,
void account::setPrinter()
{
    std::cout << getUsername() << endl;
    std::cout << getPassword() << endl;
    std::cout << getAccountCounter() << endl;
}