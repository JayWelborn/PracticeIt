public ArrayIntList runningTotal() {
    if (this.size() == 0) {
        return new ArrayIntList();
    }
    ArrayIntList newList = new ArrayIntList();
    newList.add(elementData[0]);
    int sum = elementData[0];
    for (int i = 1; i < this.size(); i++) {
        sum += elementData[i];
        newList.add(sum);
    }
    return newList;
}
