package com.lesson5;

public class Test {
    public static void main(String[] args) {
//        Employee employee1 =
//                new Employee("Кожевников Роман Владимирович", "qa", "rr@g.ru", "89870167771", 150000, 35);
//        employee1.printEmployee(employee1);

        printIf40();
    }

    public static void printIf40() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Petrov petr", "Analyst", "fff@h.ru", "88888555", 1230000, 23);
        employees[1] = new Employee("Ivanov Ivan", "Engineer", "f111ff@h.ru", "889999888555", 1450000, 45);
        employees[2] = new Employee("Sidorov Sidr", "QA", "dddd111ff@h.ru", "87689995444445", 1850200, 55);
        employees[3] = new Employee("Emelyanov Emelya", "QA-Auto", "56r111ff@h.ru", "998991111", 200000, 41);
        employees[4] = new Employee("Polynov Denis", "Java-Dev", "678r111ff@h.ru", "789654122355", 120000, 40);

        for (Employee employee : employees)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }


}





