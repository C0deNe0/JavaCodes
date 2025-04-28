class Node{
     int data;
     Node next;
     Node(int data){
        this.data =data;
     }
}

class LinkedList{
    Node root;

    public void append(int data){
        Node ne = new Node(data);
        
        if(root == null){
            root = ne;
            root.next = root;
            return;
        }

        Node n =root;
        while (n.next !=root) {
            n=n.next;   
        }

        ne.next =root;
        n.next = ne;    
        return;
    }

    public void display(){
        Node temp =root;
        System.out.println("_______________________________________________________");
        System.out.println(temp.next +"    "+temp+"    "+temp.data);
        while(temp.next!=root){
            System.out.println(temp.next +"    "+temp+"    "+temp.data);
        }
    }
}





public class CircularLinkedList {
    
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.append(10);
        l.append(11);
        l.display();
    }
}
