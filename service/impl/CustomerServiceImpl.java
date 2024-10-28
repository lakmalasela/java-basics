package service.impl;

import entity.CustomerEntity;
import service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private List<CustomerEntity> customerList = new ArrayList<>();


    @Override
    public List<CustomerEntity> getStudentList() {
        return customerList;
    }

    @Override
    public void insertStudent(CustomerEntity customer) {
        customerList.add(customer);
        System.out.println("Customer " + customer.getName() + " has been added.");
    }

    @Override
    public void deleteStudent(CustomerEntity customer) {
        if (customerList.remove(customer)) {
            System.out.println("Customer " + customer.getName() + " has been removed.");
        } else {
            System.out.println("Customer " + customer.getName() + " not found.");
        }
    }

    @Override
    public void updateStudent(CustomerEntity oldCustomer, CustomerEntity newCustomer) {
        int index = customerList.indexOf(oldCustomer);
        if (index != -1) {
            customerList.set(index, newCustomer);
            System.out.println("Customer " + oldCustomer.getName() + " has been updated to " + newCustomer.getName());
        } else {
            System.out.println("Customer " + oldCustomer.getName() + " not found.");
        }
    }

    public static void main(String[] args) {

        CustomerServiceImpl customerServiceimpl = new CustomerServiceImpl();


        CustomerEntity customer1 = new CustomerEntity(1L, "Alice");
        CustomerEntity customer2 = new CustomerEntity(2L, "Bob");
        CustomerEntity customer3 = new CustomerEntity(3L, "Charlie");

        // Insert customers
        customerServiceimpl.insertStudent(customer1);
        customerServiceimpl.insertStudent(customer2);
        customerServiceimpl.insertStudent(customer3);

        // Display all customers
//        System.out.println("Customer List:");
//        for (CustomerEntity customer : customerServiceimpl.getStudentList()) {
//            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getName());
//        }

        // Update a customer
//        CustomerEntity updatedCustomer2 = new CustomerEntity(1L, "Robert");
//        customerServiceimpl.updateStudent(customer2, updatedCustomer2);

        // Display customers after update
//        System.out.println("\nCustomer List after update:");
//        for (CustomerEntity customer : customerServiceimpl.getStudentList()) {
//            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getName());
//        }

        // Delete a customer
        customerServiceimpl.deleteStudent(customer1);

        // Display customers after deletion
        System.out.println("\nCustomer List after deletion:");
        for (CustomerEntity customer : customerServiceimpl.getStudentList()) {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getName());
        }
    }
}
