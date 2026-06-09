public class EmployeeRecord {
    public static void main(String[] args) {

        String name = "John Doe";
        double salary = 65000;
        String department = "Finance";
        boolean active = true;

        String performance =
                salary > 60000 ? "Excellent" : "Average";

        System.out.println(
                "Employee: " + name +
                " | Department: " + department +
                " | Salary: " + salary +
                " | Active: " + active +
                " | Performance: " + performance
        );
    }
}
