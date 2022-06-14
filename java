# 什么是队列（Queue）？
队列（queue）是一种采用先进先出（FIFO，first in first out）策略的抽象数据结构。比如生活中排队，总是按照先来的先服务，后来的后服务。队列在数据结构中举足轻重，其在算法中应用广泛，最常用的就是在宽度优先搜索(BFS）中，记录待扩展的节点。

队列内部存储元素的方式，一般有两种，数组（array）和链表（linked list）。两者的最主要区别是：

数组对随机访问有较好性能。
链表对插入和删除元素有较好性能。
class Node {
    public int val;
    public Node next;
    public Node(int _val){
        val = _val;
        next = null;
    }
    
}

public class MyQueue {
    Node first,last;
    /*
     * @param item: An integer
     * @return: nothing
     */
    public MyQueue(){
        
        first = last = null;
    }
    
    public void enqueue(int item) {
        // write your code here
        //create a new node here;
        
        Node insertNode = new Node(item);
        if(first == null){
            last = insertNode;
            first = last;	
        }
        else{
            last.next = insertNode;
            last = last.next;
        }
        
        System.out.println("node:"+last.val);
    }

    /*
     * @return: An integer
     */
    public int dequeue() {
        // write your code here
        if(first == null){
            return -1;
        }else{
            int dequeueVal = first.val;
            first = first.next;
            System.out.println("dequeueVal"+dequeueVal);
            return dequeueVal;
        }
      
    }
}
