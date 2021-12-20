class student<T>{
    T id;
    String name;

    student(T id,String name){
        this.id=id;
        this.name=name;
    }
    void add1(){
        int a= (Integer) id + 1;
    }
    void display(){
        System.out.println(id+"---->"+name);
    }
}
public class generics {
    public static void main(String [] args){
        student<String> s1=new student("s1","c");
        student<String> s2=new student(1,"A");
        s1.display();
        s2.display();

    }
}
