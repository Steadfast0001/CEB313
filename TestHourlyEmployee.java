public class TestHourlyEmployee {
    public static void main(String[] args) {
        // Create an HourlyEmployee object
        HourlyEmployee employee = new HourlyEmployee(
            "John", "Doe", "123-45-6789", 15.50, 50);

        // Display HourlyEmployee information
        System.out.println("Employee information obtained by toString:");
        System.out.println(employee);

        // Display earnings
        System.out.printf("%n%s: $%.2f%n", "Earnings", employee.earnings());
    }
}
