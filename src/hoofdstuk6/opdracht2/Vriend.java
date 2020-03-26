package hoofdstuk6.opdracht2;

public class Vriend {
    private String voornaam;
    private String achternaam;
    private String email;

    public Vriend(String vnv, String anm, String em) {
        voornaam = vnv;
        achternaam = anm;
        email = em;
    }

    public boolean equals(Object object) {
        if (object instanceof Vriend) {
            Vriend vriendObject = (Vriend) object;
            if (this.voornaam.equals(vriendObject.voornaam) && this.achternaam.equals(vriendObject.achternaam) && this.email.equals(vriendObject.email)) {
                return true;
            }
        }

        return false;
    }

    public String toString(){
        return "";
    }
}
