import java.time.LocalDate;

public class Dog extends Animal implements Goable, Speakable {
    public Dog(String ownerName, String address, int phoneNumber, String classPet, String petName, String breed,
               LocalDate petBirthday, String color, Illness illness) {
        super(ownerName, address, phoneNumber, classPet, petName, breed, petBirthday, color, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void getGo() {
        System.out.println("Бегает за палочкой");
    }

    @Override
    public double getSpeedGo() {
        return 21.1;
    }

    @Override
    public void getSpeak() {
        System.out.println("гав - гав");
    }
}
