package UnifyProjects;

interface interfaceOne {
    void printgeek();
}
interface interfaceTwo {
    void printfor();
}
interface interfaceThree extends interfaceOne,interfaceTwo{
    void printgeek();
}
class child implements interfaceThree{

    @Override
    public void printfor() {
        System.out.println("geek");
    }

    @Override
    public void printgeek() {
        System.out.println("for");
    }
}
class main1 {
    public static void main(String[] args) {
       child c=new child();
       c.printfor();
       c.printgeek();
       c.printfor();

    }
}