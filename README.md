# 2019_DEV_017

This is Code to find Leap year Just enter any year you want to and then it will tell  whether it is leap year or not.

**Environment and Sdk Requirement**
You will need jdk installed on your system or Intellij sdk, any one of them to run the programme.

**Getting Project**
Once you Downloaded the source code import it into intellij if it is installed in and then project will build in few minute.

**Run the project**
Once the project is build,open the main file in Intellij by oenign folder Leap Year --> src--> Main
then cilck ctrl+shift+F10 to run Main, you will find the console at bottom,enter any year you want then it will show the result.
I have attached screenshots for the same.
If you don't have the Intellij installed in your system then you will need jdk installed to run the code then navigate to path of main file on production folder in cmd and then enter here I have path as  
D:\Users\gsawant\Downloads\Leapyear\out\production\LeapYear> java Main then press enter it will ask to entrr the year.

**Code Description**
I have used scanner class here since it is the easiest way to read input in a Java program.
it's a class in java.util package used for obtaining the input of the primitive types like int, double etc. and strings.
To read strings, nextLine() is used.
so in code year = sc.nextInt();
as per the given criteria conditons are added in the code to check whether the year is leap year ot not.
i.e. All years divisible by 400 ARE leap years, 
All years divisible by 100 but not by 400 are NOT leap years ,
All years divisible by 4 but not by 100 ARE leap years and
All years not divisible by 4 are NOT leap years.
result is printed.







