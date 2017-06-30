import java.util.*;

class District
{
    String dist_name;
District(String dist_name)
{
    this.dist_name=dist_name;
}
public String toString()
{
    return dist_name;
}
    
}
/*class State
{
    List<District> dist;
    State(List<District> dist)
    {
    this.dist = dist;
    }
}*/

class Array_to_Array_List
{
        public static void main(String args[])
    {
        String city_state [] = {"Tamilnadu", "Chennai"};
        
        ArrayList<String> s = new ArrayList<String> (Arrays.asList(city_state));
        System.out.println("" +s);
        District district1 = new District ("namakkal");
        District district2 = new District ("Erode");
        ArrayList<District> dist = new ArrayList<District>();
       
        dist.add(district1);
        dist.add(district2);
        System.out.println(" " +dist);
        List<String> strings = new ArrayList<>(dist.size());
        for (Object object : dist)
        {
            strings.add(Objects.toString(object,null));            
        }
        s.addAll(strings); 
       
        System.out.println(" " +s);
        
        }
    }

