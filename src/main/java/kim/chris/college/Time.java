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
public class Time 
{
    
    private String Year;
    private String Program;
    private String DateofProgram;
    private String Program2;
    private String DateofProgram2;
    private String Program3;
    private String DateofProgram3;

    public Time(String Year, String Program, String DateofProgram, String Program2, String DateofProgram2, String Program3, String DateofProgram3) {
        this.Year = Year;
        this.Program = Program;
        this.DateofProgram = DateofProgram;
        this.Program2 = Program2;
        this.DateofProgram2 = DateofProgram2;
        this.Program3 = Program3;
        this.DateofProgram3 = DateofProgram3;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public String getDateofProgram() {
        return DateofProgram;
    }

    public void setDateofProgram(String DateofProgram) {
        this.DateofProgram = DateofProgram;
    }

    public String getProgram2() {
        return Program2;
    }

    public void setProgram2(String Program2) {
        this.Program2 = Program2;
    }

    public String getDateofProgram2() {
        return DateofProgram2;
    }

    public void setDateofProgram2(String DateofProgram2) {
        this.DateofProgram2 = DateofProgram2;
    }

    public String getProgram3() {
        return Program3;
    }

    public void setProgram3(String Program3) {
        this.Program3 = Program3;
    }

    public String getDateofProgram3() {
        return DateofProgram3;
    }

    public void setDateofProgram3(String DateofProgram3) {
        this.DateofProgram3 = DateofProgram3;
    }

    @Override
    public String toString() {
        return "Time{" + "Year=" + Year + ", Program=" + Program + ", DateofProgram=" + DateofProgram + ", Program2=" + Program2 + ", DateofProgram2=" + DateofProgram2 + ", Program3=" + Program3 + ", DateofProgram3=" + DateofProgram3 + '}';
    }

}
