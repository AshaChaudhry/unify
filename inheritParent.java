package UnifyProjects;

public class inheritParent {
    void Parent(){
        System.out.println("parent method");
    }}
class Javaexample extends inheritParent{
        void Parent(){
            System.out.println("child method");
            super.Parent();
        }


    public static void main(String[] args) {
        Javaexample j= new Javaexample();
        j.Parent();
    }


}
