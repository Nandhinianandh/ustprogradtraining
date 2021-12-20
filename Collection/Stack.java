import java.util.Iterator;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(30);
        stack.push(-3);
        stack.push(40);
        System.out.println(stack);
        System.out.println("after removing negative element");
        stack.forEach(n-> check(n));

    }

    static void check(int n){
        if(n>=0)
        {
            System.out.println(n);

    };

    }
}
