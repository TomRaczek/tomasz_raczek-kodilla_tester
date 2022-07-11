public class LeapYear {
    public static void main(String []args) {

    int yearToBeChecked = 2004;
    boolean isLeap = ((yearToBeChecked % 4 == 0) && (yearToBeChecked % 100 != 0) || (yearToBeChecked % 400 == 0));

    if (isLeap)
        System.out.print(yearToBeChecked + " is a leap year");
    else
        System.out.print(yearToBeChecked + " isn't a leap year");
    }
  }