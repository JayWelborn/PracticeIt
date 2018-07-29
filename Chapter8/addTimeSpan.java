public void add(TimeSpan span) {
    hours += span.getHours();
    int temp = minutes + span.getMinutes();
    if (temp >= 60) {
        hours++;
        minutes = temp % 60;
    } else {
        minutes = temp;
    }
}
