import java.io.Serializable;

public class Job
    implements Serializable {
    private static final long serialVersionUID = -5108477260105600939L;

    String date;
    String names;
    String location;
    int groomPhoneNr;
    int bridePhoneNr;

    public Job(){
    };

    public Job (String date, String names, String location, int groomPhoneNr, int bridePhoneNr){
        this.date = date;
        this.names = names;
        this.location = location;
        this.groomPhoneNr = groomPhoneNr;
        this.bridePhoneNr = bridePhoneNr;
    }

    @Override
    public String toString() {
        return "\nJOB:" +
                "\ndate: " + date +
                "\nnames: " + names +
                "\nlocation: " + location +
                "\ngroomPhoneNr: " + groomPhoneNr +
                "\nbridePhoneNr: " + bridePhoneNr +
                "\n------------------------------------------------------------------------|";
    }
}
