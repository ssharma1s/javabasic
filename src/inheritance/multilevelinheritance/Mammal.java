package inheritance.multilevelinheritance;

public class Mammal extends Animal {

    @Override

    public void sound() {
        System.out.println("Mammals make specific sound");
    }

    public void movements(){
        System.out.println("Mammals make specific movements");
    }


}
