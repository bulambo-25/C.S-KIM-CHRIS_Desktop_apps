
package kim.chris.college.server;


import java.sql.*;
import java.util.*;


import kim.chris.college.Attendance;
import kim.chris.college.COURSESS;
import kim.chris.college.Lecture.QUESTIONW;
import kim.chris.college.Lecture.StudentAnswer;
import kim.chris.college.Student;
import kim.chris.college.Time;
import kim.chris.college.WorkerMESSAGE;

/**
 *
 * @author HP
 */
public class Database
{
    Connection con;
    PreparedStatement statement;

    public Connection connectDB() throws SQLException {

        // Connection con;  
        String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
        String username = "KIM";
        String password = "CHRIS";

        DriverManager.getConnection(url, username, password);

        return DriverManager.getConnection(url, username, password);

    }
    
private void feedDatabase() {
            System.out.println("DB");
            String STUDENT_SQL = "CREATE TABLE APP.STUDENTSS ("
                    + "StudentID INT PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 200110210, INCREMENT BY 107), "
                    
                    + "Student_Name VARCHAR(255), Student_Surname VARCHAR(255),"
                    
                    + "Student_Email VARCHAR(255), Student_password VARCHAR(255), "
                    
                    + "Student_Security VARCHAR(255), Student_Answer VARCHAR(255), Student_mobile VARCHAR(255), "
                    
                    + "Student_date VARCHAR(255), Student_Gender VARCHAR(255) , Student_Adress VARCHAR(255),"
                    
                    + "Student_nation VARCHAR(255), "
                    
                    + "Student_markone VARCHAR(255), Student_marktwo VARCHAR(255), Student_markthree VARCHAR(255),"
                    
                    + "Student_fees  VARCHAR(255) )";
            
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(STUDENT_SQL);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
} 
private void BANKDatabase() {
            System.out.println("DB");
            String STUDENT_SQL = "CREATE TABLE APP.Banks ("
                    + "AccountN INT PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 900112113, INCREMENT BY 107), "
                    
                    + " ID VARCHAR(255), Surname VARCHAR(255),"
                    
                    + "Name  VARCHAR(255), password INT , "
                    
                    + "email VARCHAR(255), adress VARCHAR(255), branch VARCHAR(255), "
                    
                    + "amount VARCHAR(255), retrait VARCHAR(255) , total VARCHAR(255),"
                    
                    + "fees  VARCHAR(255) )";
            
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(STUDENT_SQL);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
} 
private void BA() {
            System.out.println("DB");
            String STUDENT_SQL = "CREATE TABLE APP.DB ("
                    + "UserID INT PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "
                    
                    + "UserName VARCHAR(255), Email VARCHAR(255),"
                    
                    + "Password VARCHAR(255), VerifyCode VARCHAR(255))";
            
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(STUDENT_SQL);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
} 
private void Cou() {
            System.out.println("DB");
            String Cours= "CREATE TABLE APP.USER ("
                    + "UserID INT PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY , "

                    + "UserName VARCHAR(255), Email VARCHAR(255),"
                    
                    + "Password VARCHAR(255), VerifyCode VARCHAR(255))";
            
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Cours);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }}
private void Courses() {
            System.out.println("DB");
            String Courses= "CREATE TABLE APP.Courses ("

                    + "Student_Name VARCHAR(255), Student_Surname VARCHAR(255),"
                    
                    + "Student_Email VARCHAR(255), Faculty VARCHAR(255), "
                    
                     + " Mois VARCHAR(255), program1 VARCHAR(255) ,Lecture1  VARCHAR(255),"
                    + "program2 VARCHAR(255), Lecture2 VARCHAR(255) , program3 VARCHAR(255),"
                    
                    + "Lecture3 VARCHAR(255) )";
            
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Courses);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
}private void ACCOUNTB() {
            System.out.println("DB");
            String ACCOUNT= "CREATE TABLE APP.AccountB ("

                    + "AcoountN INT PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 250219900, INCREMENT BY 124), "
                    
                    + "Name VARCHAR(255), Surname VARCHAR(255), gender VARCHAR(255) ,"
                    
                     + "Email VARCHAR(255), Password VARCHAR(255) ,Adress  VARCHAR(255),"
                    + "Amount VARCHAR(255), retrait VARCHAR(255) ,"
                    
                    + " adf VARCHAR(255) )";
            
            
      
            
            
            
            
            
            
            
            
            
            
            
            
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(ACCOUNT);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
}
private void Pictures() {
            System.out.println("DB");
            String Courses= "CREATE TABLE APP.ect ("

                    + "Student_Name VARCHAR(255), Student_Surname longblob )";
            
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Courses);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
}
 public  void TIMETABLEEFIRSTYERA() {
            System.out.println("DB");
            String Courses= "CREATE TABLE APP.FIRSTYEAR ("

                    + "firstyear VARCHAR(255), Math VARCHAR(255),"
                    
                    + "dateMath VARCHAR(255), Physic VARCHAR(255), "
                    
                     + " PhysicDate VARCHAR(255), Marketing VARCHAR(255) ,MarkingDate  VARCHAR(255) )";
            
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Courses);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
}
 public  void LECTURE() {
            System.out.println("DB");
            String LECTURES_SQL = "CREATE TABLE APP.LECTURES ("
                    + "Lectures INT PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY, "
                    
                    + "Lecture_Name VARCHAR(255), Lecture_Surname VARCHAR(255),"
                    
                    + "Lecture_Email VARCHAR(255), Lecture_password VARCHAR(255), "
                    + "Lecture_adress VARCHAR(255), "
                    
                    + "Courses VARCHAR(255), payment VARCHAR(255))";
            
            
            
            

            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(LECTURES_SQL);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
}
  public  void TIMETABLEESECONDYEAR() {
            System.out.println("DB");
            String Courses= "CREATE TABLE APP.SECONDYEAR ("

                    + "Secondyear VARCHAR(255), ADF VARCHAR(255),"
                    
                    + "dateADF VARCHAR(255), NETwork VARCHAR(255), "
                    
                     + " NETworkDate VARCHAR(255), ADP VARCHAR(255) ,ADPDate  VARCHAR(255) )";
            
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Courses);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
}
 public void Update(Attendance up) {

        try {
            con=connectDB();
            

            int row = 0;
            String SQLupdate = "UPDATE APP.StudentsAttendance SET Attendance=?, NOtAttended=?  WHERE StudentName=? ";
            statement= con.prepareStatement(SQLupdate);
            statement.setString(1, up.getAttend());
            statement.setString(2, up.getNotAttend());
            statement.setString(3, up.getStudentName());
            

            row = statement.executeUpdate();

            if (row > 0) {
                System.out.println(" Update ATT successful");

            } else {
                System.out.println("  unsuccessful");
            }

        } catch (SQLException ex) {
            System.out.println("  unsuccessful" + ex);
        }

    }
 public void UpdateEX (QUESTIONW up) {

        try {
            con=connectDB();
            

            int row = 0;
            String SQLupdate = "UPDATE APP.TRUEORFALSES SET deo=? WHERE eo=? ";
            statement= con.prepareStatement(SQLupdate);
            statement.setString(1, up.getOption1());
            statement.setString(2, up.getOption2());

            

            row = statement.executeUpdate();

            if (row > 0) {
                System.out.println(" Update ATT successful");

            } else {
                System.out.println("  unsuccessful");
            }

        } catch (SQLException ex) {
            System.out.println("  unsuccessful" + ex);
        }

    }
 public void UpdatePassword (QUESTIONW AS) {

        
      try {
           String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
           String username = "KIM";
           String password = "CHRIS";
            con = DriverManager.getConnection(url, username, password);
           //StudentNumber,  Courses  , Question , StudentAnswer , LectureAnswer, Marks 
            int row = 0;
            String SQLupdate = "UPDATE APP.STUDENTSS SET Student_password=? WHERE Student_Name=? ";
            PreparedStatement ps = con.prepareStatement(SQLupdate);
            
            ps.setString(1, AS.getOption1());
            ps.setString(2, AS.getOption2());

            row = ps.executeUpdate();

            if (row > 0) {
                System.out.println(" House Details Update ");

            } else {
                System.out.println("  Unsuccessful");
            }

        } catch (SQLException ex) {
            System.out.println("  unsuccessful" + ex);
        }



    }
 public  void MESSAGE() 
 {
            System.out.println("MESSAGE DB");
            String Attendance = "CREATE TABLE APP.SENDEMAI ("
                    + "LectureEmail VARCHAR(255),  Student_Email  VARCHAR(255), DATE VARCHAR(255) ,  Message  VARCHAR(1000) )";
            System.out.println("Created Attendace ............ ");
             
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Attendance);
                System.out.println("MESSAGE Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
 }
 public  void QUESTION() 
 {
       System.out.println("MESSAGE DB");
            String Attendance = "CREATE TABLE APP.QUESTIONS ("
                    + "Course VARCHAR(255),  Question  VARCHAR(255), Option1 VARCHAR(255) ,  Option2  VARCHAR(100), Option3 VARCHAR(255) ,  Answer VARCHAR(100), trueAnswer VARCHAR(100))";
            System.out.println("Created Attendace ............ ");
             
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Attendance);
                System.out.println("QUESTION Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }

 }
 public  void TRUE() 
 {
         System.out.println("TRUEORFALSE DB");
            String Attendance = "CREATE TABLE APP.TRUEORFALSES ("
                    + "deo VARCHAR(255), eo VARCHAR(255))";
            System.out.println("Created TRUEORFALSE ............ ");
             
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Attendance);
                System.out.println("TRUEORFALSE Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }

 }
  public  void COUR() 
 {
         System.out.println("Courses DB");
            String Attendance = "CREATE TABLE APP.CCC ("
                    + "Course VARCHAR(255), Lecture VARCHAR(255))";
            System.out.println("Created TRUEORFALSE ............ ");
             
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Attendance);
                System.out.println("TRUEORFALSE Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }

 }
 public  void ANSWERQUESTION() 
 {
         System.out.println("MESSAGE DB");
            String Attendance = "CREATE TABLE APP.ANQUESTIONSS ("
                    + "StudentNumber VARCHAR(255),  Courses  VARCHAR(255), Question VARCHAR(255) , StudentAnswer VARCHAR(100), LectureAnswer VARCHAR(255) , Marks VARCHAR(100))";
            System.out.println("Created Attendace ............ ");
             
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Attendance);
                System.out.println("QUESTION Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }

 }
  public QUESTIONW InsertQuestion(QUESTIONW Question) throws SQLException
{
   String MESS= "INSERT INTO APP.QUESTIONS (Course, Question,  Option1,  Option2, Option3, Answer, trueAnswer ) " + " VALUES (?,?,?,?,?,?,?)";
   con=connectDB();
   System.out.println("connection successful");
        statement = con.prepareStatement(MESS); 
        statement.setString(1, Question.getCourse());
        statement.setString(2, Question.getQuestion());
        statement.setString(3, Question.getOption1());
        statement.setString(4, Question.getOption2());
        statement.setString(5, Question.getOption3());
        statement.setString(6, Question.getAnswer());
        statement.setString(7, Question.getTrueAnswer());
        int rowINserted = statement.executeUpdate();
        if (rowINserted > 0) {
            System.out.println("insertion successfull");
          
            
            
        }
        statement.close();
    
    return Question;
}
  public QUESTIONW Inse(QUESTIONW Question) throws SQLException
{
   String MESS= "INSERT INTO APP.TRUEORFALSE (deo ) " + " VALUES (?)";
   con=connectDB();
   System.out.println("connection successful");
        statement = con.prepareStatement(MESS); 
        statement.setString(1, Question.getQuestion());
        
        int rowINserted = statement.executeUpdate();
        if (rowINserted > 0) {
            System.out.println("insertion successfull");
          
            
            
        }
        statement.close();
    
    return Question;
}
 public StudentAnswer InsertAnswerQuestion(StudentAnswer studentAnswer) throws SQLException
{
   String MESS= "INSERT INTO APP.ANQUESTIONSS (StudentNumber,  Courses  , Question , StudentAnswer , LectureAnswer, Marks  ) " + " VALUES (?,?,?,?,?,?)";
   con=connectDB();
   System.out.println("connection successful");
        statement = con.prepareStatement(MESS); 
        statement.setString(1, studentAnswer.getStudentNumber());
        statement.setString(2, studentAnswer.getCourses());
        statement.setString(3, studentAnswer.getQuestion());
        statement.setString(4, studentAnswer.getStudentAnswers());
        statement.setString(5, studentAnswer.getLectureAnswers());
        statement.setString(6, studentAnswer.getMarks());
        int rowINserted = statement.executeUpdate();
        if (rowINserted > 0) {
            System.out.println("insertion successfull");
          
            
            
        }
        statement.close();
    
    return studentAnswer;
}
 public  void ANNOUNCEMENT() 
 {
            System.out.println("MESSAGE DB");
            String Attendance = "CREATE TABLE APP.ANNOUNCEMENT ("
                    + "Subject VARCHAR(255),  Annous  VARCHAR(255), Date VARCHAR(255) )";
            System.out.println("Created Attendace ............ ");
             
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Attendance);
                System.out.println("MESSAGE Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
 }
 public WorkerMESSAGE InsertMESSAGE(WorkerMESSAGE MSG) throws SQLException
{
   String MESS= "INSERT INTO APP.SENDEMAI(LectureEmail, Student_Email, DATE , Message ) " + " VALUES (?,?,?,?)";
   con=connectDB();
   System.out.println("connection successful");
        statement = con.prepareStatement(MESS); 
        statement.setString(1, MSG.getStudentEmail());
        statement.setString(2, MSG.getLectureEmail());
        statement.setString(3, MSG.getMwssage());
        statement.setString(4, MSG.getDate());
        
        int rowINserted = statement.executeUpdate();
        if (rowINserted > 0) {
            System.out.println("insertion successfull");
          
            
            
        }
        statement.close();
    
    return MSG;
}
 public Time InsertTIME(Time time) throws SQLException
{
   String MESS= "INSERT INTO APP.FIRSTYEAR(firstyear, Math, dateMath , Physic,PhysicDate,Marketing,MarkingDate ) " + " VALUES (?,?,?,?,?,?,?)";
   con=connectDB();
   System.out.println("connection successful");
        statement = con.prepareStatement(MESS); 
        statement.setString(1, time.getYear());
        statement.setString(2, time.getProgram());
        statement.setString(3, time.getDateofProgram());
        statement.setString(4, time.getProgram2());
        statement.setString(5, time.getDateofProgram2());
        statement.setString(6, time.getProgram3());
        statement.setString(7, time.getDateofProgram3());
        
        int rowINserted = statement.executeUpdate();
        if (rowINserted > 0) {
            System.out.println("insertion successfull");
          
            
            
        }
        statement.close();
    
    return time;
}
  public void UpdateDetails(StudentAnswer house) throws ClassNotFoundException {

        try {
            String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
           String username = "KIM";
        String password = "CHRIS";
            con = DriverManager.getConnection(url, username, password);
           //StudentNumber,  Courses  , Question , StudentAnswer , LectureAnswer, Marks 
            int row = 0;
            String SQLupdate = "UPDATE APP.ANQUESTIONSS SET Question=? , Marks=? ";
            PreparedStatement ps = con.prepareStatement(SQLupdate);
            
            ps.setString(1, house.getQuestion());
            ps.setString(2, house.getMarks());

            row = ps.executeUpdate();

            if (row > 0) {
                System.out.println(" House Details Update ");

            } else {
                System.out.println("  Unsuccessful");
            }

        } catch (SQLException ex) {
            System.out.println("  unsuccessful" + ex);
        }

    }
