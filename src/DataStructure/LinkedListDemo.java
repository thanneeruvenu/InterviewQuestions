package DataStructure;


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.print();

        // Find middle element
        findMiddleElementApproach1(linkedList);
        findMiddleElementApproach2(linkedList);

        // reverse elements

    }

    public static void findMiddleElementApproach1(LinkedList<Integer> linkedList) {

        //get the length of linklist and do n/2
        LinkedList.Node temp = linkedList.head;
        int n = 0;
        while (temp!=null) {
            n++;
            temp = temp.next;
        }

        System.out.println("Size : "+n);

        temp = linkedList.head;
        int i =0;
        while (i<n/2){
            temp =temp.next;
            i++;
        }
        System.out.println("Middle index value : "+ temp.data);
    }


    public static void findMiddleElementApproach2(LinkedList<Integer> linkedList) {

        //get the length of linklist and do n/2
        LinkedList.Node slow = linkedList.head;
        LinkedList.Node fast = slow;

        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle index value : "+ slow.data);
    }
}

class LinkedList<T> {
   Node<T> head;
   Node<T> tail;

    class Node<T> {
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
        }
    }

    boolean add(T data) {
        if(head == null) {
            head = new Node<>(data);
            tail = head;
        }else {
            tail.next = new Node<>(data);
            tail = tail.next;
        }
        return true;
    }

    void print(){
        Node<T> temp = head;
        System.out.print("[");
        while (temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp!=null) System.out.print(",");
        }
        System.out.print("]\n");
    }

}

