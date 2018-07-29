int[][] jagged = new int[5][];
int value = 1;
for (int i = 0; i < jagged.length; i++) {
    jagged[i] = new int[i + 1];
    for (int j = 0; j < jagged[i].length; j++) {
        jagged[i][j] = value;
        value++;
    }
}
