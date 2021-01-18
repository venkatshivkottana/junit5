public class Solution {
    private static class Node {
        private int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node head;
    
    public Node mergeSortedLinkedLists(Node first,Node second) {
        Node head;
        if(first == null) {
            return second;
        } else if(second == null) {
            return first;
        } else if(first.data < second.data) {
            head = first;
            head.next=mergeSortedLinkedLists(first.next,second);
        } else {
            head = second;
            head.next = mergeSortedLinkedLists(first,second.next);
        }
        return head;
    }
    
    public void push(Node head,int n) {
        while(head.next != null) 
            head = head.next;
        head.next = new Node(n);
    }
    public void display(Node head) {
        Node tDisplay = head;
        while(tDisplay!=null) {
            System.out.println(tDisplay.data);
            tDisplay = tDisplay.next;
        }
    }
    
    public static void main(String args[]) {
        Solution list = new Solution();
        int [] intArrayData1= {10,35,50,75};
        Node head1 = new Node(intArrayData1[0]);
        for(int i =1 ;i<intArrayData1.length;i++) {
            list.push(head1,intArrayData1[i]);
        }
        
        int [] intArrayData2 = {15,30,45,70};
        Node head2 = new Node(intArrayData2[0]);
        for(int count =1 ;count<intArrayData2.length;count++) {
            list.push(head2,intArrayData2[count]);
        }
        
        Node n = list.mergeSortedLinkedLists(head1,head2);
        System.out.println("Output");
        list.display(n);
    }
}
