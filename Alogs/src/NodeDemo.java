import java.util.Scanner;


public class NodeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node = new Node(5, null);
		//Node node1 = new Node(6, null);
		//Node node2 = new Node(7, null);
		//node.next = node1;
		//node1.next = node2;
		
		for (int i = 0; i < 5; i++) {
			Scanner in = new Scanner(System.in);
			int newNodeValue = in.nextInt();
			System.out.println(newNodeValue);
			Node newNode = new Node(newNodeValue, null);
			addNode(newNode, node);
		}
		//printNodes(node1);
		printNodes(node);
	}
	
	public static void  addNode(Node newNode, Node List) {
		Node temp;
		while(List.next != null){
			List  = List.next;
		}
		List.value = newNode.value;
		List.next = null;
				
	}
	public static void printNodes(Node node){
		while(node != null){
			System.out.print(node.value+"--->");
			node = node.next;
		}
		System.out.println("Null");
	}

}
