package Week4;

import java.util.ArrayList;
import java.util.List;

public class Stack
{
    private List<Integer> elements = new ArrayList();
    private int size;

    public boolean empty()
    {
        if(size == 0)
            return true;
        else
            return false;
    }

    public int getSize()
    {
        return size;
    }

    public void push(int value)
    {
        size += 1;
        elements.add(value);
    }

    public int pop()
    {
        int valueToBeRemoved = elements.get(size - 1);
        elements.remove(size-1);
        size-=1;
        return valueToBeRemoved;
    }

    public int peek()
    {
        return elements.get(size - 1);
    }
}
