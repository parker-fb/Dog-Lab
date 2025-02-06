

import java.util.ArrayList;

public class DogTest
{
    public static void main(String[] args)
    {
//	Dog dog = new Dog("Spike");
//	System.out.println(dog.getName() + " says " + dog.bark());
//
//    Labrador lab = new Labrador("Bruce", "black");
//    System.out.println(lab.getName() + " says " + lab.bark());
//    //Labrador extends Dog, which doesn't have waddle method, it needs to make its own
//    lab.waddle();
//
//    Yorkshire yorky = new Yorkshire("Yorky",15);
//    System.out.println(yorky.getName() + " says " + yorky.bark());
//    yorky.waddle();
//
//        ArrayList<Dog> dogs = new ArrayList<Dog>();
//        dogs.add(new Dog("Arthur"));
//        dogs.add(new Labrador("Arnold", "brown"));
//        dogs.add(new Yorkshire("Julius", 20));
////    Dog[] dogs = new Dog[3];
////    dogs[0] = new Dog("Arthur");
////    dogs[1] = new Labrador("Arnold", "brown");
////    dogs[2] = new Yorkshire("Julius", 20);
//
//        //Dog doesn't have a waddle method so it wont compile, but at run time it looks in the class for it
//        ((Labrador)dogs.get(1)).waddle();
//
//    for (int i = 0; i < dogs.size(); i++){
//        System.out.println(dogs.get(i).bark());
//    }
//
//    for (Dog doggy: dogs){
//        System.out.println(doggy.bark());
//    }

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Dog("willy", 8));
        animals.add(new Labrador("robbie", "black", 9));
        animals.add(new Yorkshire("charlie", 20, 10));

        animals.get(0).setAge(9);
        animals.get(1).setAge(10);
        animals.get(2).setAge(11);

        for (Animal a: animals){
            System.out.println(a.getAge());
            a.eat();
            //there is no bark method in Animal
            ((Dog)a).bark();
        }




    }
}
