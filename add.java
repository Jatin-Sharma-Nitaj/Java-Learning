public class add {
    static int sum(int x, int y){
        System.out.println(x+y);
        return y;
    }
    public static void main(String []args){
        @SuppressWarnings("unused")
        int sum1 =34, sum2 = 23;
        @SuppressWarnings("unused")
        int sum = sum1 + sum2;
        sum(sum1,sum2);
    }
}