public void UpdateEXZ(StudentAnswer house) throws ClassNotFoundException {

        try {
           String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
           String username = "KIM";
           String password = "CHRIS";
            con = DriverManager.getConnection(url, username, password);
           //StudentNumber,  Courses  , Question , StudentAnswer , LectureAnswer, Marks 
            int row = 0;
            String SQLupdate = "UPDATE APP.CCC SET Course=? , Lecture=? ";
            PreparedStatement ps = con.prepareStatement(SQLupdate);
            
            ps.setString(1, house.getQuestion());
            ps.setString(2, house.getMarks());

            row = ps.executeUpdate();

            if (row > 0) {
                System.out.println(" House Details Update ");

            } else {
                System.out.println("  Unsuccessful");
            }

        } catch (SQLException ex) {
            System.out.println("  unsuccessful" + ex);
        }

    }
 private void Attendance() 
 {
            System.out.println("Attendance DB");
            String Attendance = "CREATE TABLE APP.StudentsAttendance ("
                    + "StudentName VARCHAR(255),  Attendance VARCHAR(255),  NOtAttended VARCHAR(255) )";
            System.out.println("Created Attendace ............ ");
             
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(Attendance);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
 }
 public ArrayList <StudentAnswer> SelectId(String id) throws SQLException
 {
      ArrayList<StudentAnswer> list = new ArrayList<>();
      
       String query = "SELECT * FROM APP.ANQUESTIONSS WHERE StudentNumber = ?";
    
    String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
    String username = "KIM";
    String password = "CHRIS";
    Connection c = DriverManager.getConnection(url, username, password);
    PreparedStatement ps = c.prepareStatement(query);
    ps.setString(1, id);
    
    ResultSet rs = ps.executeQuery();
  
    
    while(rs.next()) {
      StudentAnswer v = new StudentAnswer();
      v.setStudentNumber(rs.getString("StudentNumber"));
      v.setCourses(rs.getString("Courses"));
      v.setQuestion(rs.getString("Question"));
      v.setStudentAnswers(rs.getString("StudentAnswer"));
      v.setLectureAnswers(rs.getString("LectureAnswer"));
      v.setMarks(rs.getString("Marks"));
      list.add(v);
    }
     return list;
 }
 public   ArrayList<StudentAnswer> selectAll() throws SQLException {
    ArrayList<StudentAnswer> list = new ArrayList<>();
    String query = "SELECT * FROM APP.ANQUESTIONSS";
    
    con=connectDB();
    PreparedStatement ps = con.prepareStatement(query);
    ResultSet rs = ps.executeQuery();
    while(rs.next()) {
    StudentAnswer vehicle = new StudentAnswer();
     vehicle.setStudentNumber(rs.getString("StudentNumber"));
     vehicle.setCourses(rs.getString("Courses"));
      vehicle.setQuestion(rs.getString("Question"));
     vehicle.setStudentAnswers(rs.getString("StudentAnswer"));
     vehicle.setLectureAnswers(rs.getString("LectureAnswer"));
     vehicle.setMarks(rs.getString("Marks"));
      list.add(vehicle);
    }
    return list; 
  }

