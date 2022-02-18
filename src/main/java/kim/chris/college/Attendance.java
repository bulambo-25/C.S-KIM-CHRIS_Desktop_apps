/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kim.chris.college;

/**
 *
 * @author HP
 */
public class Attendance {
    private String StudentName;
    private String Attend;
    private String NotAttend;
    
     public Attendance(String StudentName, String Attend, String NotAttend) {
        this.StudentName = StudentName;
        this.Attend = Attend;
        this.NotAttend = NotAttend;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getAttend() {
        return Attend;
    }

    public void setAttend(String Attend) {
        this.Attend = Attend;
    }

    public String getNotAttend() {
        return NotAttend;
    }

    public void setNotAttend(String NotAttend) {
        this.NotAttend = NotAttend;
    }

    @Override
    public String toString() {
        return "Attendance{" + "StudentName=" + StudentName + ", Attend=" + Attend + ", NotAttend=" + NotAttend + '}';
    }

   
    
}
