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
public class Student 
{
    private int StudentNumber;
    private String StudentName;
    private String StudentSurname;
    private String StudentEmail;
    private String StudentPassword;
    private String StudentSecurity;
    private String StudentAnswer;
    private String StudentMobile;
    private String StudentDateOfBirthDay;
    private String StudentGender;
    private String StudentAdress;
    private String StudentNationality;
    private String StudentMarkone;
    private String StudentMarktwo;
    private String StudentMarkthree;
    private String StudentFees;

    public Student(int StudentNumber, String StudentName, String StudentSurname) {
        this.StudentNumber = StudentNumber;
        this.StudentName = StudentName;
        this.StudentSurname = StudentSurname;
    }
   
    

    
    public Student(String StudentName, String StudentSurname, String StudentEmail, String StudentPassword, String StudentSecurity, String StudentAnswer, String StudentMobile, String StudentDateOfBirthDay, String StudentGender, String StudentAdress, String StudentNationality, String StudentMarkone, String StudentMarktwo, String StudentMarkthree, String StudentFees) {
        this.StudentName = StudentName;
        this.StudentSurname = StudentSurname;
        this.StudentEmail = StudentEmail;
        this.StudentPassword = StudentPassword;
        this.StudentSecurity = StudentSecurity;
        this.StudentAnswer = StudentAnswer;
        this.StudentMobile = StudentMobile;
        this.StudentDateOfBirthDay = StudentDateOfBirthDay;
        this.StudentGender = StudentGender;
        this.StudentAdress = StudentAdress;
        this.StudentNationality = StudentNationality;
        this.StudentMarkone = StudentMarkone;
        this.StudentMarktwo = StudentMarktwo;
        this.StudentMarkthree = StudentMarkthree;
        this.StudentFees = StudentFees;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int StudentNumber) {
        this.StudentNumber = StudentNumber;
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

    public String getStudentPassword() {
        return StudentPassword;
    }

    public void setStudentPassword(String StudentPassword) {
        this.StudentPassword = StudentPassword;
    }

    public String getStudentSecurity() {
        return StudentSecurity;
    }

    public void setStudentSecurity(String StudentSecurity) {
        this.StudentSecurity = StudentSecurity;
    }

    public String getStudentAnswer() {
        return StudentAnswer;
    }

    public void setStudentAnswer(String StudentAnswer) {
        this.StudentAnswer = StudentAnswer;
    }

    public String getStudentMobile() {
        return StudentMobile;
    }

    public void setStudentMobile(String StudentMobile) {
        this.StudentMobile = StudentMobile;
    }

    public String getStudentDateOfBirthDay() {
        return StudentDateOfBirthDay;
    }

    public void setStudentDateOfBirthDay(String StudentDateOfBirthDay) {
        this.StudentDateOfBirthDay = StudentDateOfBirthDay;
    }

    public String getStudentGender() {
        return StudentGender;
    }

    public void setStudentGender(String StudentGender) {
        this.StudentGender = StudentGender;
    }

    public String getStudentAdress() {
        return StudentAdress;
    }

    public void setStudentAdress(String StudentAdress) {
        this.StudentAdress = StudentAdress;
    }

    public String getStudentNationality() {
        return StudentNationality;
    }

    public void setStudentNationality(String StudentNationality) {
        this.StudentNationality = StudentNationality;
    }

    public String getStudentMarkone() {
        return StudentMarkone;
    }

    public void setStudentMarkone(String StudentMarkone) {
        this.StudentMarkone = StudentMarkone;
    }

    public String getStudentMarktwo() {
        return StudentMarktwo;
    }

    public void setStudentMarktwo(String StudentMarktwo) {
        this.StudentMarktwo = StudentMarktwo;
    }

    public String getStudentMarkthree() {
        return StudentMarkthree;
    }

    public void setStudentMarkthree(String StudentMarkthree) {
        this.StudentMarkthree = StudentMarkthree;
    }

    public String getStudentFees() {
        return StudentFees;
    }

    public void setStudentFees(String StudentFees) {
        this.StudentFees = StudentFees;
    }

    @Override
    public String toString() {
        return "Student{" + "StudentNumber=" + StudentNumber + ", StudentName=" + StudentName + ", StudentSurname=" + StudentSurname + ", StudentEmail=" + StudentEmail + ", StudentPassword=" + StudentPassword + ", StudentSecurity=" + StudentSecurity + ", StudentAnswer=" + StudentAnswer + ", StudentMobile=" + StudentMobile + ", StudentDateOfBirthDay=" + StudentDateOfBirthDay + ", StudentGender=" + StudentGender + ", StudentAdress=" + StudentAdress + ", StudentNationality=" + StudentNationality + ", StudentMarkone=" + StudentMarkone + ", StudentMarktwo=" + StudentMarktwo + ", StudentMarkthree=" + StudentMarkthree + ", StudentFees=" + StudentFees + '}';
    }

   
}
