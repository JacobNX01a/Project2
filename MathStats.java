//Program Name:	TestAuto.java     
//Programmer:	Jacob Hoyos
//Class:		CSCI-003
//Project:		Project2
//Purpose: 		Provides non-static methods to be used in project 2 

import java.lang.Math;
import java.util.Scanner;
public class MathStats
{

	public static int getScore()
	{
		int iValue; //holds the value from the keyboard
		Scanner kb = new Scanner(System.in);
		System.out.print("\n Please enter a value: ");
		iValue = kb.nextInt();
		return iValue;
	}//end getScore()
	
	public int adjustScore (int selScore)
	{
		int iAdjScore; //holds the adjusted score
		iAdjScore = 0;
		if ( selScore >= 90) {
			
			iAdjScore = selScore + 2;
			return iAdjScore;
			
		}
		else if ( selScore >= 80 && selScore < 90){
			
			iAdjScore = selScore +4;
			return iAdjScore;
		}
		else if ( selScore >= 70 && selScore < 80){
			
			iAdjScore = selScore +6;
			return iAdjScore;
		}
		else if ( selScore >= 60 && selScore < 70){
			
			iAdjScore = selScore +8;
			return iAdjScore;
		}
		else if ( selScore < 60){
			
			iAdjScore = selScore +10;
			return iAdjScore;
	
		}
		return iAdjScore;
	}//end adjScore(int)
	
	public int maxScore (int x, int y, int z, int u, int v)
	{
		
		int iMax1;  //holds the max of the first two variables
		int iMax2;  //holds the max of the second two variables
		int iMax3;  //holds the max of the third two variables
		int iMax4;  //holds the max of the last two variables
		
		

		
		iMax1 = Math.max(x,y);
		iMax2 = Math.max(iMax1, z);
		iMax3 = Math.max(iMax2, u);
		iMax4 = Math.max(iMax3, v);
		
		return iMax4;
	}//end maxScore(int, int, int, int, int)
	
	public int minScore (int x, int y, int z, int u, int v)
	{
		int iMin1;  //holds the min of the first two variables
		int iMin2;  //holds the min of the second two variables
		int iMin3;  //holds the min of the third two variables
		int iMin4;  //holds the min of the last two variables
		

		
		iMin1 = Math.min(x,y);
		iMin2 = Math.min(iMin1, z);
		iMin3 = Math.min(iMin2, u);
		iMin4 = Math.min(iMin3, v);
		
		return iMin4;
	}//end minScore(int, int, int, int, int)
	
	public double weightedAvg (int x1, int w1, int x2, int w2, int x3, int w3)
	{
		double dWghtAvg1; //holds the weighted average for the first two values
		double dWghtAvg2; //holds the weighted average for the secound two values
		double dWghtAvg3; //holds the weighted average for the third two values
		
		double dWghtAvgTotal;//holds the total weighted average
		if(w1 + w2 + w3 == 100)
		{
			
		}
		else
		{
			System.out.print("\n Invalid, make sure the wieghts add to 100");
		}
		dWghtAvg1 = ((1.0 * x1) * (1.0 * w1/100));
		dWghtAvg2 = ((1.0 * x2) * (1.0 * w2/100));
		dWghtAvg3 = ((1.0 * x3) * (1.0 * w3/100));
		
		dWghtAvgTotal = ((dWghtAvg1 + dWghtAvg2 + dWghtAvg3));
		return dWghtAvgTotal;
	}//end weightedAvg(int, int, int, int, int, int)
	
	public double imputScoresAndAverage(int numScores)
	{
		MathStats c1 = new MathStats();
		int iSumAvgs;      //holds the sum of the averages
		double dTotalAvg;  //holds the total average
		int iCount;        //count variable
		
		dTotalAvg = 0;
		for ( iCount = numScores; iCount > numScores; iCount++)
		{
			iSumAvgs = c1.getScore() + c1.getScore();
			dTotalAvg = ((1.0 * iSumAvgs)/numScores);
			
			return dTotalAvg;
		}
		return dTotalAvg;
	}//end imputScoresAndAverage(int)
	
	public double maxScoreInput()
	{
		int iTotalMin; //holds the minimum of all of the entered values
		int iTotalMax; //holds the maximum of all of the entered values
		int iValEnt;   //holds all of the values entered
		double dAvg;   //holds the average of all of the entered values
		int i; // count variable
		dAvg = 3;
		for( i = 1; i != -1; i++){
		
		iValEnt = MathStats.getScore();
		
		
		}
		

		//dAvg = 1.0 * ((iTotalMax + iTotalMin)/2);
		//return iTotalMax;
		//return iTotalMin;
		return dAvg;
	}//end maxScoreImput()
	
}//end MathStats
	
	
	
	
	
	
	
