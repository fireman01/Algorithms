package solutions;

/**
 * 模拟排队问题
 * @author ljx
 *
 */
public class Queue {
	
	private int position;
	
	private static int length;
 
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public static void sendMessage(){
		
		System.out.println("position has change!!!");
	}
	
	public void joinQueue(){
		length++;
		this.position = length;
		sendMessage();
	}
	public void outQueue(Queue[] q){
		length--;
		for(int i=0; i<q.length; i++){
			q[i].setPosition(q[i].getPosition()-1);
		}
		sendMessage();
	}

}
