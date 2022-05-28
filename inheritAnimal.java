package UnifyProjects;

public class inheritAnimal {
String name;
void eat(){
    System.out.println("dog doesnt eat nonveg");
}

}
class Dog extends inheritAnimal{
    void display(){
        System.out.println("labrador");
    }
}
class Main{
    public static void main(String[] args) {
      Dog d=new Dog();
      d.eat();
      d.display();

    }
}