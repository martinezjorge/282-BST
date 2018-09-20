
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) throws FileNotFoundException {

		int NumberOfVertices=0;
		int NumberOfEdges=0;
		ArrayList<String> vert = new ArrayList<>();
		int[][] edges=null;
		File file = new File("src/input.txt");
		BST<String> objTest = new BST<>();


		objTest.insert("M");
		System.out.println(objTest.size);
		objTest.insert("D");
		System.out.println(objTest.size);
		objTest.insert("V");
		System.out.println(objTest.size);
		objTest.insert("B");
		System.out.println(objTest.size);
		objTest.insert("C");
		System.out.println(objTest.size);
		objTest.insert("A");
		System.out.println(objTest.size);
		objTest.insert("P");
		System.out.println(objTest.size);
		objTest.insert("Y");
		System.out.println(objTest.size);
		objTest.insert("O");
		System.out.println(objTest.size);
		objTest.insert("Q");
		System.out.println(objTest.size);
		objTest.insert("X");
		System.out.println(objTest.size);
		objTest.insert("Z");
		System.out.println(objTest.size);

		System.out.println();

		System.out.println(objTest.search("O"));
		System.out.println(objTest.search("M"));
		System.out.println(objTest.search("A"));
		System.out.println(objTest.search("Q"));

		System.out.println();

		System.out.println(objTest.delete("O"));
		System.out.println(objTest.size);

		System.out.println(objTest.delete("C"));
		System.out.println(objTest.size);

		System.out.println(objTest.delete("Y"));
		System.out.println(objTest.size);

		System.out.println(objTest.delete("M"));
		System.out.println(objTest.size);

		System.out.println(objTest.delete("D"));
		System.out.println(objTest.size);

		//objTest.inorderNoRecursion();

		/*
		Scanner sc = new Scanner(file);

		while(sc.hasNext())
		{
			String operation=sc.next();
			String nodeValue=sc.next();

			if("INS".equalsIgnoreCase(operation))
			{
				objTest.insert(nodeValue);
				//
				System.out.print(nodeValue + " " );
				System.out.println(objTest.size);
			}
			else if("DEL".equalsIgnoreCase(operation))
			{
				objTest.delete(nodeValue);
				//
				System.out.println(objTest.size);
			}
			else if("COUNT".equalsIgnoreCase(operation))
			{
				if("NON_LEAF".equalsIgnoreCase(nodeValue))
				{
					System.out.println(objTest.getNumberofNonLeaves());
				}

			}
			else if("SEARCH".equalsIgnoreCase(operation))
			{
				System.out.println(objTest.search(nodeValue));


			}
			else if("GET".equalsIgnoreCase(operation))
			{
				if("NON_REC_IN".equalsIgnoreCase(nodeValue))
				{
					printTraversal(objTest.inorderNoRecursion());
				}
				else if("NON_REC_POST".equalsIgnoreCase(nodeValue))
				{
					printTraversal(objTest.postorderNoRecursion());
				}
			}

		}
		*/
			
		System.out.println("Ran to the end");
	}
	
	
	public static void printTraversal(ArrayList arr)
	{
		System.out.println("");
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(arr.get(i));
		}
	}
	
}
