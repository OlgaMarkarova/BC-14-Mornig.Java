package day05_modul02.HW;

public class Parrot extends Animals{
    public Parrot(String species, String color, int numberOfPaws, Boolean wings) {
        super(species, color, numberOfPaws, wings);
    }

    public Parrot(String species, String color, int numberOfPaws, Boolean wings, String voice) {
        super(species, color, numberOfPaws, wings, voice);
    }

    @Override
    public void eats() {
        super.eats();
    }

    @Override
    public void run() {
        super.run();
    }
    public void speak(){
        System.out.println("I can speak. - Привет");
    }
    public void flay(){
        System.out.println("I can flay");
    }
}
