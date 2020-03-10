package week1.les1.opdracht3;

public class Student 			// deze Java-klasse heet Klant
{

    private String naam;        // en een attribuut "plaats"
    private int studentNummer;

    public Student(String nm) {                        // en een contructor met 3 parameters
        naam = nm;                // die in attributen naam,
    }

    public Student(String nm, int stNr){
        naam = nm;
        studentNummer = stNr;
    }

    public String getNaam() {            // getter voor attribuut naam
        return naam;
    }

    public int getStudentNummer() {            // getter voor attribuut naam
        return studentNummer;
    }

    public void setStudentNummer(int nwSN) {			// publieke setter
        studentNummer = nwSN;
    }

    public String toString() {
        String s = "Deze student heet "+ naam + "en heeft nummer" + studentNummer;
        return s;

    }
}



