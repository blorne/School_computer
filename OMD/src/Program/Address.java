/**
 * 
 */
package Program;
import Computer.*;

/**
 * @author martin
 *
 */
public class Address {
	private int index;
	/**
	 * 
	 */
	public Address(int index) {
		this.index = index;
	}

	
	public int getWord(Memory m){
		return m.get(index);
	}
	
	


}
