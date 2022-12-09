package collectionsFramework;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hassetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<String> set=new HashSet<String>();
        LinkedHashSet<String> set1=new LinkedHashSet<String>();
        set.add("z");
        set.add("y");
        set.add("x");
        set.add("a");
        set.add(null);
        set.add("b");
        
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        
	}

}
