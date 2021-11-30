import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice;
        while(true){
            System.out.println("1.Enter at beginning");
            System.out.println("2.Enter in between");
            System.out.println("3.Enter at end");
            System.out.println("4.Remove first");
            System.out.println("5.Remove in between");
            System.out.println("6.Remove last");
            System.out.println("7.Traverse");
            System.out.println("8.Exit");
            choice = sc.nextInt();

            switch (choice){
                case 1: list.insertBegin();
                    break;
                case 2: list.insertBetween();
                    break;
                case 3: list.insertEnd();
                    break;
                case 4: list.removeFirst();
                    break;
                case 5: list.removeBetween();
                    break;
                case 6: list.removeLast();
                    break;
                case 7: list.traverse();
                    break;
                case 8: System.exit(0);
            }
        }
    }
}
