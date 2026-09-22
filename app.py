class Animal:
    def sound(self,name):
        self.name=name
        
    def sound(self):
        print(f"{self.name} Animal making sound")
        
class Dog(Animal):
    def __init__(self,name,bread):
        super().__init__(name)    # Call constructor from Animal
        self.bread = bread
        
    
    
    
    
        