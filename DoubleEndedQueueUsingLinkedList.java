public class DoubleEndedQueueUsingLinkedList {
    Node3 front;
    Node3 rear;
    DoubleEndedQueueUsingLinkedList(){
        front=null;
        rear=null;
    }
    public boolean isEmpty(){
        return front ==null;
    }
    public void enqueueRear(Node3 newnode){
        if(isEmpty()){
            front = rear = newnode;
        }
        else{
            rear.next = newnode;
            rear = newnode;
        }
    }
    public void enqueueFront(Node3 newnode){
        if(isEmpty()){
            front = rear = newnode;
        }
        else{
            newnode.next = front;
            front = newnode;
        }
    }
    public void dequeueFront(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("value removed : "+front.data);
            front = front.next;
        }
    }
    public void dequeueRear(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("value removed : "+rear.data);
            Node3 temp = front;
            while(temp.next.next!=null) {
                temp = temp.next;
            }
            temp.next = null;
            rear = temp;
        }
    }
    public void display(){
        if(front==null){
            System.out.println("Queue is empty");
        }else{
            Node3 temp = front;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
