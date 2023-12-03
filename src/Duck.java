import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Goable, Speakable, Swimable {
    public Duck(String ownerName, String address, int phoneNumber, String classPet,
                String petName, String breed, LocalDate petBirthday, String color, Illness illness) {

    }

    public Duck() {
        super();
    }

    @Override
    public void getFly() {
        System.out.println("Утка улетела зимовать");
    }

    @Override
    public double getSpeedFly() {
        return 34.5;
    }

    @Override
    public double getSpeedGo() {
        return 11.2;
    }

    @Override
    public void getGo() {
        System.out.println("Ходит возле кормушки");
    }

    @Override
    public void getSpeak() {
        System.out.println("Кря - кря");
    }

    @Override
    public void getSwim() {
        System.out.println("Плавает в пруду");
    }

    @Override
    public double getSpeedSwim() {
        return 7.8;
    }
}
