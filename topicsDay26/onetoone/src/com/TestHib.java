package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHib {
    public static void main(String[] args) {
        // Load Hibernate configuration
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Create a new Employee
        Employee employee = new Employee();
        employee.setFirstName("ram");
        employee.setLastName("kumar");
        employee.setSalary(20000);

        // Perform operations
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Save employee
        session.save(employee);

        // Retrieve and update employee
        Employee retrievedEmployee = session.get(Employee.class, employee.getId());
        if (retrievedEmployee != null) {
            retrievedEmployee.setSalary(60000);
            session.update(retrievedEmployee);
        }

       

        transaction.commit();
        session.close();

        // Close the factory
        sessionFactory.close();
    }
}
