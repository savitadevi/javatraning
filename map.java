package mapdemo;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map1=new HashMap();
		map1.put(1, " Diksha");
		map1.put(2, " Shubhangi");
		map1.put(6, " Ridhi");
		map1.put(13, " Shabnam");
		map1.put("id", " Human");
		map1.put(10," Ten");
		Set set=map1.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		System.out.println(map1.containsKey(6.8f));
		map1.containsValue(" Amla");
		System.out.println(map1.clone());
		

		
	
	}

}
