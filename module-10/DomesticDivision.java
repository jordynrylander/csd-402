/*
 * Jordyn Rylander
 * Module 10.2 Assignment
 * CSD 402
 *
 * this class represents a domestic company division
 */

public class DomesticDivision extends Division {

    private String state;

    public DomesticDivision(String divisionName,
                            int accountNumber,
                            String state) {

        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}