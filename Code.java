int[] findLongestSubarrayBySum(int s, int[] arr) {
    
    if(arr.length == 1)
    {
        if(arr[0] == s)
            return create_array(1, 1);
        else
            return create_array(-1, 1);
       
    }
    
    if(s == 0)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                return create_array(i+1, i+1);
            }
        }
    }
    
    HashMap<Integer, Integer> run_sum = new HashMap<Integer, Integer>();
    int sum = 0;
    int max_length = -1, i_start = -1, i_end = -1, t_start = -1, curr_length = 0;
    
    for(int i = 0; i < arr.length; i++)
    {
        sum += arr[i];
        run_sum.put(sum, i);
        
        if(sum >= s)
        {
            if(sum == s)
            {
                if()
            }
        }
        
    }
    
    return create_array(i_start,i_end);
    
}



int[] create_array(int x, int y)
{
    int[] result;
    if(x == -1)
        return result = new int[]{-1};
    else
        return result = new int[]{x, y};
}
