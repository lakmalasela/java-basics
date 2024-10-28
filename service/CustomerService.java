package service;

import entity.CustomerEntity;

import java.util.List;

public interface CustomerService {


    // Method to retrieve the list of students
    List<CustomerEntity> getStudentList();

    // Method to insert a student into the list
    void insertStudent(CustomerEntity student);

    // Method to delete a student from the list
    void deleteStudent(CustomerEntity student);

    // Method to update a student in the list
    void updateStudent(CustomerEntity oldStudent, CustomerEntity newStudent);
}
