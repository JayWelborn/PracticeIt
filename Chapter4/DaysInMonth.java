public static int daysInMonth(int month) {
    if (month == 2) {
        return 28;
    } else if ((month <= 7 && month % 2 == 0) || (month >= 8 && month %2 == 1)) {
        return 30;
    } else {
        return 31;
    }
}
