package Computer;
import Program.*;


public interface Memory {

	public int size();
	public void get(Word w, Address a);
	public void set(Word w, Address a);
	
}
