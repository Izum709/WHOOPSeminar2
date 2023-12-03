import java.util.ArrayList;
import java.util.List;

public class Personal {
    private String Name;
    private String Address;
    private int phoneNumber;
    private String position;

    public Personal() {
    }

    public Personal(String name, String address, int phoneNumber, String position) {
        Name = name;
        Address = address;
        this.phoneNumber = phoneNumber;
        this.position = position;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public Personal addListPersonal(Personal personal){
        List<Personal> result = new ArrayList<>();
        result.add(personal);
        return this;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"\n"+
                  "Имя - "+Name  +
                "; Адрес - " + Address  +
                "; Телефон - " + phoneNumber +
                "; Должность - " + position +
                "\n";
    }
}
