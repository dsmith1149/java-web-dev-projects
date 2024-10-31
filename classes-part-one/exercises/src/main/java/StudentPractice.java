public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student student3 = new Student("Dantayvion Smith", 12525, 1, 4.0);
        Student student1 = new Student("Alice Parson", 10122, 1, 3.9);
        Student student2 = new Student("Bobby Johnson", 10223, 1, 3.7);
        Student student4 = new Student("Shayna McLendon", 15678, 1, 3.9);

        // Create a course
        Course javaCourse = new Course("Java Programming", "Dolly Parton");
        Course algebraCourse = new Course("Algebra Bitch", "Garney Ball");
        Course constructionCourse = new Course("Build Some Shit", "Mundo Jaxson");

        // Enroll students
        javaCourse.addStudent(student1);
        javaCourse.addStudent(student2);
        javaCourse.addStudent(student3);
        algebraCourse.addStudent(student3);
        constructionCourse.addStudent(student3);
        algebraCourse.addStudent(student1);
        constructionCourse.addStudent(student2);
        constructionCourse.addStudent(student1);
        algebraCourse.addStudent(student1);
        algebraCourse.addStudent(student4);
        constructionCourse.addStudent(student4);

        // Print course information
        javaCourse.printCourseInfo();
        constructionCourse.printCourseInfo();
        algebraCourse.printCourseInfo();
    }
}

