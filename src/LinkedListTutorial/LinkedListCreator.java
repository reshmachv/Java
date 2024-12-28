package LinkedListTutorial;

public class LinkedListCreator {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public boolean push(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
           tail=head;
           return true;
        }
        else{
            newNode.next=tail;
            tail=newNode;
            return true;
        }
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int peek(){
       return tail!=null?tail.data:-1;
    }

    public void pop(){
        try {
            Node temTail = tail.next;
            tail.next = null;
            tail = temTail;
        }
        catch(NullPointerException e){
            System.out.println("Linked List is Empty");
        }
    }
    public int printHead(){
        if(head!=null){return head.data;}
        return -1;
    }
    public int printTail() {
        if(tail!=null) {
            return tail.data;
        }
        return -1;
    }
}
