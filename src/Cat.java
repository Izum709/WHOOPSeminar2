import java.time.LocalDate;

public class Cat extends Animal implements Goable, Speakable {
    public Cat(String ownerName, String address,
               int phoneNumber, String classPet, String petName, String breed, LocalDate petBirthday, String color) {

    }

    public Cat() {
        super();
    }

    @Override
    public void getGo() {
        System.out.println("На ночной охоте");
    }

    @Override
    public double getSpeedGo() {
        return 20.5;
    }

    @Override
    public void getSpeak() {
        System.out.println("Мяу");
    }
}
