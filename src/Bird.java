import java.time.LocalDate;

public class Bird extends Animal implements Flyable, Speakable {
    public Bird(String ownerName, String address, int phoneNumber,
                String classPet, String petName, String breed, LocalDate petBirthday, String color,Illness illness ) {

    }

    public Bird() {
        super();
    }

    @Override
    public void getFly() {
        System.out.println("Улетела зимовать");
    }

    @Override
    public double getSpeedFly() {
        return 50.2;
    }

    @Override
    public void getSpeak() {
        System.out.println("Твити - Твити");
    }
}
