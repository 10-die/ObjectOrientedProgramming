class account:
    # construct, object, parameters,
    account_counter = 0
    def __init__(self, user_name = "", password = ""):
        self.username = user_name
        self.password = password
        self.set_account_counter()

    # access, object, parameters, 
    def get_user_name(self):
        return self.username
    def get_password(self):
        return self.password
    
    # update, class, parameter,
    def set_account_counter(self):
        self.account_counter +=1
    # update, object, parameters,
    def set_user_name(self, user_name):
        self.username = user_name
    def set_password(self, password):
        self.password = password
    # update, object, printer,
    def set_printer(self):
        print(self.get_user_name())
        print(self.get_password())
pass