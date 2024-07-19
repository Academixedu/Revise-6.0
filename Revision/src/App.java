public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    int a=20;
    String str="Java";
    System.out.println(a);
    System.out.println(str);
    int b=30;
    if(a>b){
        System.out.println("A is Greater");
    }
    else{
        System.out.println("B is Greater");
    }
    int[]arr={2,3,4,5};
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
Functions fun=new Functions();
fun.Compare(a, b);
System.out.println(fun.Compare1(a, b));    
Student s=new Student(1, "Chanakya");
System.out.println(s.getSid()+" "+s.getName());
System.out.println(s.toString());
Son son=new Son();
son.name();
son.surname();
}
}
