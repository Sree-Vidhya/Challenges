package com.myob;

import java.util.Collection;
import java.util.HashMap;

public class EmployeeRecordManager {


    private static HashMap<String, Employee> hmapEmployeeTable = new HashMap<>();

    public static void addEmployee(Employee emp) {
        hmapEmployeeTable.put(emp.getEmpCode(), emp);
    }

    public static void deleteEmployee(String empCode) {
        hmapEmployeeTable.remove(empCode);
    }

    public static void deleteEmployee(Employee employee) {

        if(employee == null || !(hmapEmployeeTable.remove(employee.getEmpCode(),employee))) {
            System.out.println("No such employee in database");
        }
    }

    public static Collection<Employee> getAllEmployees() {
        return hmapEmployeeTable.values();
    }

    public static Employee getEmployee(String empCode) {
        return hmapEmployeeTable.get(empCode);
    }

}
