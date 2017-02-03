package code.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by archit.gupta on 1/5/17.
 */
public class StackOperations {

    public static void main(String [] args) throws IOException {
        System.out.println("Enter type : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int type = Integer.parseInt(reader.readLine());
        StackInterface stack;
        System.out.println("initializing stack");
        if(type == 0) {
            stack = new Stack(2);
        } else {
            stack = new DynamicStack();
        }
        System.out.println("pop");
        stack.pop();
        stack.peek();
        stack.isEmpty();
        stack.isFull();
        stack.push(1);
        stack.push(2);
        stack.peek();
        stack.isFull();
        stack.isEmpty();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.isEmpty();
        stack.peek();
        stack.isFull();
        stack.push(3);
        stack.push(4);
        stack.push(5);

    }
}
