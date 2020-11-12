package day05_modul02.HW;

public class Cat extends Animals {

    public Cat(String species, String color, int numberOfPaws, Boolean wings) {
        super(species, color, numberOfPaws, wings);

    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void eats() {
        super.eats();
    }
    public void hunt(){
        System.out.println("I caught a mouse");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPaws=" + numberOfPaws +
                ", wings=" + wings +
                ", voice='" + voice + '\'' +
                '}';
    }
}
