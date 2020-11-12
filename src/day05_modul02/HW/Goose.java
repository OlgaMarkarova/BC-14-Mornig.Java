package day05_modul02.HW;

public class Goose extends Animals{
    public Goose(String species, String color, int numberOfPaws, Boolean wings) {
        super(species, color, numberOfPaws, wings);
    }

    public Goose(String species, String color, int numberOfPaws, Boolean wings, String voice) {
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
    public void flay(){

    }
    public void pinch(){
        System.out.println("I can pinch");
    }
}
