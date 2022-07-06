public class SinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createSinglyLinkedList(int nodeValue) {
    head = new Node(); //initializing head  O(1)
    Node node = new Node();  //O(1)
    node.next = null;  //O(1)
    node.value = nodeValue;  //O(1)            ----->O(1) time and space
    head = node;  //O(1)
    tail = node;  //O(1)
    size = 1;  //O(1)
    return head; 
  }

  // Insert Method SinglyLinkedList
  public void insertInLinkedList(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;   //O(1)
    if(head == null) {
      createSinglyLinkedList(nodeValue);  //O(1)
      return;
    } else if(location == 0) { //insert at the beginning
      node.next = head;   //O(1)
      head = node;
    }else if(location >= size) { //insert at the end     }}---->//O(N) and O(1) space
      node.next = null;
      tail.next = node;  //O(1)
      tail = node;
    } else { //insert node at the specific location
      Node tempNode = head; //O(1)
      int index = 0; //O(1)
      while(index < location - 1) {   //O(N)
        tempNode = tempNode.next;
        index++;
      }
      Node nextNode = tempNode.next;
      tempNode.next = node;    //O(1)
      node.next = nextNode;
    }
    size++;
  }

  // SinglyLinkedList Traversal
  public void traverseSinglyLinkedList() {
    if(head == null) { 
      System.out.println("SLL does not exit"); //O(1)
    } else{
      Node tempNode = head; //O(1)
      for(int i = 0; i < size; i++){ //O(N)                }-->O(N) time and O(1)
        System.out.print(tempNode.value);
        if(i != size -1) {
          //print an arrow if we did not reach the end
          System.out.print(" --> ");
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("\n");
  }

  // Search for a node
  public boolean searchNode(int nodeValue) {
    if(head != null) {
      Node tempNode = head;
      for(int i = 0; i < size; i++) {
        if(tempNode.value == nodeValue) {
          System.out.print("Found the node at location: " + i + "\n");
          return true;                // }-->O(N) time and O(1) space
        }
        tempNode = tempNode.next;
      }
    }
    System.out.print("Node not found");
    return false;
  }

  // Delete a node
  public void deletionOfNode(int location) {
    if(head == null) {
      System.out.print("The SLL does not exits");
      return;
    }else if(location == 0) { //delete a node found at the beginning
      head = head.next;
      size--;
      if(size == 0) {
        tail = null;
      }
    }else if(location >= size){ //delete a node found at the end
      Node tempNode = head;
      for(int i = 0; i < size; i++){
        tempNode = tempNode.next;                             // }-> O(N) time and O(1) for space
      }
      if(tempNode == head) { //if we have one element
        tail = head = null;
        size--;
        return;
      }
      tempNode.next = null; //if we have more than one element
      tail = tempNode;
      size--;
    }else {
      Node tempNode = head;
      for(int i = 0; i < location -1 ; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
  }

  //Delete entire Singly Linked List

  public void deleteSLL() {
    head = null;                           ///O(1) time and space
    tail = null;
    System.out.println("The SLL was deleted successfully");
  }
  

}