public class Accounting {
    Employee[] employees = new Employee[10];

    static int id = 0;

    public void start() {

        employees[0] = new Employee("Иванов", 2, 50_000);
        employees[1] = new Employee("Biden", 1, 150_000);
        employees[2] = new Employee("Волков", 4, 48_000);
        employees[3] = new Employee("Песков", 3, 1_500_000);
        employees[4] = new Employee("Гудков", 5, 23_000);

        printAllEmployees();
        System.out.println("Зарплата всех сотрудников в месяц - " + calculateSalaryOfMonth() + " рублей");
        System.out.println("Минимальная зарплата у сотрудника "+employees[findMinSalary()].getName()+" - "+employees[findMinSalary()].getSalary()+" рублей");
        System.out.println("Максимальная зарплата у сотрудника "+employees[findMaxSalary()].getName()+" - "+employees[findMaxSalary()].getSalary()+" рублей");
        System.out.println("Средняя зарплата по предприятию - "+calculateSalaryOfMonth()/2 + " рублей");
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println("Сотрудник " + employee.getName() + ", отдел " + employee.getDepartment() + ", оклад " + employee.getSalary() + " рублей");
        }
    }

    public int calculateSalaryOfMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public int findMinSalary() {
        int min = 1_000_000;
        int idTMP = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                idTMP = employee.getIdEmp();
            }
        }
        return idTMP;
    }
    public int findMaxSalary() {
        int min = 0;
        int idTMP = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() > min) {
                min = employee.getSalary();
                idTMP = employee.getIdEmp();
            }
        }
        return idTMP;
    }
}
