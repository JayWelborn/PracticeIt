public String getNormalOrder() {
    return String.format("%s %c. %s", firstName, middleInitial, lastName);
}

public String getReverseOrder() {
    return String.format("%s, %s %c.", lastName, firstName, middleInitial);
}
