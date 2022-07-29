
package fr.m2i.jsfwebapp;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "userData", eager = true)
public class UserData {

    private static final List<Employee> employees = new ArrayList() {
        {
            add(new Employee("Anthony", "IT", 28, 3000.00));
            add(new Employee("John", "Marketing", 42, 3700.00));
            add(new Employee("Joe", "Sales", 21, 1800.00));
        }
    };

    public  List<Employee> getEmployees() {
        return employees;
    }
}