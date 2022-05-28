package UnifyProjects;

abstract class abstractAnimal {
    abstract  void makesound();
    public void eat(){
        System.out.println("animal can eat");
    }
}
class dog extends abstractAnimal{

    @Override
    void makesound() {
        System.out.println("dog makes sound");
    }
}

