package day12_29_05_2024;



import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String>  m =  new HashMap<Integer, String>();

		m.put(1, "showrya");
		m.put(2, "shiva");
		m.put(3, "suraj");
		
		//System.out.println(m);
		
		for(Entry<Integer, String> me:m.entrySet()) {
			System.out.println(me.getKey()+" ===" +me.getValue());
		}
			
		}

	}


