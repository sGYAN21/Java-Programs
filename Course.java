public class Course {
    static int maxCapacity=100;
    String CourseName;
     int enrollments;
     String[] enrolledStudents = new String[maxCapacity];
     Course(String CourseName)
     {
         this.CourseName = CourseName;
         this.enrollments =0;
         this.enrolledStudents= new String[maxCapacity];
     }


     static void setMaxCapacity(int maxCapacity)
    {
        Course.maxCapacity= maxCapacity;
    }
    void enrollStudent(String studentName)
    {
        enrolledStudents[enrollments]= studentName;
        enrollments--;
    }

}
