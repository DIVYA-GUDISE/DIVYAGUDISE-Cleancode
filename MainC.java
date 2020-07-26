import Interest.SimpleInterest;
import Interest.CompondInterest;
import java.util.Scanner;
public class Mainclass
{
	public static void main(String args[])
{
 	SimpleInterest s=new SimpleInterest();
	CompoundInterest c =new CompoundInterest();
	Scanner sc=new Scanner(System.in);
	float p=sc.nextfloat();
	float r=sc.nextfloat();
	int time=sc.nextInt();
	int times=sc.nextInt();
	float com=c.findCInterest(p,time,r,times);
	float sim=s.findSInterest(p,time,r);
}
}
