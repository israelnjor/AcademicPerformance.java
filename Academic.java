public class AcademicPerformance {
  private String studentName;
  private final int studentId;
  private double score;
  private double attendanceRate;

//CONSTRUCTORS
   public AcademicPerformance(String studentName, int studentId, double score, double attendanceRate) {
   this.studentName = studentName;
   this.studentId = studentId;
   this.score = score;
   if (score < 0 || score > 100) {
      this.score = 0;
   }
   if (attendanceRate < 0 || attendanceRate > 100) {
         this.attendanceRate = 0;
      }
      else {
         this.attendanceRate = attendanceRate;
      }
   }
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
      return attendanceRate;
   }

   private char calculateLetterGrade(double score) {
      if (score <= 100 && score >= 90) {
         return'A';
      }
      else if (score >= 80) {
         return'B';
      }
      else if (score >= 70) {
         return'C';
      }
      else if (score >= 60) {
         return'D';
      }
      else if (score < 60 && score >= 0) {
         return'F';
      }
      else {
         System.out.println("Invalid Score");
         return 'X';
      } 
   }

   public String getAcademicStatus() {
      char grade = calculateLetterGrade(score);
      if (grade == 'F') {
         System.out.println("You have failed. Try harder next");
      }
      else if (attendanceRate < 50) {
         System.out.println("You have failed due to low attendance");
      }
      else if (grade == 'A' || grade == 'B' && attendanceRate >= 75) {
         System.out.println("Excellent Standing!🧠");
      }
      else {
         System.out.println("Pass");
      }

      return null;
   }

   public void improveScore(double extraMarks) {
      if (extraMarks >= 0 && ((extraMarks + score) <= 100)) {
         score += extraMarks;
      System.out.println("Score updated to: " + score);
      }
      else {
         System.out.println("Invalid extra marks. Score remains unchanged.");
      }
   }

   public static void main(String[] args) {
       AcademicPerformance student1 = new AcademicPerformance("Israel", 22302635, 98, 99);
       System.out.println("Student Name: " + student1.getStudentName());
         System.out.println("Student ID: " + student1.getStudentId());
         System.out.println("Score: " + student1.getScore() + "%");
         System.out.println("Attendance Rate: " + student1.getAttendanceRate() + "%");
       student1.getAcademicStatus();

         student1.improveScore(2);


   }

}  
  
