class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 =new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!map1.containsKey(c))
            {
                map1.put(c,1);
            }
            int s_count=map1.get(c);
            map1.put(c,s_count);
            if(map1.containsKey(c))
            {
                s_count++;
                map1.put(c,s_count);
            }
        }
        HashMap<Character,Integer> map2 =new HashMap<>();
        
        for(int j=0;j<t.length();j++)
        {
            
            char d=t.charAt(j);
            if(!map2.containsKey(d))
            {
                map2.put(d,1);
            }
            int t_count=map2.get(d);
            map2.put(d,t_count);
            if(map2.containsKey(d))
            {
                t_count++;
                map2.put(d,t_count);
            }
        }
    if(map1.equals(map2))
    {
        return true;
    }
return false;
    }
}
