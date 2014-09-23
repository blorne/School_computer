/**
 * 
 */
package Computer;
import Program.*;
import java.util.*;
/**
 * @author martin
 *
 */
public class Computer {
	private Memory m;
	private ArrayList<Command> list;
	private WordCounter i;
	private Address counter;
	
	//kommentera for att testa
	public Computer(Memory m) {
		this.m = m;
		list = new ArrayList<Command>();
		i = new WordCounter(0);
		counter = new Address(m.size());
	}
	public void load(Program list){
		this.list = list;
		
	}
	
	public void run(){
		
/*		i = i.get();
		while ( > 0){
			list.get(k).execute(m);*/
		}
	} 

