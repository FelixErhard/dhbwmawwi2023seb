package lecture.chapter6;

public class OurLittleFarmRun {

  public static void main(String[] args) {

    Animal myAnimal = new Animal("Klaus", 56f, 10f);
    Dog myDog = new Dog("Bello", 50f, 20f, "Schäferhund");
    Bird myBird = new Bird("Tweety", 5f, 0.56f, true);

    myAnimal.breath();
    myAnimal.eat();
    myAnimal.move();
    //myAnimal.bark();
    //myAnimal.tweet();

    System.out.println(myAnimal);

    myDog.breath();
    myDog.eat();
    myDog.eat(500.0f);
    myDog.move();
    myDog.bark();

    System.out.println(myDog);
    System.out.println(myDog.toString());

    myBird.breath();
    myBird.eat();
    myBird.move();
    myBird.tweet();

    System.out.println(myBird);


  }
}
