import java.util.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {

        //creating the scanner object
		Scanner input = new Scanner(System.in);
		
		//Creating variables based on the questions
		String a1;
		String b1;
		String b2;
		String c1;
		String c2;
		String c3;
		String c4;
		
		//Gives background informations and asks first question
		System.out.println("You are stuck in the year 79 BCE and are lost in Ancient Rome. \nYou have to find your way back to the time machine \nto get back to the future to the year 2023 AD.");
		System.out.println("Do you ask a local for help or try to get familiar with the area on your own? Type ask or own: ");
		a1 = input.nextLine();
		
		//seeing if a1 is equal to ask while ignoring the capitalization.
		if (a1.equalsIgnoreCase("ask"))
		{
			System.out.println();
			System.out.println("You tried to ask someone, but you did not know how to speak the same language");
			System.out.println("You end up looking for paths and roads and find a map and see a big X on it.");
			System.out.println("Do you try to find the X. Answer with y or n: ");
			b1 = input.nextLine();
			
			
			if (b1.equalsIgnoreCase("y"))
			{
				System.out.println();
				System.out.println("You end up finding a path. Do you follow it? Type y or n: ");
				c1 = input.nextLine();
				
				if (c1.equalsIgnoreCase("y"))
				{
					System.out.println();
					System.out.println("The path ends up taking you right to the time machine");
					System.out.println("You enter the time machine and make it home safely");
				}
				else if (c1.equalsIgnoreCase("n"))
				{
					System.out.println();
					System.out.println("You end up getting lost and give up");
				}
				//A fail safe, if the user inputs something wrong, it tells them to restart the program
				else
				{
					System.out.println();
					System.out.println("Please input y or n. Restart the program");
				}
			}
			else if (b1.equalsIgnoreCase("n"))
			{
				System.out.println();
				System.out.println("You end up lost in the woods and see a wild bear. Do you fight it or run? Type fight or run: ");
				c2 = input.nextLine();
				
				if (c2.equalsIgnoreCase("fight"))
				{
					System.out.println();
					System.out.println("Your tried to fight the bear, but the bear won.");
				}
				else if (c2.equalsIgnoreCase("run"))
				{
					System.out.println();
					System.out.println("You run away and end up getting lost in the woods.");
				}
				else
				{
					System.out.println();
					System.out.println("Input run or fight. Restart the program");
				}
			}
			else 
			{
				System.out.println();
				System.out.println("Please input y or n. Restart the program");
			}
		}
		else if (a1.equalsIgnoreCase("own"))
		{
			System.out.println();
			System.out.println("You end up finding a path");
			System.out.println("Do you follow it? Answer with y or n: ");
			b2 = input.nextLine();
			
			if (b2.equalsIgnoreCase("y"))
			{
				System.out.println();
				System.out.println("You kept going down the path and end up at a fork, do you go left or right? Type left or right: ");
				c3 = input.nextLine();
				
				if (c3.equalsIgnoreCase("left"))
				{
					System.out.println("You feel the ground rumbling. You think it is an earthquake \nuntil you look up. You see a could of black smoke \nand see Mount Vesuvius in the distance erupting.");
					System.out.println("The volcano erupts and you get engulfed in lava");
				}
				else if (c3.equalsIgnoreCase("right"))
				{
					System.out.println();
					System.out.println("You encounter another time traveler from the year 4000 A.D.");
					System.out.println("They take you to the time machine and you safely make it home.");
				}
				else
				{
					System.out.println();
					System.out.println("Please input left or right. Restart the program");
				}
			}
			else if (b2.equalsIgnoreCase("n"))
			{
				System.out.println();
				System.out.println("You see a horse that is owned by a civilian");
				System.out.println("Do you take it from a civilian or go without it. Type take or go: ");
				c4 = input.nextLine();
				
				if (c4.equalsIgnoreCase("take"))
				{
					System.out.println();
					System.out.println("The civilian reports you to the police");
					System.out.println("You got arrested and put in jail");
				}
				else if (c4.equalsIgnoreCase("go"))
				{
					System.out.println();
					System.out.println("You take the horse but you do not know how to control it");
					System.out.println("You end up losing control and fall off the horse somewhere in the woods");
					System.out.println("To your surprise, you look behind you and see the time machine and safely make it home.");
				}
				else
				{
					System.out.println();
					System.out.println("Please input take or go. Restart the program");
				}
			}
			else
			{
				System.out.println();
				System.out.println("Please input y or n. Restart the program");
			}
		}
		//Tells user to enter the right inputs if they entered it wrong
		else 
		{
			System.out.println();
			System.out.println("Please input ask or own. Restart the program");
		}
    }
}
