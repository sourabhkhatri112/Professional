import java.util.ArrayList;
import java.util.List;

public class GraphSimplestExample {
	public static void main(String[] args) {
		int vertices = 3;
		List<List<Integer>> graph = new ArrayList<List<Integer>>();

		for (int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		graph.get(0).add(1);
		graph.get(1).add(2);
		graph.get(2).add(0);
		
		for(int i=0;i<vertices;i++) {
			System.out.println("Node " + i + " is connected to " + graph.get(i));
		}
	}
}
