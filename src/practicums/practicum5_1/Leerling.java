package practicums.practicum5_1;

public class Leerling {
    private String naam;
    private double cijfer = 0.0;

    public  Leerling(String nm){
        naam = nm;
    }
    //getters
    public String getNaam() {return naam;}
    public double getCijfer() {return cijfer;}
    //setteers
    public void setCijfer(double c){
        cijfer = c;
    }
    public String toString(){return naam + " heeft cijfer: " + getCijfer() + "\n";}
}
