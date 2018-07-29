/**
 * static method to print a hopscotch pattern of size `hops`
 * @param hops int for how many times to hop
 */
public static void hopscotch(int hops) {
    int complete = 1;
    while (hops > 0) {
        System.out.println("   " + complete);
        complete ++;
        System.out.print(complete + "     ");
        complete ++;
        System.out.println(complete);
        complete ++;
        hops --;
    }
    System.out.println("   " + complete);
}
