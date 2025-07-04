import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ComplexGraph {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of vertices");
		int vertices = scanner.nextInt();

		System.out.println("Enter number of Edges");
		int edges = scanner.nextInt();

		List<List<Integer>> graph = new ArrayList<List<Integer>>();
		for (int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<>());
		}

		System.out.println("Enter up the edges");
		for (int i = 0; i < edges; i++) {
			int source = scanner.nextInt();
			int destination = scanner.nextInt();

			graph.get(source).add(destination);
			graph.get(destination).add(source);
		}

		System.out.println("Graph Representation ");
		for (int i = 0; i < vertices; i++) {
			System.out.println("Node " + i + "connected to " + graph.get(i));
		}
		scanner.close();
	}
}
