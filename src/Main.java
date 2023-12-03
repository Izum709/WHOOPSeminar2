import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat ();
        barsik.setPetName("Barsik");
        Dog bobik = new Dog("bob","moskow",12345,"dog","bobik","laika",
                LocalDate.of(2022,11,15),"white",new Chumka("chumka"));
        Duck kryakva = new Duck();
        kryakva.setPetName("Kryakva");
        Fish dorry = new Fish();
        dorry.setPetName("Don");
        Bird chiki = new Bird();
        chiki.setPetName("Popik");
        System.out.println(bobik.getIllness());
        Chumka chumka = new Chumka();
        chumka.healChumra();
        bobik.getIllness().healChumra();
        bobik.getGo();
        System.out.println(bobik.getSpeedGo());
        barsik.getGo();
        System.out.println(barsik.getSpeedGo());
        dorry.getSwim();
        System.out.println(dorry.getSpeedSwim());
        chiki.getFly();
        System.out.println(chiki.getSpeedFly());

        VetClinic vetClinic = new VetClinic();
        vetClinic.addPatient(barsik).addPatient(bobik).addPatient(kryakva)
                .addPatient(dorry).addPatient(chiki).printPatients();


        Personal vadim = new Doctor();
        vadim.setName("Вадим");
        Personal ira = new Doctor();
        ira.setName("Ирина");
        Nurses sasha = new Nurses();
        sasha.setName("Александр");
        Nurses vica = new Nurses();
        vica.setName("Виктория");
        vetClinic.addPersonal(vica).addPersonal(vadim).addPersonal(ira)
                .addPersonal(sasha).printPersonal();

        System.out.println(vetClinic.getOnlyGoable());
        System.out.println();
        System.out.println(vetClinic.getOnlyDoctor());
        System.out.println();
        System.out.println(vetClinic.getOnlyNurses());
        System.out.println();
        System.out.println(vetClinic.getOnlyFlyable());
        vetClinic.printPersonal();
        vetClinic.setBrigade(vadim,vica);
        vetClinic.getBrigade();

    }
}
