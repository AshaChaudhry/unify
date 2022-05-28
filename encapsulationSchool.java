package UnifyProjects;

public class encapsulationSchool {
    private int rollno;
    private String name;
    private char grade;

    int getRollno(){
        return rollno;
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
}
class school1{
    public static void main(String[] args) {
        encapsulationSchool ec=new encapsulationSchool();
        ec.setRollno(11);
        ec.setName("krish");
        ec.setGrade('A');
        System.out.println(ec.getRollno());
        System.out.println(ec.getName());
        System.out.println(ec.getGrade());
    }
}