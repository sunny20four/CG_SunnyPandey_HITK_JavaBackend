public class EmployeeSummary {
    public static void main(String[] args) {

        String emp1 = "  John Doe  ";
        String emp2 = "Alice Smith";
        String emp3 = "Robert Brown";
        String emp4 = "Emma Wilson";
        String emp5 = "David Lee";

        double salary1 = 65000.75;
        double salary2 = 55000.50;
        double salary3 = 72000.25;
        double salary4 = 48000.80;
        double salary5 = 61000.90;

        int age1 = 28;
        int age2 = 32;
        int age3 = 40;
        int age4 = 25;
        int age5 = 35;

        boolean active1 = true;
        boolean active2 = true;
        boolean active3 = false;
        boolean active4 = true;
        boolean active5 = true;

        int roundedSalary1 = (int) salary1;
        double convertedAge1 = (double) age1;

        String name = emp1.trim();
        String upperName = name.toUpperCase();
        String lowerName = name.toLowerCase();
        int nameLength = name.length();

        String performance =
                salary1 > 60000 ? "Excellent" : "Average";

        System.out.println("========================================");
        System.out.println("         EMPLOYEE SUMMARY REPORT");
        System.out.println("========================================");

        System.out.println("Employee 1 : " + name);
        System.out.println("Upper Case : " + upperName);
        System.out.println("Lower Case : " + lowerName);
        System.out.println("Name Length: " + nameLength);
        System.out.println("Salary     : " + salary1);
        System.out.println("Performance: " + performance);
        System.out.println();

        System.out.println("Employee 2 : " + emp2 +
                " | Salary: " + salary2 +
                " | Active: " + active2);

        System.out.println("Employee 3 : " + emp3 +
                " | Salary: " + salary3 +
                " | Active: " + active3);

        System.out.println("Employee 4 : " + emp4 +
                " | Salary: " + salary4 +
                " | Active: " + active4);

        System.out.println("Employee 5 : " + emp5 +
                " | Salary: " + salary5 +
                " | Active: " + active5);

        System.out.println("\nCasting Examples:");
        System.out.println("Salary after casting to int = "
                + roundedSalary1);
        System.out.println("Age after casting to double = "
                + convertedAge1);
    }
}