package week1.les1.practicum1.opdracht5;

public class Main {
    public static void main(String[] args) {
        String zaag;
        for(int i = 1; i <= 4; i++) {
            if (i % 2 == 0){
                zaag = "ss";
            }
            else {
                zaag = "s";
            }
            System.out.println(zaag);
        }

    }
}