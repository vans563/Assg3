import java.util.Scanner;
import java.util.Stack;

public class BalancedBracketsCode
{
	public static void check(String st) 
	{

		Stack<Character> s = new Stack<Character>();
		int n = st.length();
		for (int i = 0; i < n; i++) 
		{
			if (st.charAt(i) == '{' || st.charAt(i) == '[' || st.charAt(i) == '(') 
                        {
				s.push(st.charAt(i));
			}
			if (!s.isEmpty()) 
			{
				if (st.charAt(i) == ')' && s.peek() == '(')
			        {

					s.pop();
				} 
				else if (st.charAt(i) == ']' && s.peek() == '[') 
				{
					s.pop();
				} 
				else if (st.charAt(i) == '}' && s.peek() == '{') 
				{
					s.pop();
				}
			}

		}

		if (s.isEmpty())
		{
			System.out.println("Balanced");
		}
		else 
		{
			System.out.println("Not balanced");
		}
	}

	public static void main(String args[]) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		check(str);

	}

}