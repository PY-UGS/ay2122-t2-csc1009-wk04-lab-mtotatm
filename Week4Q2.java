package Week4;

public class Week4Q2
{
    public static void main(String[] args)
    {
        Stack StackOfIntegers = new Stack();

        for (int i = 0; i < 10; i++)
        {
            StackOfIntegers.push(i);
        }

        while(!StackOfIntegers.empty())
            System.out.print(StackOfIntegers.pop() + " ");
    }
}
