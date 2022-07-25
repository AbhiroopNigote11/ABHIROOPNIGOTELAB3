package com.abhi.balancebracket.main;

import com.abhi.balancebracket.service.BalancingBrackets;

public class Driver {
	
	public static void main (String[] args)
	{
		BalancingBrackets balacingBrackets= new BalancingBrackets();
		String BracketExpression="([[{}]])";
		Boolean result;
		 
		result = balacingBrackets.checkingBracketBalanced(BracketExpression);
		
		if (result)
			System.out.println("The entered string has balanced Brackets");
		else
			System.out.println("The entered String do not contain Balanced Brackets");
		
	}

}
