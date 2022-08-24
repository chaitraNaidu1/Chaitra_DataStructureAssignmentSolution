package gl.Service;

import java.util.Collections;
import java.util.PriorityQueue;

public class Service {

	public void printConstructionTable(int floor[]) {
		
		PriorityQueue<Integer>queue=new PriorityQueue<>(Collections.reverseOrder());
		
		int max=floor.length;
		
		System.out.println("The order of construction is as follows");
		for(int i=0;i<floor.length;i++)
		{
			System.out.println("Day: "+(i+1));
			queue.add(floor[i]);
			while(!queue.isEmpty()&& queue.peek()==max) {
				System.out.println(queue.poll()+" ");
				max--;
			}
		System.out.println();
		}
		
	}
}