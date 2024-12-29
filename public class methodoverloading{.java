public class methodoverloading{
    public static int add(int a, int b){
        return a+b;

    }
    public static int add(int a,int b,int c){
        return a+b+c;
        public static int add(String a, String b){
            return a+""+b;
        }
        public static void main(String[]args){
             int sum1 = add(5,20);
             
        }
    }
}