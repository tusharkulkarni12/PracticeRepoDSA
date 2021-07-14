package com.ds.tree;

// define queue class
class CircularQueue
{
    int arr[], front, rear, cap, n1;

    // Queue constructor
    CircularQueue(int n)
    {
        arr = new int[n];
        cap = n;
        front = 0;
        rear = -1;
        n = 0;
    }

    // dequeue function for removing the front element
    public void dequeue()
    {
        //Write your code here
        if(isEmpty())
        {
            System.out.println("queue is Empty");
            System.exit(1);
        }

        System.out.println("Deleting " + arr[front]);
        front = (front + 1) % cap;
        n1--;

    }

    // enqueue function for adding an item to the rear
    public void enqueue(int val)
    {
        //Write your code here
        if(isFull())
        {
            System.out.println("queue is full");
            System.exit(1);
        }
        else{
            System.out.println("Inserting " + val);

            rear = (rear +1) % cap;
            arr[rear] = val;
            n1++;
        }

    }

    // peek function to return front element of the queue
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Queue empty!!Cannot delete");
            System.exit(1);
        }
        return arr[front];
    }
    public Boolean isEmpty()
    {
        //Write your code here
       return (size() == 0);
    }

    // to check if the queue is full or not
    public Boolean isFull()
    {
        //Write your code here
        return (size() == cap);
    }
    public int size()
    {
        return n1;
    }

    // Queue implementation in java
    public static void main (String[] args)
    {
        // create a queue of capacity 5
        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(50);

        q.dequeue();
        q.dequeue();
        q.dequeue();

        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }
}


/* Try more Inputs
Case 1:
Main q = new Main(3);
q.enqueue(10);
q.enqueue(20);
result = q.peek()
expected = [10]

Case2:
Main q = new Main(5);
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
result = q.peek()
expected = [1]
*/