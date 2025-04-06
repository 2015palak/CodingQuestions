class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data,Node n){
        this.data=data;
        this.next=n;
    }
 
}
public class addtwonumbers {
    private static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    private static Node addNumbers(Node head1,Node head2){
        Node dummyNode=new Node(-1);
        Node curr=dummyNode;
        int carry=0;
        Node t1=head1;
        Node t2=head2;
        while(t1!=null||t2!=null){

        }
    }
    public static void main(String[] args) {
        int arr1[]={2,4,6};
        int arr2[]={3,8,7};
    }
}
