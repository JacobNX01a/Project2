//Program Name:	TestAuto.java     
//Programmer:	Jacob Hoyos
//Class:		CSCI-003
//Project:		Project2
//Purpose: 		Provides static 

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class project2
{
	public static void main (String[] args)
	{
		int iUserChoice;  //stores the menu choice made by the user
		
		int iChosenScore;   //stores the entered test score for adjustScore
		int iAdjustedScore; //stores the adjusted score from adjustScore
		
		int x; 		//stores a value for mathStats' maxScore and minScore methods
		int y; 		//stores a value for mathStats' maxScore and minScore methods
		int z; 		//stores a value for mathStats' maxScore and minScore methods
		int u; 		//stores a value for mathStats' maxScore and minScore methods
		int v; 		//stores a value for mathStats' maxScore and minScore methods
		int iMax;	//catches the value from the Mathstats maxScore method
		int iMin;   //catches the value from the Mathstats minScore method
		
		int iSc1;		//holds the first score for wieghted average
		int iWi1;		//holds the wieght for the first score
		int iSc2;		//holds the second score for wieghted average
		int iWi2;		//holds the wieght for the second score
		int iSc3;		//holds the third score for wieghted average
		int iWi3;		//holds the wieght for the third score
		double dWghAvg; //catches the weighted average from weighted average
		
		int iNumAvgs;		//holds the number of averages to be entered by the user
		double dTotalAvg;	//catches the total average from imputScores&Avg
		
		Scanner kb = new Scanner(System.in);
		
		Utility.clearScreen();
		
		iUserChoice = menuOutput();
		
		switch (iUserChoice)
		{
			case 1:
				MathStats c1 = new MathStats();
				iChosenScore = c1.getScore();
				iAdjustedScore = c1.adjustScore(iChosenScore);
				System.out.print("\n The adjusted Score is "+iAdjustedScore);
				Utility.pressEnterToContinue();
				break;
				
			case 2:
				MathStats c2 = new MathStats();
				x = c2.getScore();
				y = c2.getScore();
				z = c2.getScore();
				u = c2.getScore();
				v = c2.getScore();
				
				iMax = c2.maxScore(x, y, z, u, v);
				iMin = c2.minScore(x, y, z, u, v);
				
				System.out.print("\n The Maximum value is "+iMax);
				System.out.print("\n The Minimum value is "+iMin);
				Utility.pressEnterToContinue();
				break;
				
			case 3:
				MathStats c3 = new MathStats();
				System.out.print("\n Please Enter a Wieght Following Each Score\n");
				System.out.print("\n Make Sure That The Wieghts Add to 100\n");
				iSc1 = c3.getScore();
				iWi1 = c3.getScore();
				iSc2 = c3.getScore();
				iWi2 = c3.getScore();
				iSc3 = c3.getScore();
				iWi3 = c3.getScore();
				
				dWghAvg = c3.weightedAvg(iSc1, iWi1, iSc2, iWi2, iSc3, iWi3);
				
				System.out.print("\n The Wieghted Average is "+dWghAvg);
				Utility.pressEnterToContinue();
				break;			
			
			case 4:
				MathStats c4 = new MathStats();
				System.out.print ("\n Please Enter the Number of Scores You Wish ");
				System.out.print ("to Average: ");
				iNumAvgs = kb.nextInt();
				dTotalAvg = c4.inputScoresAndAverage(iNumAvgs);
				
				System.out.print("\n The Total Average of the Entered Scores is: ");
				System.out.print(dTotalAvg);	
				Utility.pressEnterToContinue();
				break;		
			case 5:
				MathStats c5 = new MathStats()
				System.out.print("/n Determining the maximum and mniimum of ");
				System.out.print("entered scores...")
				
		}
	}
	
	public static int menuOutput()
	{
		Scanner kb = new Scanner(System.in);
		int iUserChoice;  //stores the menu choice made by the user
		
		System.out.print("\n\t          M       E       N       U             ");
		System.out.print("\n\t////////////////////////////////////////////////");
	    System.out.print("\n\t// 1: Adjust a Test Score                     //");
	    System.out.print("\n\t// 2: Display the Min and Max of 5 Tests      //");
		System.out.print("\n\t// 3: Display the Wieghted Average of 3 Tests //");
		System.out.print("\n\t// 4: Enter and Average Scores                //");
		System.out.print("\n\t// 5: Find the Average Min and Max of Scores  //");
		System.out.print("\n\t// 6: Exit the Program                        //");
		System.out.print("\n\t////////////////////////////////////////////////");
		
		System.out.print("\n\tPlease Select an Option: ");
		iUserChoice = kb.nextInt();
		
		if (iUserChoice <= 6 && iUserChoice >= 1)
		{
			
		}
		else
		{
			System.out.print("\n\tInvalid Entry, Please Try Again");
			Utility.pressEnterToContinue();
		}
		
		return iUserChoice;
	}
}
