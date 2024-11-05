import java.util.Scanner;

public class GetBirthDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayMax = 0;
        int year = InputHelper.getRangedInt(scan, "Year [1950-2010]:", 1950, 2010);
        int month = InputHelper.getRangedInt(scan, "Month [1-12]:", 1, 12);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayMax = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayMax = 30;
                break;
            case 2:
                dayMax = 29;
                break;
        }
        int day = InputHelper.getRangedInt(scan, "Day [1-" + dayMax + "]:", 1, dayMax);
        int hour = InputHelper.getRangedInt(scan, "Hour [1-23]:", 1, 24);
        int minute = InputHelper.getRangedInt(scan, "Minute [1-59]:", 1, 59);

        System.out.printf("Year: %-5d \nMonth: %-5d \nDay: %-5d \nHour: %-5d \nMinute: %-5d", year, month, day, hour, minute);
    }
}
