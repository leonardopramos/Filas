public interface QueueTAD {
    public void enqueue(int e); // inclui no final 
    public int dequeue(); // remove do início 
    public int head(); // obtém o início 
    public void clear(); 
    public boolean isEmpty(); 
    public int size();
}