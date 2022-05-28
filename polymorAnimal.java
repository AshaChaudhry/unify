package UnifyProjects;

public class polymorAnimal {
    String name;
    String type;
    void eat(){
        System.out.println("dogs chew stick");
    }
}
class Animal extends polymorAnimal{
    void eat(){
        System.out.println("banana");
    }
}
