class Main {
  public static void main(String[] args) {
    SinglyLinkedList sLL = new SinglyLinkedList();
    sLL.createSinglyLinkedList(5);
    
    sLL.insertInLinkedList(6, 1);
    sLL.insertInLinkedList(7, 3);
    // System.out.print(sLL.tail.value);
    sLL.insertInLinkedList(8, 4);
    sLL.insertInLinkedList(9, 0);
    sLL.traverseSinglyLinkedList();
    sLL.deletionOfNode(3);
    sLL.traverseSinglyLinkedList();
    // sLL.searchNode(6);
    // sLL.deleteSLL();
    // sLL.traverseSinglyLinkedList();
    
  }
}