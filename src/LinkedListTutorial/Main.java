package LinkedListTutorial;

public class Main {
    public static void main(String [] args){
        LinkedListCreator linkedList=new LinkedListCreator();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        System.out.println("head of linked list is "+linkedList.printHead());
        System.out.println("tail of linked list is "+linkedList.printTail());
        System.out.println("peek element is "+linkedList.peek());
        linkedList.pop();
        System.out.println("head of linked list is "+linkedList.printHead());
        System.out.println("tail of linked list is "+linkedList.printTail());
        System.out.println("check if List is empty "+(linkedList.isEmpty() ? "yes":"no"));

    }
}
