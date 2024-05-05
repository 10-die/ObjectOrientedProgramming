package main

import (
	"fmt"
)

type Account struct {
	firstName string
	lastName  string
	email     string
	password  string
}

func (account Account) PrintAccount() {
	fmt.Println("First Name = ", account.firstName)
	fmt.Println("Last Name = ", account.lastName)
	fmt.Println("Email = ", account.email)
	fmt.Println("Password = ", account.password)
}

func main() {
	account1 := Account{
		firstName: "John",
		lastName:  "Doe",
		email:     "johndoe@email.com",
		password:  "passwordjd",
	}
	account1.PrintAccount()
}
