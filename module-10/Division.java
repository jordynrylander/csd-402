/*
 * Jordyn Rylander
 * Module 10.2 Assignment
 * CSD 402
 *
 * this abstract class represents a company division
 */

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}