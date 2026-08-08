package service;

import model.Employee;
import java.util.ArrayList;

public class EmployeeService {

    ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee emp) {
        list.add(emp);
    }

    public ArrayList<Employee> getAllEmployees() {
        return list;
    }

    public Employee searchEmployee(int id) {

        for (Employee e : list) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void removeEmployee(int id) {

        Employee emp = searchEmployee(id);

        if (emp != null) {
            list.remove(emp);
        }
    }
}