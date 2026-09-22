    # Method overriding in Python Programing
class People:
    def sound(self, name):
        print("people is singing")
    
    
class Nary(People):
    def sound(self):
        print(f"{self.name} is singing ")

class Sophal(People):
    def sound(self):
        print(f"{self.name} is singing ")

p = People()
n = Nary()
s = Sophal()

p.sound()
n.sound()
s.sound()