package Course.Course1.HomeWorks.HomeWork5;

public class WorkingEnterprise {

    public static void main(String[] args) {

        Employee employee_1 = new Employee("Ivanov I.I.", "Director", true, 2250105, 300, 50);
        employee_1.info();
        System.out.println();
        System.out.println();

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov I.I.", "Director", true, 2250105, 300, 50);
        employees[1] = new Employee("Petrova N.I.", "Accountant", true, 2270905, 150, 45);
        employees[2] = new Employee("Vasilenko O.I.", "Lawyer", false, 2450106, 100, 42);
        employees[3] = new Employee("Bodrjakov A.E.", "HR Officer", false, 2500902, 70, 35);
        employees[4] = new Employee("Vetrov I.P.", "Driver", true, 2550102, 40, 33);

        for (Employee employee : employees) {
            employee.ageInfo();
        }

    }


}
