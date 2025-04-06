
class Node{
    int data;
    Node add;
    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node root;
    int count =0;
    void append(int data){
        Node n = new Node(data);
        if(root ==null) {
            root =n;
            return;
        }
        count++;
        Node x=root;
        while(x.add !=null){
            x = x.add;
        }
        x.add =n;
        return;
    }




    void disp(){
        Node x=root;
        System.out.println("Node\t\tdata\t\taddress");
        System.out.println("____________________________________________");
        while (x!=null) {
            System.out.println(x+"\t"+x.data+"\t"+x.add);
            x=x.add;
        }
        System.out.println("the number of nodes are: "+(count+1));
    }
}


public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.append(10);
        l.append(30);
        l.append(40);
        l.append(50);
        l.append(20);
        l.disp();
    }
}
