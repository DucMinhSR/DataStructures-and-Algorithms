public interface QueueInterface<E>{
     void enQueue(E item );
     E deQueue();
     int size();
     boolean contains(E item);
     void print();
     E getFront();
     boolean isEmpty();
}
