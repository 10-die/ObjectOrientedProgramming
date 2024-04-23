package main
import "fmt"

//
type Account struct
{
	username string
	password string
}

//
func (account Account) printer()
{
	fmt.Println(account.username)
	fmt.Println(account.password)
}

// 
func main()
{
	account1.username = "TenSim"
	account1.password = "password"

	account1.printer()
}