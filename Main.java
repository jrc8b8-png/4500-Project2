package project2;




/* Project 2:  Dollar Game.
 * 
 * Names:
 * 	Robert Kaufman
 * 	Jack Crowley
 *  
 *  
 * E-mails:
 * 	
 * 	jrc8b8@mail.umsl.edu
 * 	
 * 
 * Class:
 * 	4500 Introduction to the Software Profession
 * 
 * Class Number:
 * 	001
 * 
 * 
 * Project Description:
 * 
 * ---------------------------
 * This project allows a user to play "The Dollar Game"
 * 
 * 1.  This program asks the user for 2 to 7 vertices.
 * 
 * 2.  This program asks the user for a number of edges.  The minimum is the number of vertices - 1.
 * 
 * 3.  This program asks the user to list each edge's connections.  Vertices cannot be connected to themselves.
 * 
 * 4.  After all edges have been defined, the user plays the game.
 * 
 * 5.  The user may quit at any time by typing "Q" or "q"
 * 
 * 6.  The user plays the game by typing the name of a vertex (a single letter).
 * 		-When selected, the vertex transfers one dollar to all connected vertices.
 * 
 * 
 * 
 * 
 * ---------------------------
 * 
 * 
 * 
 */



//Needed for user input.
import java.util.Scanner;

import java.util.InputMismatchException;


public class Main {

	
	public final static int VERT_MAX = 7;
	
	public final static int VERT_MIN = 2;
	
	
	
	
	
	public static void main (String [] args)
	{
	
	//vertices: the number of vertices for this assignment.
	int vertices;
	
	//edges:  the number of edges for this assignment.
	int edges;
	
	
	
		vertices = getVertices();
	
		
		edges = getEdges(vertices);
	
		
		
	
	}
	
	
	/* getVertices()
	 * 
	 * Returns an integer value between VERT_MIN and VERT_MAX (Inclusive).
	 * 
	 * Gets the integer value from the user.
	 * 
	 * 
	 */
	public static int getVertices()
	{
		
		//vertValue: Should hold the number of vertices from the user's input.
		int vertValue = 0;
		
		
		//isValid:  If this is true, then the user entered valid input.
		boolean isValid = false;
		
		
		//reader:  This scanner takes in input.
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter a number of vertices for the Dollar Game between "  + VERT_MIN + " and " + VERT_MAX);
		
		do
		{
			
			try
			{
				vertValue = reader.nextInt();
				
				if (vertValue >= VERT_MIN && vertValue <= VERT_MAX )
				{
					isValid = true;
					
				}
				else
				{
					System.out.println("Error.\nInvalid Value\nPlease enter an whole number value between " + VERT_MIN + " and " + VERT_MAX);
					
					isValid = false;
					
				}
				
				
			}
			catch(InputMismatchException e)
			{
				System.out.println("Error.\nInvalid Entry\n Please enter an whole number value between " + VERT_MIN + " and " + VERT_MAX);
				
				isValid = false;
				
			}
			
			
			
		}while (isValid == false);
		
		
		reader.close();
		
		
		return vertValue;
	}

	
	
	public static int getEdges(int vertices)
	{
		//vertValue: Should hold the number of vertices from the user's input.
				int edgeValue = 0;
				
				
				//isValid:  If this is true, then the user entered valid input.
				boolean isValid = false;
				
				
				//reader:  This scanner takes in input.
				Scanner reader = new Scanner(System.in);
				
				System.out.println("Please enter a number of edges for the Dollar Game.");
				
				System.out.println("The minimum amount of edges required is " + (vertices - 1));
				
				do
				{
					
					try
					{
						edgeValue = reader.nextInt();
						
						if (edgeValue >= (vertices - 1))
						{
							isValid = true;
							
						}
						else
						{
							System.out.println("Error.\nInvalid Value\nPlease enter an whole number value greater than " + vertices);
							
							isValid = false;
							
						}
						
						
					}
					catch(InputMismatchException e)
					{
						System.out.println("Error.\nInvalid Entry\n Please enter an whole number value  greater than " + vertices);
						
						isValid = false;
						
					}
					
					
					
				}while (isValid == false);
				
				
				reader.close();
				
				
				return edgeValue;

	}
	
}





