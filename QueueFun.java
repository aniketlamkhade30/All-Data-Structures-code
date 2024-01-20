// PS : Queue Function using java

class node              // struct node
{
    public int data;
    public node next;

    public node(int no)
    {
        data = no;
        next = null;
    }
}

class Queue
{
    private node first;
    public int Count;

    public Queue()
    {
        first = null;
        Count = 0;
    }

    public void Enqueue(int no)
    {
        node newn = new node(no);
        node temp = first;

        if(first == null)
        {
            first = newn;
        }
        else
        {
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        Count++;
    }

    public int Dequeue()
    {
        int value = 0;
        if(first == null)
        {
            System.out.println("Queue is empty....!");
        }
        else
        {
            value = first.data;
            first = first.next;
        }
        Count--;
        return value;
    }

    public void Display()
    {
        node temp = first;

        System.out.println("Elements of Queue are : ");
        while(temp != null)
        {
            System.out.print("  | "+temp.data+" |  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void Count()
    {
        System.out.println("Number of elements are : "+ Count);
    }
}

class QueueFun
{
    public static void main(String Arg[])
    {
        int iRet = 0;
        Queue obj = new Queue();

        obj.Enqueue(101);
        obj.Enqueue(51);
        obj.Enqueue(21);
        obj.Enqueue(11);
        obj.Display();
        obj.Count();

        iRet = obj.Dequeue();
        obj.Display();
        obj.Count();
        System.out.println("Remved element is : "+ iRet);

        iRet = obj.Dequeue();
        obj.Display();
        obj.Count();
        System.out.println("Removed element is : "+ iRet);
    }
}