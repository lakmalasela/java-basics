package service.impl;

import service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements StudentService {

    private List<String> studentList = new ArrayList<>();
    private int studentCounter = 1;



    // Method to insert a student into the list
    @Override
    public void insertStudent(String student) {
        String studentNumber = createStudentnumber();

        studentList.add(studentNumber + " - " + student);
        System.out.println(studentNumber + " - " + student + " has been added.");
    }

    // Method to retrieve the list of students
    @Override
    public List<String> getStudentList() {
        return studentList;
    }

    // Method to delete a student from the list
    @Override
    public void deleteStudent(String student) {
        if(studentList.remove(student)) {
            System.out.println(student + " has been removed.");
        } else {
            System.out.println(student + " not found.");
        }
    }

    // Method to update a student in the list
    @Override
    public void updateStudent(String oldStudent, String newStudent) {
        int index = studentList.indexOf(oldStudent);
        if(index != -1) {
            studentList.set(index, newStudent);
            System.out.println(oldStudent + " has been updated to " + newStudent);
        } else {
            System.out.println(oldStudent + " not found.");
        }
    }

    //student number create
    private String createStudentnumber(){

        String studentNumber = String.format("S%03d", studentCounter);
        studentCounter++;
        return studentNumber;
    }



    // Main method to test the implementation
    public static void main(String[] args) {
        // Create an object of StudentImpl
        StudentImpl studentImpl = new StudentImpl();

        // Insert students
        studentImpl.insertStudent("Kamal");
        studentImpl.insertStudent("Vishwa");
        studentImpl.insertStudent("Chamara");

        // Display the student list
//        System.out.println("Student List: " + studentImpl.getStudentList());
//
//        // Update a student
////        studentImpl.updateStudent("Kamal", "Kamal Perera");
//
        // Display the student list after update
//        studentImpl.updateStudent("S001 - Kamal", "S001 - Kamal Perera");
//
//        // Delete a student
        studentImpl.deleteStudent("S002 - Vishwa");
//
//        // Display the student list after deletion
//        System.out.println("Final Student List: " + studentImpl.getStudentList());
    }



}
