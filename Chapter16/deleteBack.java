public int deleteBack() {
    if (this.front == null) {
        throw new NoSuchElementException();
    } else if (this.front.next == null) {
        int data = this.front.data;
        this.front = null;
        return data;
    }
    ListNode prev = this.front;
    ListNode curr = this.front.next;
    while (curr.next != null) {
        prev = curr;
        curr = curr.next;
    }
    int data = curr.data;
    prev.next = null;
    return data;
}
