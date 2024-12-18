public class HourlyEmployee extends Employee {
    private double hours; // hours worked
    private double wage;  // hourly wage

    // Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber); // call superclass constructor
        setWage(wage); // validate and set wage
        setHours(hours); // validate and set hours
    }

    // Set wage (ensures it's nonnegative)
    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0");
        }
        this.wage = wage;
    }

    // Get wage
    public double getWage() {
        return wage;
    }

    // Set hours (ensures it's between 0 and 168)
    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours worked must be between 0 and 168");
        }
        this.hours = hours;
    }

    // Get hours
    public double getHours() {
        return hours;
    }

    // Calculate earnings
    @Override
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return (40 * wage) + ((hours - 40) * wage * 1.5);
        }
    }

    // Return string representation of HourlyEmployee
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: %.2f%n%s: %.2f", 
            super.toString(),
            "hourly wage", getWage(),
            "hours worked", getHours());
    }
}
