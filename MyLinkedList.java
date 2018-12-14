public class MyLinkedList{
  private class Node{
    private Node next, prev;
    private Integer data;
    public Node(Integer dat, Node nextup, Node previous){
      data = dat;
      next = nextup;
      previous = prev;
    }
    Node(Integer dat){
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

private Node start, end;
private int size;
//private

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(Integer value){
    Node yeet = new Node(value);
    size++;
    return true;
  }

  public String toString(){
    String str = "";
    Node current = start;
    for (int i = 0; i < size; i++){
      str += current.getData();
      current = current.next();
    }
    return str;
  }

  public Integer get(int index){
    if (size <= 0)
    throw new IndexOutOfBoundsException();
    Node current = start;
    for (int i = 0; i < index; i++){
    current = current.next();
  }
  return current.getData();
}

public Integer set(int index, Integer value){
  if (index > size)
  throw new IndexOutOfBoundsException();
  
}
}
