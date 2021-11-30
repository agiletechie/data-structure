import java.util.Scanner;

public class LinkedList {
    Node<Integer> head;
    Scanner sc = new Scanner(System.in);

    void insertBegin(){
        System.out.println("Enter number:");
        if(head == null){
            head = new Node<>(sc.nextInt());
        }
        else {
           Node<Integer> root = new Node<>(sc.nextInt());
           root.setNextNode(head);
           head = root;
        }
    }

    void insertBetween() {
        Node<Integer> root;
        if(head==null){
            System.out.println("Empty List");
        }
        else {
            System.out.println("Enter the number to insert after:");
            int key = sc.nextInt();
            int flag=0;
            for(root=head;root!=null;root=root.getNextNode()){
                if(root.getData()== key){
                    System.out.println("Enter number");
                    int num = sc.nextInt();
                    Node<Integer> temp = root.getNextNode();
                    if(temp!=null){
                        root.setNextNode(new Node<>(num));
                        root.getNextNode().setNextNode(temp);
                        break;
                    }
                    else {
                        root.setNextNode(new Node<>(num));
                    }
                }
                else {
                    flag++;
                }
            }
            if(flag>0){
                System.out.println("number doesn't exist");
            }
        }
    }

    void insertEnd() {
        Node<Integer> root;
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(head==null){
            head = new Node<>(num);
        }
        else {
            for(root=head;root!=null;root = root.getNextNode()){
                if(root.getNextNode()==null){
                    root.setNextNode(new Node<>(num));
                    break;
                }
            }
        }
    }

    void traverse(){
        Node<Integer> root = head;
        while (root!=null){
            System.out.print(root.getData() + " ");
            root = root.getNextNode();
        }
        System.out.println();
    }

    void removeFirst(){
        if(head==null){
            System.out.println("Empty list");
        }
        else {
            head = head.getNextNode();
        }
    }

    void removeBetween() {
        Node<Integer> root,temp;
        if(head==null || head.getNextNode()==null){
            System.out.println("Not in between values");
        }
        else {
            System.out.println("Enter number to delete");
            int key = sc.nextInt();
            for (root=head;root!=null;root=root.getNextNode()){
                if(root.getNextNode().getData()==key && root.getNextNode()!=null){
                    temp = root.getNextNode().getNextNode();
                    root.setNextNode(temp);
                    break;
                }
            }
        }
    }

    void removeLast(){
        Node<Integer> root;
        if(head==null || head.getNextNode()==null){
            System.out.println("Not the last value");
        }
        else {
            for (root=head;root!=null;root=root.getNextNode()){
               if(root.getNextNode().getNextNode()==null){
                   root.setNextNode(null);
                   break;
               }
            }
        }
    }
}
