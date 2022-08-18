public class codewars {

    public static void main(String[] args) {
        isLove(1, 3);
        isLove(2, 3);
        isLove(10, 21);
        System.out.println(summation(8));

    }

    public static boolean isLove(final int flower1, final int flower2) {
        boolean s;
        if (((flower1 % 2 == 0) & (flower2 % 2 != 0)) || ((flower2 % 2 == 0) & (flower1 % 2 != 0))){
            s = true;
        }
        else{
            s = false;
        }
        return s;

        //System.out.println(s);
    }

    public static int summation(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s += i;

        }
        return s;
    }
}