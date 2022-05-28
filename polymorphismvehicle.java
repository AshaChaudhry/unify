package UnifyProjects;

public class polymorphismvehicle {
String model;
String type;
void modelname(){
    System.out.println("tesla");
}}
class vehicle extends polymorphismvehicle{
    void modelname(){
        System.out.println("honda");
    }
}
