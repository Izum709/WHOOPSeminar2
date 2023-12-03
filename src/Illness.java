public class Illness {
    public String illnessName;

    public Illness(String illnessName) {
        this.illnessName = illnessName;
    }

    public Illness() {
    }
    public void healChumra(){
        System.out.println("мукалтин 3 раза в день" );
    }

    @Override
    public String toString() {
        return " illnes = "+illnessName;
    }
}
