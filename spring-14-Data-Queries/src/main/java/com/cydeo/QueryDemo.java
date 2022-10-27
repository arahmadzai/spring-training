package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("---------------REGIONS--------------------------");
        System.out.println("findByCountry:"+ regionRepository.findByCountry("Canada"));
        System.out.println("findByCountryContaining:"+ regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainsOrderByRegionDesc:"+ regionRepository.findByCountryContainsOrderByRegion("United"));
        System.out.println("findTop2Countries:"+ regionRepository.findTop2ByCountry("United States"));
        System.out.println("findTopCounty:"+ regionRepository.findTopByCountryContainsOrderByRegion("United States"));

        System.out.println("---------------DEPARTMENTS--------------------------");
        System.out.println("findByDepartment:"+ departmentRepository.findByDepartment("Furniture"));
        System.out.println("findByDivision:"+ departmentRepository.findByDivision("Health"));
        System.out.println("findByDivisionEndWith:"+ departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("findDistinctTop3ByDivisionContains:"+ departmentRepository.findDistinctTop3ByDivisionContains("Health"));

        System.out.println("---------------EMPLOYEES--------------------------");

//        System.out.println("findByEmail: "+employeeRepository.findByEmail());
//        System.out.println("findbyFirstNameLastNameOrEmail: "+employeeRepository.findByFirstNameAndLastNameOrEmail());
        System.out.println(employeeRepository.retrieveByEmail());
        System.out.println(employeeRepository.retrieveEmployeeSalary());

    }
}
