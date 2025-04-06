
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


    void insertAtFirst(int i,int data){
        Node x=root;
        Node n=new Node(data);
        if(i==0){
            n.add=x;
            root=n;
            count++;
            return;
        }
    } 
    void insertInBetween(int i,int data){
        Node x=root;
        Node n= new Node(data);
        if(i==0){
            n.add =x;
            root =n;
            return;
        }
        int p=0;
        while(p < i){
            x=x.add;
           p++ ;
        }
        n.add = x.add;
        x.add=n;  
        count++;                                   
        return;
    }

    void sort(){

        for(Node i=root;i.add !=null;i=i.add){
            for(Node j=i.add;j !=null;j=j.add){
                    if(i.data> j.data){
                        int t= i.data;
                        i.data =j.data;
                        j.data =t;
                    }
                }
            }
        }


    void delete(int i){
        Node x=root;
        if(i<0) i=0;
        if(i==0){
            root=x.add;
        }

        while (i!=1) {
            x=x.add;
            i--;
        }
        Node y=x.add;
        x.add = y.add;
        count--;
        return;
        
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
        l.insertAtFirst(0, 200);
        l.insertInBetween(4, 69);
        l.disp();
        l.delete(2);
        l.disp();
        l.sort();
        l.disp();
    }
}
