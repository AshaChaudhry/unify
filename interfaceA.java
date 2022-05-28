package UnifyProjects;

interface interfaceA {
    void printA();
}
interface interfaceB{
    void printB();
}
interface interfaceC extends interfaceA,interfaceB{
    void printC();
}
class interf implements interfaceC{

    @Override
    public void printA() {
        System.out.println("abc");
    }

    @Override
    public void printB() {
        System.out.println("xyz");
    }

    @Override
    public void printC() {
        System.out.println("mnp");
    }
}
