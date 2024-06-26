package HW.day2;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudentById(int id){
        for (Student student : students){
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }

    public boolean removeStudentById(int id){
        Student studentRemove = getStudentById(id);
        if (studentRemove != null){
            return students.remove(studentRemove);
        }
        return false;
    }
}
