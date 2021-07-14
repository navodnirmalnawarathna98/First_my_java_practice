import java.util.Scanner;
class Animal{
    String name;
    public Animal(){}
    public Animal(String tname)
    {
        name = tname;
    }
    public void speak(){
        System.out.println("This is parent Animal Class");
    }
}

class Cat extends Animal{
    public Cat(){}
    public Cat(String tname){
        super(tname);
    }
    public void speak(){
       System.out.println("Meow... Meow...");
    }
}

class Dog extends Animal{
    public Dog(){}
    public Dog(String tname){
        super(tname);
    }
    public void speak(){
         System.out.println("Bow... Bow...");
    }
}

class Cow extends Animal{
    public Cow(){}
    public Cow(String tname){
        super(tname);
    }
    public void speak(){
         System.out.println("Moo... Moo...");
    }
}

public class Animal_example{
    public static void main(String args[]){
     Animal ani[] = new Animal[4];
     ani[0] = new Cat("Micky the cat");
     ani[1] = new Dog("Rover the Dog");
     ani[2] = new Cat("Roo the Cow");
     ani[3] = new Cow("no Name");


     for(int r=0; r<4; r++)
     {
         ani[r].speak();
     }



        }
}