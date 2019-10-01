import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(i,s.nextInt());
        }
        int q = s.nextInt();
        for(int i=0;i<q;i++)
        {
            String querry=s.next();
            if(querry.equals("Insert"))
            {
                int index=s.nextInt();
                int data=s.nextInt();
                arr.add(index,data);
                
            }
            else if(querry.equals("Delete"))
            {
                int index=s.nextInt();
                arr.remove(index);
                
            }
        }

        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        s.close();
    }
}

