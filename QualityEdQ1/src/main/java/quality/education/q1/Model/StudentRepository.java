package quality.education.q1.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class StudentRepository {

    private ArrayList<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<Student>();
        students.add(new Student(1000,"Amanda", "Franks", "Wildlife", "Female", 12));
        students.add(new Student(1001,"Eloise", "Gonzales", "Sea Life", "Female", 12));
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void removeStudent(Integer id) {
        for (Student student:students) {
            if (student.getId().equals(id)) {
                students.remove(student);
            }
        }
    }

    public Student findById(Integer id) {
        for (Student student:students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return students.get(0);
    }


}
