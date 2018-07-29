int MIN = -6, MAX = 38, count = 0;

int[] odds = new int[(MAX - MIN) / 2];

for (int i = MIN; i <= MAX; i++) {
    if (Math.abs(i) % 2 == 1) {
        odds[count] = i;
        count++;
    }
}
