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
public class StudentAnswer
{

   
    public StudentAnswer() {
    }
    private String StudentNumber;
    private String Courses;
    private String Question;
    private String StudentAnswers;
    private String LectureAnswers;
    private String Marks;
 public StudentAnswer(String Question, String Marks) {
        this.Question = Question;
        this.Marks = Marks;
    }

    public StudentAnswer(String StudentNumber, String Courses, String Question, String StudentAnswers, String LectureAnswers, String Marks) {
        this.StudentNumber = StudentNumber;
        this.Courses = Courses;
        this.Question = Question;
        this.StudentAnswers = StudentAnswers;
        this.LectureAnswers = LectureAnswers;
        this.Marks = Marks;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public String getCourses() {
        return Courses;
    }

    public void setCourses(String Courses) {
        this.Courses = Courses;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getStudentAnswers() {
        return StudentAnswers;
    }

    public void setStudentAnswers(String StudentAnswers) {
        this.StudentAnswers = StudentAnswers;
    }

    public String getLectureAnswers() {
        return LectureAnswers;
    }

    public void setLectureAnswers(String LectureAnswers) {
        this.LectureAnswers = LectureAnswers;
    }

    public String getMarks() {
        return Marks;
    }

    public void setMarks(String Marks) {
        this.Marks = Marks;
    }

    @Override
    public String toString() {
        return "StudentAnswer{" + "StudentNumber=" + StudentNumber + ", Courses=" + Courses + ", Question=" + Question + ", StudentAnswers=" + StudentAnswers + ", LectureAnswers=" + LectureAnswers + ", Marks=" + Marks + '}';
    }
}
