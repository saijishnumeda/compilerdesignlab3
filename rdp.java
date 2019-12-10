//S->a | ^ | (T)	
//T-> T, S | S

import java.util.*;

class rdp{
	
static int ptr;
static char[] input;

public static void main(String args[])
{
		System.out.println("Enter the input string");
		
		String s = new Scanner(System.in).nextLine(); 
		
		input = s.toCharArray();	
		System.out.println("length "+ input.length);
		if(input.length < 1)
			{
			System.out.println("The input string is invalid.");
			System.exit(0);
			} 
			
			ptr = 0;
			boolean isValid = S();
			System.out.println("isvalid "+ isValid);
			if((isValid) & (ptr == input.length))
			{
				System.out.println("The input string is valid.");
			}
				else
				{
					System.out.println("The input string is invalid.");
				}

		
				
}
			static boolean S()
			{
				
				int fallback = ptr;
				
				if(input[ptr] == 'a'|| input[ptr]=='^') 
				{
						ptr++;
					return true;
				}
				
				else {
					ptr=fallback;
				if(input[ptr++] == '(') 
				{
					return false;
				}
				if(T() == false)
				 {
			
					return false;
				}
				if(input[ptr++] == ')')
				 {
					return false;
				}
				return true;
		}

	}
static boolean T() 
{

		if(S() == false)
		{
			
			return true;
		}
		else{
				if(T()==false)
		{
			return false;
		}
		if(input[ptr++] ==',')
		{
			return false;
		}
		if(S() == false)
		{
			return false;
		}
		return true;
		}
		
}
}


