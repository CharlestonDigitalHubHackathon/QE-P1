package quality.education.q1.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class StudentRepository {

    private ArrayList<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void removeStudent(Long id) {
        for (Student student:students) {
            if (student.getId().equals(id)) {
                students.remove(student);
            }
        }
    }

    public Student findById(Long id) {
        for (Student student:students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return students.get(0);
    }


}
