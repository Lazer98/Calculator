package point;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


public class Main {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	final byte MONTHINYEAR=12;
	final byte PERCENT=100;
	int principal;
	float annualInterest;
	byte years;
	System.out.println("how much is your principal?");
	do {
	principal=s.nextInt();
	if(principal<1000 ||principal>100000)
		System.out.println("Please enter a sum between 1000 and 100000");
	}while(principal<1000 ||principal>100000);
	
	System.out.println("how much is your annual interest?");
	do {
	annualInterest=s.nextFloat();
	if (annualInterest >30 || annualInterest <=0 )
		System.out.println("Please enter a value between 0 and 30");
	}while(annualInterest >30 || annualInterest <=0 );
	float monthlyInterest=annualInterest/PERCENT/MONTHINYEAR;
	System.out.println("for how many years do you want to pay your loan?");
    do{
    	years=s.nextByte();
    	if(years<1 ||years >30)
    		System.out.println("Please enter a value between 1 and 30");
    }while(years<1 ||years >30);
	int monthlyPayment=years*MONTHINYEAR;
	double mortgage=(double)principal*
			(monthlyInterest*Math.pow(1+ monthlyInterest,monthlyPayment))
			/(Math.pow(1+monthlyInterest, monthlyPayment)-1);
	String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
	System.out.println("Mortgage:"+mortgageFormatted);

	/*int income=100000;
	String hasHighIncome=income >= 100000? "First" : "Economy";
	System.out.println(" "+hasHighIncome);*/
	
	/*System.out.println("Please enter a number,div by 5-fiz,by 10-buzz,by both-fizbuzz,by neither-repeats the number");
	int number=s.nextInt();
	if (number%3==0 &&number %5==0) 
		System.out.println("FizBuzz");
	else if(number %5==0)
		System.out.println("Buzz");
	else if(number %3==0)
		System.out.println("Fiz");
	else 
		System.out.println(number);
*/
	
	/* String input="";
	while(!input.equals("quit")) {
		System.out.println("Input: ");
		input=s.next().toLowerCase();
		if(input.equals("pass"))
			continue;
		if(input.equals("quit"))
			break;
		System.out.println(input);
	}*/
}	
}
