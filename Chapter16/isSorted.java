public boolean isSorted() {
    ListNode node = this.front;
    if (node == null) {
        return true;
    }
    while (node.next != null) {
        if (node.data > node.next.data) {
            return false;
        }
        node = node.next;
    }
    return true;
}
