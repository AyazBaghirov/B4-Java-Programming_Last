
import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        // add() ------- > push()
        // remove() ---- > pop()  -- > removes the element which is at the TOP / and returns what was removed
        // get() ------- > peak() -- > gives you the element which is at the TOP


        // System.out.println(stack.peek()); // since I do nto have any element but trying to get the element will throw -- > EmptyStackException

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);


        System.out.println("What is at the top: " + stack.peek()); //

        stack.pop();
        System.out.println(stack);

        System.out.println("What is at the top: " + stack.peek());

        System.out.println(stack.pop());
        System.out.println("What is at the top: " + stack.peek());


        System.out.println();

        // Q: How about if I want to remove from the bottom. Can I do that?
        // A: Yes, there is an option to do that. But the WHOLE IDEA ot Stack is to do LIFO (Last In First Out)

        System.out.println(stack);
        stack.remove(0);
        System.out.println(stack);
        stack.add('k');
        System.out.println(stack);



    }
}
