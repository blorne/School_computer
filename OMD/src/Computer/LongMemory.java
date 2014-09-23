/**
 * 
 */
package Computer;
import java.util.*;


import Program.Address;

/**
 * @author martin
 *
 */
public class LongMemory implements Memory {
	private int size;
	protected ArrayList<Word> list;

	public LongMemory(int size) {
			this.size = size;
			list = new ArrayList<Word>(size);
	}
	
	public void get(Word w, Address a){
		
	}
	public void set(Word w, Address a){
		list.add(w);
	}
	public int size(){
		return size;
	}


}
