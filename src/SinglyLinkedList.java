public class SinglyLinkedList {
    public Node head;

    //Constructors
    public SinglyLinkedList() {
        this.head = null;

    }

//Goes until the last node and adds a new node of the value given
    // If there is no head, it creates a new node with the value given and
    // makes it the head:

    //Methods

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    // Goes until the penultimate (the one before the last) node and then changes its .next
    // property to null, getting rid of the final node:

    public void remove(){
        if(head.next == null){
            this.head = null;
        }
        Node runner = this.head;
        while(runner.next.next != null){
            runner = runner.next;
        }
        runner.next = null;
    }

    public void printValues() {
        Node runner = this.head;
        if(head == null) {
            System.out.println("No nodes!");
        }
        while(runner.next != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
        System.out.println(runner.value);
    }

    // Finds the first node in the list with the given value and returns it
    // Otherwise it just returns the head:

    public Node find(int value){
        if(this.head != null){
            Node runner = this.head;
            while(runner.next != null){
                if(runner.value == value){
                    return runner;
                }
                runner = runner.next;
            }
        }
        return this.head;
    }


    // Removes the node at the given index (0 is the first, 1 is the second...):
    public void removeAt(int index){
        if(this.head != null){
            int count = 0;
            Node runner = this.head;
            Node temp = null;
            while(runner.next != null){
                if(count == index){
                    temp.next = temp.next.next;
                    break;
                }
                temp = runner;
                runner = runner.next;
                count++;
            }
        }
    }
}