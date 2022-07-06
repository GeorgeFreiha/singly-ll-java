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

}