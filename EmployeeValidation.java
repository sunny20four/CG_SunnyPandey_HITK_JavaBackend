public class EmployeeValidation {

    public static boolean validateEmployeeCode(String code) {

        boolean starts = code.startsWith("EMP");
        boolean containsDept = code.contains("FIN")
                            || code.contains("HR")
                            || code.contains("IT")
                            || code.contains("MKT");

        boolean endsWithFourDigits =
                code.matches(".*\\d{4}$");

        return starts && containsDept && endsWithFourDigits;
    }

    public static void main(String[] args) {

        String code = "EMP-FIN-2042";

        if(validateEmployeeCode(code))
            System.out.println("Valid Employee Code");
        else
            System.out.println("Invalid Employee Code");
    }
}