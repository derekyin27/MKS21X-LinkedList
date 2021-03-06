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
    yeet.setPrev(end);
    yeet.setNext(null);
    size++;
    return true;
  }

  public String toString(){
    String str = "[";
    Node current = start;
    for (int i = 0; i < size; i++){
      if (current != null){
      str += current.getData() + " ";
      current = current.next();
    }
    }
    return str + "]";
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

  Node finals = start;
  for (int i = 0; i < index; i++){
    finals = finals.next();
  }
  Integer toReturn = finals.getData();
  finals.setData(value);

  Node previously = start;
  for (int i = 0; i < index - 1; i++){
    previously = previously.next();
  }
  previously.setNext(finals);

  Node nextly = start;
  for (int i = 0; i < index + 1; i++){
    nextly = nextly.next();
  }
  nextly.setPrev(finals);

  return toReturn;
}

public boolean contains(Integer value){
  Node current = start;
  for (int i = 0; i < size; i++){
    if (current.getData() == value)
    return true;
    else{
      current = current.next();
    }
  }
  return false;
}

public int indexOf(Integer value){
  Node current = start;
  for (int i = 0; i < size; i++){
    if (current.getData() == value)
    return i;
    current = current.next();
  }
  return -1;
}

public void add(int index, Integer value){
  if (index > size || index < 0)
  throw new IndexOutOfBoundsException();
  if (index == size)
  add(value);
  Node news = new Node(value);
  Node atIndex = start;
  for (int i = 0; i < index; i++){
    atIndex = atIndex.next();
  }
atIndex.prev().setNext(news);
news.setPrev(atIndex.prev());
news.setNext(atIndex);
size++;
}
 public Integer remove(int index){
   if (index > size || index < 0)
   throw new IndexOutOfBoundsException();
   Node atIndex = start;
   for (int i = 0; i < index; i++){
     atIndex = atIndex.next();
   }
   Integer toReturn = atIndex.getData();
   atIndex.prev().setNext(atIndex.next());
   atIndex.next().setPrev(atIndex.prev());
   size--;
   return toReturn;
 }

 //public boolean remove(Integer value){}

  public void extend(MyLinkedList other){
    this.end.setNext(other.start);
    other.start.setPrev(this.end);
    this.size += other.size;
    other.size = 0;
  }
}
