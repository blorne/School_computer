/**
 * 
 */
package Computer;

/**
 * @author martin
 *
 */
public class LongWord implements Word {
private long value;
	/**
	 * 
	 */
	public LongWord(long value) {
		this.value=value;
	}
	public Number get() {
		return value;
	}

}
