package practicums.practicum7;

import javax.sound.midi.Patch;
import java.util.regex.Pattern;

public class VervangProces implements OpmaakProces {

    private String oud;
    private String nieuw;


    public VervangProces(String oud, String nieuw) {

        this.oud = oud;
        this.nieuw = nieuw;
    }

    public String maakOp(String input){
        return input.replace(oud,nieuw);
    }

}
