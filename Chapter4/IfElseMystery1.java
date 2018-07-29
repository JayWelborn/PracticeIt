class IfElseMystery1 {
    public static void main(String[] args) {
        mystery(3, 20);
    }

    public static void mystery(int x, int y) {
        int z = 4;
        if (z <= x) {
            System.out.println("z = z + x invoked");
            z = x + 1;
        } else {
            System.out.println("z = z + 9 invoked");
            z = z + 9;
        }
        if (z <= y) {
            System.out.println("y ++ invoked");
            y++;
        }
        System.out.println(z + " " + y);
    }
}
