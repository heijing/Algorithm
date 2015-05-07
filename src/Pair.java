import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pairs {
    static int pairs(int[] a,int k) {
        Arrays.sort(a);
        int result=0;
        for(int i = 0; i < a.length - 1; i++)
            {
                    for(int j = i + 1; j < a.length; j++)
                    {
                        int x = Math.abs(a[j] - a[i]);
                        if(x == k)
                             result++;
                         if(x > k)
                             break;
                    }
            }
        return result;
      /* Complete this function */
   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        String n = in.nextLine();
        String[] n_split = n.split(" ");
        
        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);
        
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = pairs(_a,_k);
        System.out.println(res);
    }
}

