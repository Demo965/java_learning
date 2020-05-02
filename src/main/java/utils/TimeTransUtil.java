package utils;

public class TimeTransUtil {
    public static int days(int year, int month, int day)
    {
        int monthSum = 0;
        for (int i = 1; i < month ; i++) {
            switch (i) {
                case 4:
                case 6:
                case 9:
                case 11:
                    monthSum += 30;
                    break;
                case 2:
                    monthSum += RunYear(i) ? 29 : 28;
                    break;
                default:
                    monthSum += 31;
                    break;
            }
        }
        int yearSum = 0;
        if (year >= 1900)
        {
            for (int j = 1900; j < year; j++)
            {
                yearSum += RunYear(j) ? 366 : 365;
            }
        }
        else {
            for (int j = 1900; j > year; j--)
            {
                yearSum = yearSum + (RunYear(j) ? 366 : 365) - (monthSum+day)+1;
            }
        }
        return year >= 1900 ? yearSum+ monthSum + day-1:yearSum;
    }

    public static boolean RunYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
