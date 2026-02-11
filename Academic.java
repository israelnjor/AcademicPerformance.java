
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

  private char calclulateLetterGrade(double score, char grade) {
    if (score <= 100 and score >= 90) {
      return grade = 'A';
    }
    else if (score >= 80) {
      return grade = 'B';
    }
    else if (score >= 70) {
      return grade = 'C';
    }
    else if (score >= 60) {
      return grade = 'D';
    }
    else if (score < 60 and score >= 0) {
      return grade = F;
    }
    else {
      return "Invalid score";
    } 
  }

  public String getAcademicStatus(char grade, double attendanceRate) {
    if (grade == F) {
      System.out.println("You have failed. Try harder next");
    }
    else if (attendanceRate < 50) {
      System.out.println("You have falid due to low attendance");
    }
    else if (grade == A || grade == B && attendanceRate >= 75) {
      System.out.println("Excellent Standing);
    }
    else:
      System.out.println("Pass");
  }

  public void improveScore(double extraMarks) {
    if (extraMarks >= 0 && ((extraMarks + score) <= 100)) {
       return score += extraMarks;
    System.out.println(score);
    }
    return;
  }
  


  
  
