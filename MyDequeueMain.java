class MyDequeueMain{
    public static void main(String[] args) {
        DoubleEndedQueueUsingLinkedList obj = new DoubleEndedQueueUsingLinkedList();
        Node3 n1 = new Node3(10);
        Node3 n2 = new Node3(20);
        Node3 n3 = new Node3(30);
        Node3 n4 = new Node3(40);
        Node3 n5 = new Node3(50);
        Node3 n6 = new Node3(60);
        Node3 n7 = new Node3(70);
        Node3 n8 = new Node3(80);
        Node3 n9 = new Node3(90);
        obj.enqueueFront(n1);
        obj.display();
        obj.dequeueFront();
        obj.display();
        obj.enqueueFront(n2);
        obj.display();
        obj.enqueueFront(n3);
        obj.enqueueRear(n4);
        obj.enqueueRear(n5);
        obj.display();
        obj.dequeueFront();
        obj.dequeueFront();
        obj.display();
        obj.enqueueRear(n6);
        obj.enqueueRear(n7);
        obj.display();
        obj.enqueueFront(n8);
        obj.enqueueFront(n9);
        obj.display();
        obj.dequeueFront();
        obj.display();
        obj.dequeueRear();
        obj.display();
        obj.dequeueRear();
        obj.display();
    }
}
