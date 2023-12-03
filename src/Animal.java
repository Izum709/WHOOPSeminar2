import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String ownerName;
    private String address;
    private int phoneNumber;
    private String classPet;
    private String petName;
    private String breed;
    private LocalDate petBirthday;
    private String color;
    private Illness illness;



    public Animal(String ownerName, String address, int phoneNumber, String classPet, String petName, String breed,
                  LocalDate petBirthday, String color,Illness illness) {
        this.ownerName = ownerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.classPet = classPet;
        this.petName = petName;
        this.breed = breed;
        this.petBirthday = petBirthday;
        this.color = color;
        this.illness = illness;
    }

    public Animal() {
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClassPet() {
        return classPet;
    }

    public void setClassPet(String classPet) {
        this.classPet = classPet;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getPetBirthday() {
        return petBirthday;
    }

    public void setPetBirthday(LocalDate petBirthday) {
        this.petBirthday = petBirthday;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClassName(){
        return (getClass().getSimpleName()+" "+getPetName() +" ");
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return getClassName() +
                "\nИмя владельца - " + ownerName  +
                "; Адрес владельца - " + address  +
                "; Контактный телефон владельца - " + phoneNumber +
                "; Класс - " + classPet + '\'' +
                "; Кличка питомца - " + petName +
                "; Порода - " + breed +
                "; Дата рождения питомца - " + petBirthday +
                "; Окрас шерсти - " + color  +
                "; Заболевание - "+illness+"\n";
    }
}
