public class MyLinkedList{
  private class Node{
    private Node next, prev;
    private Integer data;
    public Node(Integer dat, Node nextup, Node previous){
      data = dat;
      next = nextup;
      previous = prev;
    }
    public Node(Integer dat){
      data = dat;
      next = null;
      prev = null; 
    }
    public Node next(){
      return next;
    }
    public Node prev(){
      return prev;
    }
    public void setNext(Node other){
      next = other;
    }
    public void setPrev(Node other){
      prev = other;
    }
    public Integer getData(){
      return data;
    }
    public Integer setData(Integer i){
      Integer x = data;
      data = i;
      return x;
    }
    public String toString(){
      return "" + data;
    }
  }
}
