public boolean isPairwiseSorted() {
    for (int i = 1, i < this.size, i++) {
        if (elementData[i] > elementData[i - 1]) {
            return false;
        }
    }
    return true;
}
