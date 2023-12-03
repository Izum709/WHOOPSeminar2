import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VetClinic {
    public String nameClinic;
    public String address;
    public int phoneNumberClinic;
    public String workTime;

    public List<Personal> personal = new ArrayList<>();
    public List<Animal> patients = new ArrayList<>();
    public List<Personal> brigade = new ArrayList<>();


    public VetClinic(String nameClinic, String address,
                     int phoneNumberClinic, String workTime, List<Personal> personal,
                     List<Animal> patients) {
        this.nameClinic = nameClinic;
        this.address = address;
        this.phoneNumberClinic = phoneNumberClinic;
        this.workTime = workTime;
        this.personal = personal;
        this.patients = patients;
    }

    public VetClinic() {
    }

    public String getNameClinic() {
        return nameClinic;
    }

    public void setNameClinic(String nameClinic) {
        this.nameClinic = nameClinic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumberClinic() {
        return phoneNumberClinic;
    }

    public void setPhoneNumberClinic(int phoneNumberClinic) {
        this.phoneNumberClinic = phoneNumberClinic;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }
    public List<Personal> getPersonal(){
        return personal;
    }
    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }
    public List<Animal> getPatients(){
        return patients;
    }
    public void setPatients(List<Animal> patients) {
        this.patients = patients;
    }
    public VetClinic addPersonal(Personal person){
        personal.add(person);
        return this;
    }

    public VetClinic addPatient(Animal animal){
        patients.add(animal);
        return this;
    }
    public void removePersonal(Personal person){
        personal.remove(person);
    }
    public void removePatient(Animal animal){
        patients.remove(animal);
    }
    public void printPatients(){
        for (Animal animal:patients){
            System.out.println(animal);
        }
    }
    public void printPersonal(){
        for (Personal pers:personal){
            System.out.println(pers);
        }
    }
    public List<Goable> getOnlyGoable(){
        List<Goable> goables = new ArrayList<>();
        for (Animal go: patients){
            if (go instanceof Goable){
                goables.add((Goable) go);
            }
        }
        return goables;
    }
    public List<Doctor> getOnlyDoctor(){
        List<Doctor> doctors =new ArrayList<>();
        for (Personal person:personal){
            if(person instanceof Doctor){
                doctors.add((Doctor) person);
            }
        }
        return doctors;
    }
    public  List<Nurses> getOnlyNurses(){
        List<Nurses> nurses = new ArrayList<>();
        for (Personal person : personal){
            if (person instanceof Nurses){
                nurses.add((Nurses) person);
            }
        }
        return nurses;
    }
    public List<Speakable> getOnlySpeakable(){
        List<Speakable> speakables = new ArrayList<>();
        for (Animal animal:patients){
            if(animal instanceof Speakable){
                speakables.add((Speakable) animal);
            }
        }
        return speakables;
    }

    public List<Flyable> getOnlyFlyable(){
        List<Flyable> flyables = new ArrayList<>();
        for (Animal animal: patients){
            if(animal instanceof Flyable){
                flyables.add((Flyable) animal);

            }
        }
        return flyables;
    }
    public  List<Swimable> getOnlySwimable(){
        List<Swimable> swimables = new ArrayList<>();
        for(Animal animal:patients){
            if (animal instanceof Swimable){
                swimables.add((Swimable) animal);
            }
        }
        return swimables;
    }
    public void setBrigade(Personal doctor, Personal nurse){
        brigade.add(doctor);
        brigade.add(nurse);
    }

    public void getBrigade(){
        System.out.println("Состав бригады: ");
        for (Personal person : brigade){
            System.out.println(person);
        }
    }
}
