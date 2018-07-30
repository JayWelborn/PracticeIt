public int longestSortedSequence() {
    if (size == 0) {
        return 0;
    }
    int current = 1, max = 1;
    for (int i = 1; i < this.size; i++) {
        if (elementData[i] >= elementData[i - 1]) {
            current++;
        } else {
            current = 1;
        }
        if (current > max) {
            max = current;
        }
    }
    return max;
}
