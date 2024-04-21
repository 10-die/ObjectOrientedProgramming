from account import account
# object, null
jane_dough = account()
# object, parameterised,
jane_dough.set_user_name("janed")
jane_dough.set_password("dou5")
# method, accessor, print, 
print(jane_dough.get_user_name())
print(jane_dough.get_password())