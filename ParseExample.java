public class ParseExample {
    public static void main(String[] args) {

        String ageStr = "25";
        String salaryStr = "35000.50";

        int age = Integer.parseInt(ageStr);
        double salary = Double.parseDouble(salaryStr);

        int ageAfter5Years = age + 5;
        double annualSalary = salary * 12;

        System.out.println("Age after 5 years = " + ageAfter5Years);
        System.out.println("Annual Salary = " + annualSalary);
    }
}