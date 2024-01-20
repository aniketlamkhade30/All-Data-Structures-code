// PS : Stack Function using java

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

class Stack
{
    private node first;
    public int Count;

    public Stack()
    {
        first = null;
        Count = 0;
    }

    public void Push(int no)
    {
        node newn = new node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        Count++;
    }

    public int Pop()
    {
        int value = 0;
        if(first == null)
        {
            System.out.println("STACK is empty....!");
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

        System.out.println("Elements of Stack are : ");
        while(temp != null)
        {
            System.out.println("| "+temp.data+" |");
            temp = temp.next;
        }
    }

    public void Count()
    {
        System.out.println("Number of elements are : "+ Count);
    }
}

class StackFun
{
    public static void main(String Arg[])
    {
        int iRet = 0;
        Stack obj = new Stack();

        obj.Push(101);
        obj.Push(51);
        obj.Push(21);
        obj.Push(11);
        obj.Display();
        obj.Count();

        iRet = obj.Pop();
        obj.Display();
        obj.Count();
        System.out.println("Popped element is : "+ iRet);

        iRet = obj.Pop();
        obj.Display();
        obj.Count();
        System.out.println("Popped element is : "+ iRet);
    }
}