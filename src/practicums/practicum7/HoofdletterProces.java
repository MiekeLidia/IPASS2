package practicums.practicum7;

public class HoofdletterProces implements OpmaakProces {
    private OpmaakProces opmaak;

    public HoofdletterProces(){}

    public String maakOp(String input){
        return input.toUpperCase();
    }
}
