
package kim.chris.college;


public class ANNOUNS 
{
    private String Subject;
    private String Annous;
    private String Date;

    public ANNOUNS(String Subject, String Annous, String Date)
    {
        this.Subject = Subject;
        this.Annous = Annous;
        this.Date = Date;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getAnnous() {
        return Annous;
    }

    public void setAnnous(String Annous) {
        this.Annous = Annous;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "ANNOUNS{" + "Subject=" + Subject + ", Annous=" + Annous + ", Date=" + Date + '}';
    }
}
