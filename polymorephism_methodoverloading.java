 class Student{
    String name;
    int age;
     
    public void printinfo(String name){
        System.out.println(name);
    }

    public void  printinfo(int age){
        System.out.println(age);

    }
    public void  printinfo(int age, String name){
        System.out.println(name+""+age);

    }
}
   public class polymorephism_methodoverloading{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nitaj";
        s1.age = 17;

      s1.printinfo(s1.age,s1.name);
    }

   }
