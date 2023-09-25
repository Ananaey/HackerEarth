//gets() and puts()
//bubble sort
//as compared to operators what is the precedense of functions like math.sqrt

import java .util.*;
class program
{
public static void main (String args[])
{
Scanner Sc=new Scanner (System.in);

System.out.println("Enter 1 for Calculating Number of years , months and days Using Total days Entered \nEnter 2 for Creating the largest and smallest number using the given digits \nEnter 3 for Calculating Electricity Bill \nEnter 4 for to find the area of an Equilateral , an Isosceles or a Scalene triangle \nEnter 5 to calculate maturity amount of bank deposit \nEnter 6 to check for niven nnumber \nEnter 7 to check for perfect number \nEnter 8 to Calculate the seriest given below \nEnter 9 to print all prime number between 0 and 100 \nEnter 10 to check for special Number " );
System.out.println();
System.out.print("Enter Your Choice : ");

int choice=Sc.nextInt();
System.out.println();
 
switch(choice)
{

case 1:

int years=0,months=0;

System.out.println("Enter Number of Days");
int Days=Sc.nextInt();

years=Days/365;
Days%=365;
months=Days/30;
Days%=30;

System.out.println("Number Of Years : "+years);
System.out.println("Number Of Months : "+months);
System.out.println("Number Of Days : "+Days);
break;

case 2:

System.out.println("Enter A Positive Integer");
int num=Sc.nextInt();

for(int i=0;i<10;i++)
{
//getting the digit in order
	for(int n=num;n!=0;n/=10)
	// printing the digit if it is in number
	if(i==n%10)
	System.out.print(i);
}
/*
int checknum=num;
int count=0;
int index;
while(num!=0)
{
count++;
num/=10;
}
int a[]=new int[count];
for(int i=0;i<count;i++)
{
a[i]=checknum%10;
checknum/=10;
}
for(int i=0;i<count-1;i++)
{
index=i;
for(int j=i+1;j<count;j++)
{
if(a[index]>a[j])
index=j;
}
int less=a[index];
a[index]=a[i];
a[i]=less;
}
System.out.print("The Smallest Number that can form is : ");
for(int i=0;i<count;i++)
System.out.print(a[i]);

System.out.println();

for(int i=count-1;i>=0;i--)
System.out.print(a[i]);
*/
/*
for(int i=0;i<count-1;i++)
{
index=i;
for(int j=i+1;j<count;j++)
{
if(a[index]<a[j])
index=j;
}
int large=a[index];
a[index]=a[i];
a[i]=large;
}
System.out.print("Largest Number That can be made is : ");
for(int i=0;i<count;i++)
System.out.print(a[i]);
*/
break;

case 3:

double amount=0;
System.out.print("Please Enter Your Name : ");
String Str=Sc.nextLine();
System.out.println();
System.out.print("Please Enter Your Phone Number : ");
int number=Sc.nextInt();
System.out.println();
System.out.print("Enter the Units Consumed : ");
int units=Sc.nextInt();
System.out.println();

if(units<=100)
amount=units*5.5;
else if(units>100&&units<=300)
amount=(100*5.5)+(units-100)*6.5;
else if(units>300 && units<=600)
amount=(100*5.5)+(200*6.5)+(units-300)*7.5;
else if (units>600)
amount=(100*5.5)+(200*6.5)+(300*7.5)+(units-600)*8.5;

System.out.println("Money Receipt");
System.out.println("Customer's Name Is : "+Str);
System.out.println("Customer's Phone Number is : "+number);
System.out.println("Units Consumed : "+units);
System.out.println("Amount To Be Paid By the Customer is : "+ amount);
break;

case 4:

System.out.println("Enter 1 for Calculating Area of Equilateral Traingle \nEnter 2 for Calculating Area Of Isosceles Traingle \nEnter 3 for calculating Area Of Scalene Triangle ");
int choicetraingle=Sc.nextInt();

switch(choicetraingle)

{

case 1:

System.out.println("Enter The Length Of Any One Side");
int side = Sc.nextInt();
System.out.println("Area Of the equilateral triangle : "+Math.sqrt(3.0/4.0)*Math.pow(side,2));
break;

case 2:

System.out.println("Enter The length of the side of the triangle which are equal");
int equalside=Sc.nextInt();
System.out.println("Enter the side of the traingle that's unequal");
int unequalside=Sc.nextInt();
System.out.println("Area of Isosceles Traingle : "+1.0/4*Math.sqrt(4*Math.pow(equalside,2)-Math.pow(unequalside,2)));
break;

case 3:

System.out.println("Enter The Lengths Of Three sides of traingle");
int side1=Sc.nextInt();
int side2=Sc.nextInt();
int side3=Sc.nextInt();
float s=(side1+side2+side3)/2;
System.out.println("Area Of scalene triangle : "+ Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
break;

}

case 5:

System.out.println("Enter 1 for Term deposit \nEnter 2 for Recurring Deposit");
int choicedeposit=Sc.nextInt();

switch(choicedeposit)
{
case 1:

System.out.println("Enter the Principal Amount : ");
int principal=Sc.nextInt();

System.out.println("Enter the Rate Of Interest : ");
int rateinterest=Sc.nextInt();

System.out.println("Enter The amount of Years");
int time =Sc.nextInt();

double matureamount=principal*Math.pow(1+rateinterest/100,time);

System.out.println("The Amount at maturity is : "+matureamount);
break;

case 2:

System.out.println("Enter Monthly installment : ");
int installment =Sc.nextInt();

System.out.println("Enter rate of Interest : ");
int interestrate=Sc.nextInt();

System.out.println("Enter the time period in number of Months : ");
int monthstime =Sc.nextInt();

double A=installment*monthstime+installment*((monthstime*(monthstime+1))/2)*interestrate/100*1/12;
System.out.println("The Amount At maturity is : "+A);
break;

default:
System.out.println("Invalid Choice");
break;
}

case 6:

System.out.println("Enter a Number ");
int checkknum=Sc.nextInt();
int numcheck=checkknum;
int keep=0;
while(checkknum!=0)
{
keep+=checkknum%10;
checkknum/=10;
}

if(numcheck%keep==0)
System.out.println("Entered Number is NIVEN NUMBER");
else
System.out.println("Number Entered is Not Niven");
break;

case 7:

System.out.println("Enter a Number To Check if it is Perfect Number");
int num7=Sc.nextInt();
int sum=0;
for(int i=1;i<num7;i++)
{
if(num7%i==0)
sum+=i;
}
if(sum==num7)
System.out.println("Number Entered is a Perfect Number");

break;

case 8:

System.out.println("Enter the number of Series");
int numseries=Sc.nextInt();
double sum8=1; double mult=1;
for(int i=2;i<=numseries;i++)
{
for(int j=1;j<=i;j++)
{
mult*=j;
}
if(i%2==0)
sum8+=1/mult;
else 
sum8-=1/mult;
}
System.out.println("Sum Of Series is : "+sum8);
break;

case 9:
System.out.println("The Seriest of prime numbers are : ");
int count9=0;
for(int i=1;i<=100;i++)
{
for(int j=1;j<=i;j++)
{
if (i%j==0)
count9++;
}
if (count9==2)
System.out.println(i);
}
break;

case 10:

System.out.println("Enter a number ");
int num10=Sc.nextInt();
int keep10=num10;
int count10=0,mult10=1;
while(num10!=0)
{
int digit=num10%10;
for(int i=1;i<=digit;i++)
{
mult10*=i;
}
count10+=mult10;
num10/=10;
mult10=1;
}
if(count10==keep10)
System.out.println("Number Entered is A Special Number");
else 
System.out.println("Number Entered is Not a Special Number");
break;

default:
System.out.println("Invalid choice");
break;


}
}
}

