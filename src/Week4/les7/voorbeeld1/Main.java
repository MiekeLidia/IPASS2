package Week4.les7.voorbeeld1;

public class Main {
        public static void main(String[] args) {
            Dier dier = new Dier();
            Koe koe = new Koe();
            Eend eend = new Eend();

            System.out.println("Een dier zegt: " + dier.speak());
            System.out.println("Een koe zegt: " + koe.speak());
            System.out.println("Een eend zegt: " + eend.speak());

            System.out.println(dier);
            System.out.println(koe);
            System.out.println(eend);
        }
    }

