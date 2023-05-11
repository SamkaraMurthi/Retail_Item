/** Kadek Narayana 60092
 * January 10, 2022
 */

//this class is exception if user input negative price value
class NegativePrice extends Exception {
    public NegativePrice(double x) {super("You cannot input a Negative Price, Please Try Again ");}

}


//this class is exception if user input negative unit value
class NegativeUnits extends Exception {

    public NegativeUnits(double x) {super("You cannot input a Negative Units, Please Try Again ");}
}