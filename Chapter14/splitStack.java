public void splitStack(Stack<Integer> stack) {
    Queue<Integer> queue = new LinkedList<Integer>();
    int negatives = 0;

    while (!stack.empty()) {
        if (stack.peek() < 0) {
            negatives++;
        }
        queue.add(stack.pop());
    }

    while (negatives > 0) {
        if (queue.peek() < 0) {
            stack.push(queue.remove());
            negatives--;
        } else {
        queue.add(queue.remove());
        }
    }

    while (!queue.isEmpty()) {
        stack.push(queue.remove());
    }
}
