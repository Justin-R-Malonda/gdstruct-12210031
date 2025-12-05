//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ArrayStack stack = new ArrayStack(5);
        LinkedStack stack = new LinkedStack();
        stack.push(new Player(1, "aceu", 100));
        stack.push(new Player(2, "Sinatraa", 100));
        stack.push(new Player(3, "Subroza", 95));
        stack.push(new Player(4, "ploo", 90));

        stack.printStack();

        System.out.println("Popping: " + stack.pop());
        //System.out.println("peeking: " + stack.pop());

        stack.printStack();


    }
}