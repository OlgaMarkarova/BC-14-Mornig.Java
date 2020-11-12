package day05_modul02.HW;

public class Pig extends Animals{
    public Pig(String species, String color, int numberOfPaws, Boolean wings) {
        super(species, color, numberOfPaws, wings);
    }

    public Pig(String species, String color, int numberOfPaws, Boolean wings, String voice) {
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
}
