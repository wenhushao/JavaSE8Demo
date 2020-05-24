/**
 * switch
 */
public class Switch {
    public static void main(String[] args) {
        int a = 11;
        switch (a) {
            case 1:
                System.out.println("a=1");
                break;
            case 2:
                System.out.println("a=2");
                break;
            case 3:
                System.out.println("a=3");
                break;
            default:
                System.out.println("a="+a);
        }
    }
}
