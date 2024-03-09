/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
	String s = "[](){}(){}";
	  List < Character > ans = new ArrayList <> ();
	for (char c:s.toCharArray ())
	  {
		ans.add (c);
	  }

	Stack < Character > stack = new Stack <> ();
	boolean isValid = true;

  for (char c:ans)
	  {
		if (c == '{' || c == '[' || c == '(')
		  {
		   stack.push (c);
		   }
		   else if (c == '}' && !stack.isEmpty () && stack.peek () == '{')
		   {
		   stack.pop ();}
		   else
		   if (c == ']' && !stack.isEmpty () && stack.peek () == '[')
		   {
		   stack.pop ();}
		   else
		   if (c == ')' && !stack.isEmpty () && stack.peek () == '(')
		   {
		   stack.pop ();}
		   else
		   {
		   isValid = false; break;}
		   }
		   if (isValid && stack.isEmpty ())
		   {
		   System.out.println ("true");	// Valid combination of brackets
		   }
		   else
		   {
		   System.out.println ("false");	// Invalid combination of brackets
		   }
		   }
		   }
