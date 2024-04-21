class account:
    # constructor, default,
    def __init__(self, user_name = "", password = ""):
        self.user_name = user_name
        self.password = password

    # method, mutator, 
    def set_user_name(self, user_name):
        self.user_name = user_name
    def set_password(self, password):
        self.password = password

    # method, accessor, 
    def get_user_name(self):
        return self.user_name
    def get_password(self):
        return self.password
    
    # method, accessor, print account information
    def printer(self, string, method):
        return print(string, method)
pass