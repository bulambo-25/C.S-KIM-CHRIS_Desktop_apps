/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kim.chris.college;


public class WorkerMESSAGE
{
    private String StudentEmail;
    private String LectureEmail;
    private String Date;
    private String Mwssage;

    public WorkerMESSAGE(String StudentEmail, String LectureEmail, String Date, String Mwssage) {
        this.StudentEmail = StudentEmail;
        this.LectureEmail = LectureEmail;
        this.Date = Date;
        this.Mwssage = Mwssage;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String StudentEmail) {
        this.StudentEmail = StudentEmail;
    }

    public String getLectureEmail() {
        return LectureEmail;
    }

    public void setLectureEmail(String LectureEmail) {
        this.LectureEmail = LectureEmail;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getMwssage() {
        return Mwssage;
    }

    public void setMwssage(String Mwssage) {
        this.Mwssage = Mwssage;
    }

    @Override
    public String toString() {
        return "WorkerMESSAGE{" + "StudentEmail=" + StudentEmail + ", LectureEmail=" + LectureEmail + ", Date=" + Date + ", Mwssage=" + Mwssage + '}';
    }
    

}
