import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
    public static void main(String[] args) {
        /* Which class would you use to store your birthday in years,
        months, days, seconds, and nanoseconds? */

            // We would want to use java.time.LocalDateTime, which
            // is used to quantify a fixed moment in time without.
            // reference to any specific time zone.

            // .toString() will will list year, month, day,
            // hour, minute, seconds and nanoseconds.
            LocalDateTime birthday = LocalDateTime.of(1999, 2, 22, 9, 32, 55, 102983892);
            System.out.println("Birthday: " + birthday.toString());
            // If we want to control our output more precisely,
            // we can use a DateTimeFormatter.
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd, ss.nnnnnnnnn");
            System.out.println("Birthday: " + birthday.format(formatter));

        /* Given a random date, how would you find the date of the
        previous Thursday? */

            // java.time.LocalDate has a 'getDayOfWeek()' method, and methods
            // to decrement by days. We can use this to iterate back
            // to a previous Thursday.

            LocalDate randomDate = LocalDate.now().minusDays(1);
            while(randomDate.getDayOfWeek() != DayOfWeek.THURSDAY){
                randomDate = randomDate.minusDays(1);
            }
            System.out.println("The previous Thursday was on: " + randomDate.toString());

        /* What is the difference between a ZoneId and a
        ZoneOffset? */

            // A ZoneOffset is used to reference the time gap between
            // a desired timezone and Greenwich/UTC. It is fundamentally
            // a wrapper for an amount of time.

            // A ZoneId is used in ZonedDateTime objects to determine
            // which ZoneOffset should be used. For timezones that
            // practice daylight savings, there are sometimes multiple
            // valid offsets, so ZoneId is implemented to determine
            // which offset to use in a given calculation.

        /* How would you convert an Instant to a ZonedDateTime? How
        would you convert a ZonedDateTime to an Instant? */

            // We can simply use the .atZone function, providing a valid string
            // to the static method .of() to give us an appropriate ZoneId.
            Instant timeAsInstant = Instant.now();
            ZonedDateTime timeAsZonedDateTime = timeAsInstant.atZone(ZoneId.of("UTC-5"));
            System.out.println("Now, expressed in EST: " + timeAsZonedDateTime.toString());

            // ZonedDateTime inherits the .toInstant() method for easy conversion
            Instant timeAsInstantAgain = timeAsZonedDateTime.toInstant();
            System.out.println("Now, expressed as Java Instant: " + timeAsInstantAgain.toString());

        /* Write an example that, for a given year, reports the
        length of each month within that year. */

            // This is accomplished by creating a series of YearMonths
            // based on the input year.
            Year turnOfMillennium = Year.of(2000); // The input year, a leap year
            DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("MM/yyyy");
            for(Month m : java.time.Month.values()){
                YearMonth month = turnOfMillennium.atMonth(m);
                System.out.println("Length of " + month.toString() + " in days: " +  month.lengthOfMonth());
            }

        /* Write an example that, for a given month of the current
        year, lists all of the Mondays in that month. */

            // We can simply iterate through every day of the month and check
            // which day of the week it belongs to.
            Month givenMonth = Month.DECEMBER; // The input month, with four Mondays
            YearMonth december2021 = Year.now().atMonth(givenMonth);
            int day = 1;
            System.out.println("Mondays in " + december2021.toString() + ":");
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd");
            while(december2021.isValidDay(day)){
                LocalDate date = december2021.atDay(day);
                if(date.getDayOfWeek() == DayOfWeek.MONDAY){
                    System.out.println(date.format(dateFormatter));
                }
                day ++;
            }

        /* Write an example that tests whether a given date occurs
        on Friday the 13th. */

            // We will write the test as a method and perform it on a
            // positive and negative case.
            LocalDate luckyDay = LocalDate.of(2021, 11, 8);
            LocalDate luckyDay2 = LocalDate.of(2021, 11, 5);
            LocalDate luckyDay3 = LocalDate.of(2021, 11, 13);
            LocalDate unluckyDay = LocalDate.of(2021, 8, 13);
            System.out.println(luckyDay.toString() + " is a Friday 13th: " + IsUnlucky(luckyDay));
        System.out.println(luckyDay2.toString() + " is a Friday 13th: " + IsUnlucky(luckyDay2));
        System.out.println(luckyDay3.toString() + " is a Friday 13th: " + IsUnlucky(luckyDay3));
            System.out.println(unluckyDay.toString() + " is a Friday 13th: " + IsUnlucky(unluckyDay));
    }

    private static boolean IsUnlucky(LocalDate date){
        return date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
}
