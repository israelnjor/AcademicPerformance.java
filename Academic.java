
public class Academic {
  private String studentName;
  private final int studentId;
  private double score;
  private double attendanceRate;

//CONSTRUCTORS
public Academic(String studentname, int studentId, double score, double attendanceRate) {
  this.studentName = studentName;
  this.studentId = studentId;
  this.score = score;
  score >= 0 and score <= 100;
  this.attendanceRate = attendanceRate;
    if attendanceRate < 0 || attendanceRate > 100:
      attendancerate = 0;

  //GETTERS

  public String getStudentName() {
    return studentName;
  }
  public int getStudentId() {
    return studentId;
  }
  public double getScore() {
    return score;
  }
  public double getAttendanceRate() {
    return AttendanceRate;
  }

  private char calclulateLetterGrade(double score) {
    if (score <= 100 and score >= 90) {
      return 'A';
    }
    else if (score >= 80) {
      return 'B';
    }
    else if (score >= 70) {
      return 'C';
    }
    else if (score >= 60) {
      return 'D';
    }
    else if (score < 60 and score >= 0) {
      return F;
    }
    else {
      return "Invalid score";
    } 
  }

  public String getAcademicStatus(double score, double attendanceRate) {
    
  }
  


  
  
