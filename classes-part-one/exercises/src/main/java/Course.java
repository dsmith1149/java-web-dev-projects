import java.util.HashMap;

public class Course {
    private String courseName;
    private String teacher;
    private HashMap<Integer, Student> enrolledStudents;

    public Course(String courseName, String teacher){
        this.courseName = courseName;
        this.teacher = teacher;
        this.enrolledStudents = new HashMap<>();
    }
    public void addStudent(Student student){
        enrolledStudents.put(student.getStudentId(), student);
    }
      public void removeStudent(int studentId){
        enrolledStudents.remove(studentId);
    }
    public void printCourseInfo(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Teacher: " + teacher);
        System.out.println("Enrolled Student: ");
        for (Student student : enrolledStudents.values()){
            System.out.println("-" + student.getName() + " (ID: " + student.getStudentId() + ")");
        }
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public HashMap<Integer, Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(HashMap<Integer, Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
