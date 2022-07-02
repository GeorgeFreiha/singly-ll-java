public class SinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createSinglyLinkedList(int nodeValue) {
    head = new Node(); //initializing head  O(1)
    Node node = new Node();  //O(1)
    node.next = null;
    node.value = nodeValue;
    head = node;
    tail = node;
    size = 1;
    
    return head;
    
  }


  






  
}