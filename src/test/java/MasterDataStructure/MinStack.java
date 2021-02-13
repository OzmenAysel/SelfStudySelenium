package MasterDataStructure;
import java.util.Stack;

public class MinStack{

// Done using Stack class in util package I have a written a Min function to find minimum of the values.


    public static void main(String[] args) {

        Stack<Integer> s=new Stack<Integer>();

        s.push(20);

        s.push(30);

        s.push(40);

        s.push(60);

        s.push(10);

        s.pop();

        s.size();

        int min=Min(s);

        System.out.println("Minimum value is "+min);

        System.out.println("Stack values are:"+s);

    }

    static int Min(Stack<Integer> s)

    {

        int min=s.get(0);

        for(int i=0;i<s.size();i++)

        {

            if(min>s.get(i))

                min=s.get(i);

        }

        return min;

    }

}
