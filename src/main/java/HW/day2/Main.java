package HW.day2;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(new Student("Dhay",1001));
        studentManager.addStudent(new Student("Ali",1002));
        studentManager.addStudent(new Student("Hamad",1003));

        int Idsearch =1002;
        Student foundStudent = studentManager.getStudentById(Idsearch);
        if (foundStudent != null){
            System.out.println("Student found: " + foundStudent.getName() + "(ID: " +foundStudent.getId() +")");
        }else {
            System.out.println("Student with ID " + Idsearch +"not found.");
        }

        System.out.println("\nAll Student:");
        for (Student student : studentManager.getAllStudents()){
            System.out.println(student.getName() + "(ID: " + student.getId() + ")");
        }

        int removeId =1003;
        if (studentManager.removeStudentById(removeId)){

            System.out.println("\nStudent with ID " + removeId + " remove. ");
        }else {
            System.out.println("\nStudent with ID " + removeId +"not found for remeval. ");
        }

        System.out.println("\nStudents after removal:");
        for (Student student : studentManager.getAllStudents()){
            System.out.println(student.getName() + "(ID: " + student.getId() +")");
        }
    }
}
