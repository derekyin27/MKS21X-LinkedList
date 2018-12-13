public class MyLinkedList{
  private class Node{
    private Node next, prev;
    private Integer data;
    public Node next(){
      return next;
    }
    public Node prev(){
      return prev;
    }
    public static void setNext(Node other){
      next = other;
    }
    public static void setPrev(Node other){
      prev = other;
    }
    public Integer getData(){
      return data;
    }
    public Integer setData(Integer i){
      data = i;
    }
    public String toString(){
    }
  }
}
