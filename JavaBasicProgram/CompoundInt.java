import java.io.*;
import java.util.*;
public class CompoundInt
{
	public static void main (String [] args)
	{
		double P=1000 , R=12.5 , T=5;
		//double CI =principal(1+ R/100)^t  //Formula
	
		double CI=P *(Math.pow((1 + R/100),T)); 
	System.out.println("Compound Interest is = " + CI);	
	}
}