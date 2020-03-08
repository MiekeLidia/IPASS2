package Week4.les7.voorbeeld1;

public class Koe {
        private double litersMelk;

        public Koe() {
            super(4);
            litersMelk = 0.0;
        }

        public void setLitersMelk(double lM) {
            litersMelk = lM;
        }

        public String speak() {
            return "boe";
        }

        public String toString() {
            return "Koe met " + super.toString() + " geeft " + litersMelk + " liters melk";
        }
    }

