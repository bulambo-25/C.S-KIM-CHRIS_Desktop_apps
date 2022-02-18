/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kim.chris.college.Lecture;

/**
 *
 * @author HP
 */
public class QUESTIONW {
    private String Course;

    
    private String Question;
    private String Option1;
    private String Option2;
    private String Option3;

    public QUESTIONW(String Option1, String Option2, String Option3) {
        this.Option1 = Option1;
        this.Option2 = Option2;
        this.Option3 = Option3;
    }
    private String Answer;
    private String TrueAnswer;

    public QUESTIONW(String Option1, String Option2) {
        this.Option1 = Option1;
        this.Option2 = Option2;
    }
    
    

    public QUESTIONW(String Question, String Option1, String Option2, String Answer, String TrueAnswer) {
        this.Question = Question;
        this.Option1 = Option1;
        this.Option2 = Option2;
        this.Answer = Answer;
        this.TrueAnswer = TrueAnswer;
    }

    public QUESTIONW(String Course, String Question, String Option1, String Option2, String Option3, String Answer, String TrueAnswer) {
        this.Course = Course;
        this.Question = Question;
        this.Option1 = Option1;
        this.Option2 = Option2;
        this.Option3 = Option3;
        this.Answer = Answer;
        this.TrueAnswer = TrueAnswer;
    }

    @Override
    public String toString() {
        return "QUESTIONW{" + "Course=" + Course + ", Question=" + Question + ", Option1=" + Option1 + ", Option2=" + Option2 + ", Option3=" + Option3 + ", Answer=" + Answer + ", TrueAnswer=" + TrueAnswer + '}';
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getOption1() {
        return Option1;
    }

    public void setOption1(String Option1) {
        this.Option1 = Option1;
    }

    public String getOption2() {
        return Option2;
    }

    public void setOption2(String Option2) {
        this.Option2 = Option2;
    }

    public String getOption3() {
        return Option3;
    }

    public void setOption3(String Option3) {
        this.Option3 = Option3;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    public String getTrueAnswer() {
        return TrueAnswer;
    }

    public void setTrueAnswer(String TrueAnswer) {
        this.TrueAnswer = TrueAnswer;
    }
    

    

    
}
