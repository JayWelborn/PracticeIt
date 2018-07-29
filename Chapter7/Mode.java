class Mode {
    public static void main(String[] args) {
        int[] test = {1, 1, 2, 3};
        System.out.println(mode(test));
        int[] test2 = {1, 1, 2, 3, 3};
        System.out.println(mode(test2));
        int[] test3 = {27, 15, 15, 11, 27};
        System.out.println(mode(test3));
        int[] test4 = {27, 15, 15, 11, 27, 27};
        System.out.println(mode(test4));
    }

    public static int mode(int[] arr) {
        int mode = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int x : arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (x == arr[i]) {
                    count++;
                    if (count >= max && x <= mode) {
                        mode = x;
                        max = count;
                    }
                }
            }
        }
        return mode;
    }
}
