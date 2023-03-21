import java.util.*;
import java.lang.*;
import java.time.*;
import java.text.*;
class as
{
int i,j,n=0,temp=0;
int arr[]=new int[30];
Scanner s=new Scanner(System.in);
sub ss = new sub();
public void ds()
{
try
{
System.out.println("Enter number of seats do you want?");
n =s.nextInt();
if(n<=30)
{
for(i=0;i<n;i++)
{
System.out.print("Enter your seat number: ");
temp=s.nextInt();
System.out.println();
for( j=0;j<n;)
{
if(i==0)
{
arr[i]=temp;
System.out.println("Seat is availble.");
System.out.println();
break;
}
else
{
if(temp==arr[j])
{
System.out.println("Seat is not availble.");
System.out.println();
System.out.println("Please enter a availble seat number");
temp=s.nextInt();
if(temp==arr[j])
{
System.out.println("Seat is not availble.");
System.out.println();
System.out.println("Please enter a availble seat number");
}
else
{
arr[i]=temp;
}
}
else
{
arr[i]=temp;
System.out.println("Seat is availble.");
System.out.println();
break;
}
}
}
}
}
else
{
throw new WrongSatNumber();
}
}
catch(WrongSatNumber e)
{
e.printStackTrace();
}
if(arr[0]==0)
{
System.out.println("Please enter less 30 seats");
}
else
{
ss.display();
}
}
class WrongSatNumber extends Exception
{
WrongSatNumber()
{
System.out.println("Error");
}
}
}
class rev
{
public static final DateFormat dd=new SimpleDateFormat("yyyy/mm/dd hh/mm/ss");
public static void main (String args[])
{
Date date=new Date();
as ss = new as();
Scanner s=new Scanner(System.in);
String n89,f,t;
int f1;
System.out.print("\n");
for( f1=1;f1<=24;f1++)
{System.out.print("*");
}
for( f1=1;f1<=5;f1++)
{
if(f1==3)
{
System.out.println("\n* Welcome to SS bus\t* \n* express \t\t*");
}
else{System.out.println("*\t\t\t*");
}
}
for( f1=1;f1<=25;f1++)
{System.out.print("*");
}
System.out.println("\n");
System.out.print("Enter your name:") ;
n89=s.nextLine();
System.out.println();
System.out.print("Enter your age:") ;
int a=s.nextInt();
if(a<=100)
{
}
else
{
System.out.println("Enter a valid seat number");
}
System.out.println();
System.out.print("Enter your journey details");
System.out.println();
System.out.print("Enter your pickup point: ");
f =s.next();
System.out.println("");
System.out.print("Enter your drop point: ");
t =s.next();
do
{
System.out.println("");
System.out.println("Main menu");
System.out.println("");
System.out.println("1=AC \t2=Non AC \t3=Sleeper \n4=IRTC \t5 cancel booking \t6=view bus ticket \n7=exit ");
System.out.println("");
System.out.print("Enter your choice:");
int n1=s.nextInt();
System.out.println("");
switch(n1)
{
case 1:
ss.ds();
break;
case 2:
ss.ds();
break;
case 3:
ss.ds();
break;
case 4:
ss.ds();
break;
case 5:
if(ss.arr[0]==0)
{
System.out.println("No seats for cancellation."); 
}
else
{
 System.out.println("Your one seat is cancelled."); 
System.out.println();
System.out.println("Date:"+dd.format(date));
int removeIndex=0;
 for( ss.i = removeIndex; ss.i < ss.arr.length -1; ss.i++)
{
ss.arr[ss.i]=ss.arr[ss.i+1];
}
System.out.println("Your available seat numbers are:");
for(ss.i=0;ss.i<ss.n;ss.i++)
{
System.out.println(ss.arr[ss.i]);
}
Random rand=new Random();
int rand_int1=rand.nextInt(200);
System.out.println("Your cancelation carges is:"+rand_int1);
}
break;
case 6:
System.out.println("\n");
System.out.println("Bus Ticket");
System.out.println();
System.out.println("Date:"+dd.format(date));
System.out.print("Name: "+n89);
System.out.print("\tAge: "+a);
System.out.println("\n");
System.out.print("Pickup point: "+ f);
System.out.print("\tDrop point: "+t);
System.out.println("\n");
System.out.println("Your seat numbers are:");
for(ss.i=0;ss.i<ss.n;ss.i++)
{
System.out.println(ss.arr[ss.i]);
}
if(ss.arr[0]==0)
{
System.out.print("Please book a seat and proceed it.");
}
else
{
Random rand1=new Random();
int rand_int1=rand1.nextInt(5000);
System.out.print("Your total payment is:"+rand_int1);
}
System.out.print("\n");
break;
case 7:
System.exit(0);
break;
default:
System.out.println("\nEnter a wright choice:");
}
}while(true);
}
}
class sub
{
public static final DateFormat dd=new SimpleDateFormat("yyyy/MM/dd hh/mm/ss");
Date date=new Date();
void display()
{
Scanner s=new Scanner(System.in);
System.out.println("");
System.out.println("Please choose your payment methode");
System.out.println("");
System.out.println("1=Online\t2=Offline");
System.out.print("Enter your choice:");
int o=s.nextInt();
System.out.println();
switch(o)
{
case 1:
System.out.println("\nEnter your bhim upi id or debit card number:");
String n1=s.next();
Random rand=new Random();
int rand_int1=rand.nextInt(10000);
System.out.println("\nYour otp is:"+rand_int1);
System.out.println("\nEnter your otp:");
int n3 = s.nextInt();
if(n3==rand_int1)
{
System.out.println("\nYour payment is successful");
System.out.println("Date:"+dd.format(date));
}
else
{
System.out.println("\nYou entered a wrong otp");
}
break;
case 2:
System.out.println("Your payment is taken after a ride");
break;
default:
System.out.println("\nwrong choice");
}
}
}