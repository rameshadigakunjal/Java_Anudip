package Collection;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExampleForMap {
	public static void main(String[] args) {
//		HashMap hm = new HashMap();
//		
//		hm.put("name", "rakesh");
//		hm.put("Education", "MCA");
//		hm.put("Technology", "Java");
//		
//		//System.out.println(hm);
//		
//		for(Object i : hm.keySet()) {
//			System.out.println(i);
//		}
		
		
		HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("Name", "Rahul");
        hm.put("Education", "BE");
        hm.put("Technology", "Java");

        System.out.println(hm);

        for (Map.Entry<String, String> e : hm.entrySet())
        {
            System.out.println(e.getKey() + "=" + e.getValue());
        }
        
        
        System.out.println(hm.containsKey("Education"));
        System.out.println(hm.containsValue("BE"));
        
        System.out.println("----------------------------");
        
        LinkedHashMap lhm =new LinkedHashMap();
        
        lhm.put("name", "Rajshekar");
        lhm.put("Branch", "Commerce");
        
        System.out.println(lhm);
        
        System.out.println("------------------------------");
        
        TreeMap<String, String> tm = new TreeMap();
        
        tm.put("name", "raj");
        
        System.out.println(tm);
        
        System.out.println("--------------------------------");
        
        Hashtable<String, String> ht = new Hashtable();
        
        ht.put("name", "rajneesh");
        
        System.out.println("ht");
	}
}
