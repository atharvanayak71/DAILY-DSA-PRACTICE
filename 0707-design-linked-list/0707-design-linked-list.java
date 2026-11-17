class MyLinkedList {
    
    static class Node{
        int val;
        Node next;
    

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {

        if(index < 0) return -1;

        Node temp = head;

        if(head==null){
            return -1;
        }

        for(int i=0; i<index; i++){
            temp = temp.next;
        }

        return temp == null ? -1 : temp.val;
    }
    
    public void addAtHead(int val) {

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

    }
    
    public void addAtTail(int val) {

        Node newNode = new Node(val);
        
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {

        if(index< 0) return;

        Node  newNode = new Node(val);

          if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for(int i=0; i<index-1 && temp != null; i++){
            temp = temp.next;
        }

        if(temp == null){
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void deleteAtIndex(int index) {

        if(index<0 || head == null) return;

        
        if(index == 0){
            head = head.next;
            return;
        }
        

        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null){
            return;
        }

        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */