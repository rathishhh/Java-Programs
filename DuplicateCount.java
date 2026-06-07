import java.util.*;

class DuplicateCount
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 10, 30, 20, 10, 30, 30};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : arr)
        {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            if(e.getValue() > 1)
            {
                System.out.println(e.getKey() + " - " + e.getValue());
            }
        }
    }
}