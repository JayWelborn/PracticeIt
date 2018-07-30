public boolean isPairwiseSorted() {
    for (int i = 1; i < this.size; i += 2) {
        if (elementData[i] < elementData[i - 1]) {
            return false;
        }
    }
    return true;
}
