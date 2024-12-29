public class findarry {
   public static void main(String[] args) {
    int arry[] = {1,2,345,56,76,8,6};
    int max = 0;
    for(int e : arry){
        if(e<max){
            max=e;
        }
    }System.out.println("max no is :"+ max);
   }
   
    
}
