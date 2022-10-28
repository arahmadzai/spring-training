package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //Display all employees with email address ''
    List<Employee> findByEmail(String email);

    //Display all employees with firstname "" and Last name "",
    //also all employees with a email address ""

    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname, String lastname, String email);

    //Display all employees that first name is not ""
    List<Employee> findByFirstNameIsNot(String name);

    //display all employees where last name starts with ""
    List<Employee> findByLastNameStartingWith(String ch);

    //Display all employees with salaries less than
    List<Employee> findBySalaryGreaterThan(Integer salary);
    //Display all employees with salaries higher than
    List<Employee> findBySalaryLessThan(Integer salary);

    //Display all employees that has been hired on date ""
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employee where salaries great and equal to "" in order-salary
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    //Display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    @Query("select e FROM Employee e where e.email = 'amcnee1@google.es'")
    Employee retrieveByEmail();

    @Query("SELECT e.salary from Employee e where e.email= 'amcnee1@google.es'")
    Integer retrieveEmployeeSalary();

    //Not Equal
    @Query("SELECT e from Employee e where e.salary <> ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

    //Like / Contains / StartsWith / EndsWith
    @Query("SELECT e from Employee e where e.firstName like ?1")
    List<Employee> retrieveEmployeeFistNameLike(String pattern);

    //Less than
    @Query("SELECT e from Employee e where e.salary < ?1")
    List<Employee> retrieveEmployeeSalaryLessThan(int salary);

    //Greater than
    @Query("SELECT e from Employee e where e.salary > ?1")
    List<Employee> retrieveEmployeeSalaryGreaterThan(int salary);

    //Show only first name of employee for the given salary
    @Query("SELECT e.firstName from Employee e where e.salary > ?1")
    List<Employee> retrieveFirstNameEmployeeSalary(int salary);

    //Between
    @Query("SELECT e.firstName from Employee e where e.salary >= ?1 AND e.salary <=?2")
    List<Employee> retrieveFirstNameSalaryBetween(int fromSalary, int toSalary);

    @Query("SELECT e from Employee e where e.salary >= ?1 AND e.salary <=?2")
    List<Employee> retrieveSalaryBetween(int fromSalary, int toSalary);

    //Before
    @Query("select e from Employee e where e.hireDate > ?1")
    List<Employee> retrieveEmployeeHiredBeforeDate(LocalDate date);

    //Null
    @Query("SELECT e from Employee e where e.email is null")
    List<Employee> retrieveEmployeeEmailIsNull();

    @Query("SELECT e from Employee e where e.email is not null")
    List<Employee> retrieveEmployeeEmailIsNotNull();

    //Sorting is ASC order
    @Query("SELECT e FROM Employee e order by e.salary")
    List<Employee> retrieveEmployeeSalaryOrderAsc();

    @Query("SELECT e FROM Employee e order by e.salary desc ")
    List<Employee> retrieveEmployeeSalaryOrderDesc();
}
