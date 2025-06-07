package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Arrays;
import java.util.List;

public class EntityManagerUtil {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJPAUnit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        /*em.getTransaction().begin();

        Employee abc = Employee.builder()
                .name("abc")
                .age(10)
                .salary(1000.0)
                .build();
        Employee abc1 = Employee.builder()
                .name("abc1")
                .age(10)
                .salary(1000.0)
                .build();
        Employee abc2 = Employee.builder()
                .name("abc2")
                .age(10)
                .salary(1000.0)
                .build();

        List<Employee> employees = Arrays.asList(abc, abc1, abc2);
        Department department = Department.builder()
                .name("Engineering")
                .employees(employees)
                .build();
        employees.forEach(employee -> employee.setDepartment(department));
        em.persist(department);*/

        /*Department department = em.find(Department.class, 1L);
        System.out.println(department);*/

/*
        Employee employee = em.find(Employee.class, 1L);
        System.out.println(employee.getName());
        System.out.println(employee.getDepartment());

*/
        /*Employee employee = em.find(Employee.class, 1L);
        em.remove(employee);*/

        /*Course management = Course.builder()
                .name("Management")
                .build();
        em.persist(management);*/

        /*Student jack = Student.builder()
                .name("Jack")
                .age(10)
                .build();
        em.persist(jack);

        Student jack1 = Student.builder()
                .name("Jack1")
                .age(10)
                .build();
        em.persist(jack1);*/

        /*Course course = em.find(Course.class, 1L);
        Student student = em.find(Student.class, 1L);
        Student student1 = em.find(Student.class, 2L);
        course.setStudents(Arrays.asList(student, student1));

        em.persist(course);*/


        List resultList = em.createNativeQuery("SELECT * FROM STUDENT", Student.class).getResultList();
        System.out.println(resultList);


        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
