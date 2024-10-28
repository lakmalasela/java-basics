package service;

import java.util.List;

public interface StudentService {

    // Method to insert a student into the list
    void insertStudent(String student);

    // Method to retrieve the list of students
    List<String> getStudentList();


    // Method to delete a student from the list
    void deleteStudent(String student);

    // Method to update a student in the list
    void updateStudent(String oldStudent, String newStudent);
}
