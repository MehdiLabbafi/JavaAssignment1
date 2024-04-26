// Pakege chapter 5

/*
*5.29 (“The Twelve Days of Christmas” Song) Write an application that uses
* iteration and switchstatements to print the song “The Twelve Days of Christmas.
*” One switch statement should be used to print the day (“first,” “second,” and so on).
*A separate switch statement should be used to print the remainder of each verse. Visit
 *the website en.wikipedia.org/wiki/The_Twelve_Days_ of_Christmas_(song) for the lyrics of the song.
*/

public class chapter529 {
    public static void main(String[] args) {
        for (int day = 1; day <= 12; day++) {
            System.out.printf("On the %s day of Christmas, my true love sent to me:\n", getDay(day));
            for (int giftDay = day; giftDay >= 1; giftDay--) {
                switch (giftDay) {
                    case 1:
                        System.out.println("A partridge in a pear tree.");
                        break;
                    case 2:
                        System.out.println("Two turtle doves,");
                        break;
                    case 3:
                        System.out.println("Three French hens,");
                        break;
                    case 4:
                        System.out.println("Four calling birds,");
                        break;
                    case 5:
                        System.out.println("Five golden rings,");
                        break;
                    case 6:
                        System.out.println("Six geese a-laying,");
                        break;
                    case 7:
                        System.out.println("Seven swans a-swimming,");
                        break;
                    case 8:
                        System.out.println("Eight maids a-milking,");
                        break;
                    case 9:
                        System.out.println("Nine ladies dancing,");
                        break;
                    case 10:
                        System.out.println("Ten lords a-leaping,");
                        break;
                    case 11:
                        System.out.println("Eleven pipers piping,");
                        break;
                    case 12:
                        System.out.println("Twelve drummers drumming,");
                        break;
                }
            }
            System.out.println();
        }
    }

    private static String getDay(int day) {
        switch (day) {
            case 1:
                return "first";
            case 2:
                return "second";
            case 3:
                return "third";
            case 4:
                return "fourth";
            case 5:
                return "fifth";
            case 6:
                return "sixth";
            case 7:
                return "seventh";
            case 8:
                return "eighth";
            case 9:
                return "ninth";
            case 10:
                return "tenth";
            case 11:
                return "eleventh";
            case 12:
                return "twelfth";
            default:
                return "";
        }
    }
}