/*
 * Jordyn Rylander
 * Module 10.2 Assignment
 * CSD 402
 *
 * this program creates and displays domestic and international
 * company divisions
 */

public class UseDivision {

    public static void main(String[] args) {

        InternationalDivision international1 =
                new InternationalDivision(
                        "European Sales",
                        1001,
                        "Germany",
                        "German");

        InternationalDivision international2 =
                new InternationalDivision(
                        "Asian Marketing",
                        1002,
                        "Japan",
                        "Japanese");

        DomesticDivision domestic1 =
                new DomesticDivision(
                        "Texas Operations",
                        2001,
                        "Texas");

        DomesticDivision domestic2 =
                new DomesticDivision(
                        "California Distribution",
                        2002,
                        "California");

        international1.display();
        international2.display();
        domestic1.display();
        domestic2.display();
    }
}