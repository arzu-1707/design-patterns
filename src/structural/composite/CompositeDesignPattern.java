package structural.composite;

import java.util.ArrayList;
import java.util.List;
/*
    Meqsed: Birden cox obyektin tek obyekt kimi davranmasini temin etmek
    Composite pattern birden cox obyektin tek obyekt kimi davranmasini temin edir
    Meselen: sirket strukturu CEO, menecerler ve isciler

 */

public class CompositeDesignPattern {
    public static void main(String[] args) {
        Employee employeeWeb = new Developer("Aysel", "Web Developer");
        Employee employeeFront = new Developer("Rasim", "Front End Developer");
        Manager managerDev = new Manager("Aygun", "Manager of Developer");
        managerDev.add(employeeFront);
        managerDev.add(employeeWeb);

        Manager employeeHr1 = new Manager("Samir", "HR");
        Employee employeeHr2 = new Manager("Yusif", "HR");
        Manager manager = new Manager("Gunel", "Head of HR");
        manager.add(employeeHr1);
        manager.add(employeeHr2);

        Manager CEO = new Manager("Aynur", "CEO");
        CEO.add(managerDev);
        CEO.add(manager);

        CEO.showInfo();


    }
}

interface Employee {
    void showInfo();
}

 class Developer implements Employee {
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showInfo() {
        System.out.println(name + " --- " +position);
    }
 }

class Manager implements Employee{
    private String name;
    private String position;
    List<Employee> employeeList = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void add(Employee employee){
        employeeList.add(employee);
    }
    @Override
    public void showInfo() {
        System.out.println(name + " --- " + position);
        for (Employee employee: employeeList){
            employee.showInfo();
        }
    }
}

