package practicums.practicum3b;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        if (rad <= 0){
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        radius = rad;
        xPositie = x;
        yPositie = y;
    }

    public String toString(){
        return "cirkel (" + xPositie + ", " + yPositie+ ") met radius " + radius;
    }


}

//Beredeneer, voordat je het gaat testen, wat er zal gebeuren als je het try-catch blok in de gegeven methode (main) hierboven weghaalt. Heeft dit tot gevolg dat:
//de applicatie helemaal niet uitgevoerd kan worden
//- hij ontvangt kleiner dan 0 maar hij kan er niks mee, het wordt niet gevangen