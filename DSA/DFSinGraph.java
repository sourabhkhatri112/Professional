import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
	public static void main(String[] args) {
		int vertices = 4;
		List<List<Integer>> graph = new ArrayList<List<Integer>>();
		for (int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<Integer>());
		}

		// Add edges
		graph.get(1).add(2);
		graph.get(0).add(2);
		graph.get(0).add(1);
		graph.get(2).add(3);
		graph.get(2).add(0);
		graph.get(3).add(3);

		System.out.println("BFS starting from node 2");
		boolean[] visited = new boolean[vertices];
		DFS(graph, 2, visited);
	}

	public static void DFS(List<List<Integer>> graph, int currentNode, boolean visited[]) {
		visited[currentNode] = true;
		System.out.print(currentNode + " ");


		for (int neighbor : graph.get(currentNode)) {
			if (!visited[neighbor]) {
				DFS(graph, neighbor, visited);
			}
		}
	}
}

