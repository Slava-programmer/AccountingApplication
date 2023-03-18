public class Employee {
    private String name;
    private int department;
    private int salary;
    private int idEmp;

    public Employee(String name, int department,int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.idEmp = Accounting.id;
        Accounting.id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIdEmp() {
        return idEmp;
    }
}