public Student Login(Student login) throws SQLException
{
      String query=" select *from APP.STUDENTSS where Student_Email=? and  Student_password=?";
         statement=con.prepareStatement(query);
         statement.setString(1,login.getStudentEmail());
         statement.setString(2,login.getStudentPassword());
         ResultSet rs=statement.executeQuery();
         while(rs.next())
         {
             System.out.println("Welcome Login successfully");
         }
          
    return login;
}
public Student Insert(Student student) throws SQLException
{
   String SQL = "INSERT INTO APP.STUDENTSS (Student_Name, Student_Surname, Student_Email,Student_password,Student_Security,Student_Answer,Student_mobile,Student_date,Student_Gender,Student_Adress,Student_nation,Student_markone,Student_marktwo,Student_markthree,Student_fees ) " + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
   con=connectDB();
   System.out.println("connection successful");
        statement = con.prepareStatement(SQL); 
        statement.setString(1, student.getStudentName());
        statement.setString(2, student.getStudentSurname());
        statement.setString(3, student.getStudentEmail());
        statement.setString(4, student.getStudentPassword());
        statement.setString(5, student.getStudentSecurity());
        statement.setString(6, student.getStudentAnswer());
        statement.setString(7, student.getStudentMobile());
        statement.setString(8, student.getStudentDateOfBirthDay());
        statement.setString(9, student.getStudentGender());
        statement.setString(10, student.getStudentAdress());
        statement.setString(11, student.getStudentNationality());
        statement.setString(12, student.getStudentMarkone());
        statement.setString(13, student.getStudentMarktwo());
        statement.setString(14, student.getStudentMarkthree());
        statement.setString(15, student.getStudentFees());
        int rowINserted = statement.executeUpdate();
        if (rowINserted > 0) {
            System.out.println("insertion successfull");
            
            
        }
        statement.close();
    
    return student;
} 

