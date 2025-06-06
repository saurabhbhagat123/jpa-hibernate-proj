/*
package org.example;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        */
/*Department department = Department.builder()
                .name("Engineering")
                .build();

        Employee employee = Employee.builder()
                .name("Sam")
                .age(11)
                .salary(1001.0)
                .department(department)
                .build();

        session.save(employee);*//*


        */
/*Employee employee = session.get(Employee.class, 1L);
        System.out.println(employee);*//*

        //System.out.println(employee.getDepartment().getName());

        */
/*Set<ConstraintViolation<Employee>> valConstraintViolations = validator.validate(employee);
        valConstraintViolations.forEach(System.out::println);
        if (!valConstraintViolations.isEmpty()) {
            throw new RuntimeException("Validation failed");
        }*//*


        //employee = session.get(Employee.class, 1L); // get select query

        session.getTransaction().commit();
        session.close();

    }

    private void filter() {

        //employee.setName("Sam"); // Update
        Main main = new Main();
        //main.executeWithinTransaction((session -> session.save(employee)));

        //main.executeWithinTransaction((session -> session.delete(employee)));

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query<Employee> query = session.createQuery("from Employee" +
                " where (:name is null or name=:name)" +
                " and (:age is null or age=:age)" +
                " and (:sal is null or salary=:sal)", Employee.class);
        query.setParameter("name", "Sam");
        query.setParameter("age", 11);
        query.setParameter("sal", 1001.0);
        List<Employee> list = query.list();
        System.out.println(list);
    }

    private void executeWithinTransaction(Consumer<Session> sessionConsumer) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            sessionConsumer.accept(session);// at this place body of consumer executes

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();

            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
    }
}*/
