import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish(String ownerName, String address, int phoneNumber, String classPet, String petName, String breed, LocalDate petBirthday,
                String color, Illness illness) {
        super(ownerName, address, phoneNumber, classPet, petName, breed, petBirthday, color, illness);
    }

    public Fish() {
        super();
    }

    @Override
    public void getSwim() {
        System.out.println("Плавает в аквариуме");
    }

    @Override
    public double getSpeedSwim() {
        return 14.7;
    }
}