public COURSESS CoursesINSERT(COURSESS student) throws SQLException
{
   String SQL = "INSERT INTO APP.Courses (Student_Name, Student_Surname, Student_Email,Faculty,Mois,program1,Lecture1,program2,Lecture2,program3,Lecture3) " + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
   con=connectDB();
   System.out.println("connection successful");
        statement = con.prepareStatement(SQL); 
        statement.setString(1, student.getStudentName());
        statement.setString(2, student.getStudentSurname());
        statement.setString(3, student.getStudentEmail());
        statement.setString(4, student.getFaculty());
        statement.setString(5, student.getMois());
        statement.setString(6, student.getProgram1());
        statement.setString(7, student.getLecture1());
        statement.setString(8, student.getProgram2());
        statement.setString(9, student.getLecture2());
        statement.setString(10, student.getProgram3());
        statement.setString(11, student.getLecture3());
        int rowINserted = statement.executeUpdate();
        if (rowINserted > 0) {
            System.out.println("insertion successfull");
            
            
        }
        statement.close();
    
    return student;
} 
 public void COURSESUpdate(COURSESS up) {

        try {
            con=connectDB();
           
          
            int row = 0;
            String SQLupdate = "UPDATE APP.Courses SET Student_Surname=?, Student_Email=? , Faculty=?, Mois=?, program1=?, Lecture1=? , program2=?, Lecture2=?, program3=?, Lecture3=? WHERE Student_Name=? ";
            statement= con.prepareStatement(SQLupdate);
            statement.setString(1, up.getStudentSurname());
            statement.setString(2, up.getStudentEmail());
            statement.setString(3, up.getFaculty());
            statement.setString(4, up.getMois());
            statement.setString(5, up.getProgram1());
            statement.setString(6, up.getLecture1());
            statement.setString(7, up.getProgram2());
            statement.setString(8, up.getLecture2());
            statement.setString(9, up.getProgram3());
            statement.setString(10, up.getLecture3());
            statement.setString(11, up.getStudentName());
            

            row = statement.executeUpdate();

            if (row > 0) {
                System.out.println(" Update ATT successful");

            } else {
                System.out.println("  unsuccessful");
            }

        } catch (SQLException ex) {
            System.out.println("  unsuccessful" + ex);
        }

    }
public Attendance InsertAttedance(Attendance Attend) throws SQLException
{
   String ATT= "INSERT INTO APP.StudentsAttendance (StudentName, Attendance, NOtAttended ) " + " VALUES (?,?,?)";
   con=connectDB();
   System.out.println("connection successful");
        statement = con.prepareStatement(ATT); 
        statement.setString(1, Attend.getStudentName());
        statement.setString(2, Attend.getAttend());
        statement.setString(3, Attend.getNotAttend());
        
        int rowINserted = statement.executeUpdate();
        if (rowINserted > 0) {
            System.out.println("insertion successfull");
          
            
            
        }
        statement.close();
    
    return Attend;
}
        
    

    public static void main(String[] args) throws SQLException {
         Database bd= new  Database();
        // bd.feedDatabase();
        // bd.TIMETABLEEFIRSTYERA();
        // bd.TIMETABLEESECONDYEAR();
        //bd.ANNOUNCEMENT();
       // bd.QUESTION();
       // bd.ANSWERQUESTION();
       //bd.COUR();
       // bd. Pictures();
       //  bd.ACCOUNTB();
      // bd.BANKDatabase();
       //bd.BA();
       //bd.Attendance();
       //bd.Courses() ;
       bd.LECTURE();
    }
    
}
