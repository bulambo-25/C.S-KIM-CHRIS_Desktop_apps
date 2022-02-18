/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kim.chris.college;

public class COURSESS 
{
    
    private String StudentName;

    public COURSESS(String StudentName, String StudentSurname, String program1, String program2, String program3) {
        this.StudentName = StudentName;
        this.StudentSurname = StudentSurname;
        this.program1 = program1;
        this.program2 = program2;
        this.program3 = program3;
    }
    private String StudentSurname;
    private String StudentEmail;
    private String Faculty;
    private String Mois;
    private String program1;
    private String Lecture1;
    private String program2;
    private String Lecture2;
    private String program3;
    private String Lecture3;

    public COURSESS(String StudentName, String StudentSurname, String StudentEmail, String Faculty, String Mois, String program1, String Lecture1, String program2, String Lecture2, String program3, String Lecture3) {
        this.StudentName = StudentName;
        this.StudentSurname = StudentSurname;
        this.StudentEmail = StudentEmail;
        this.Faculty = Faculty;
        this.Mois = Mois;
        this.program1 = program1;
        this.Lecture1 = Lecture1;
        this.program2 = program2;
        this.Lecture2 = Lecture2;
        this.program3 = program3;
        this.Lecture3 = Lecture3;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentSurname() {
        return StudentSurname;
    }

    public void setStudentSurname(String StudentSurname) {
        this.StudentSurname = StudentSurname;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String StudentEmail) {
        this.StudentEmail = StudentEmail;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }

    public String getMois() {
        return Mois;
    }

    public void setMois(String Mois) {
        this.Mois = Mois;
    }

    public String getProgram1() {
        return program1;
    }

    public void setProgram1(String program1) {
        this.program1 = program1;
    }

    public String getLecture1() {
        return Lecture1;
    }

    public void setLecture1(String Lecture1) {
        this.Lecture1 = Lecture1;
    }

    public String getProgram2() {
        return program2;
    }

    public void setProgram2(String program2) {
        this.program2 = program2;
    }

    public String getLecture2() {
        return Lecture2;
    }

    public void setLecture2(String Lecture2) {
        this.Lecture2 = Lecture2;
    }

    public String getProgram3() {
        return program3;
    }

    public void setProgram3(String program3) {
        this.program3 = program3;
    }

    public String getLecture3() {
        return Lecture3;
    }

    public void setLecture3(String Lecture3) {
        this.Lecture3 = Lecture3;
    }

    @Override
    public String toString() {
        return "COURSESS{" + "StudentName=" + StudentName + ", StudentSurname=" + StudentSurname + ", StudentEmail=" + StudentEmail + ", Faculty=" + Faculty + ", Mois=" + Mois + ", program1=" + program1 + ", Lecture1=" + Lecture1 + ", program2=" + program2 + ", Lecture2=" + Lecture2 + ", program3=" + program3 + ", Lecture3=" + Lecture3 + '}';
    }


}
