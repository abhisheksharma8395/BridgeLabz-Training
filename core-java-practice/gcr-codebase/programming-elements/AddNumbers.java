import java.util.Scanner;
class AddNumbers{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
      
    //Taking Input for first number
	System.out.println("Enter First Number : ");
	int num1 = sc.nextInt();

	//Taking Input for first number
	System.out.println("Enter Second Number : ");
	int num2 = sc.nextInt();
		
	//Calculating results
	int total = num1 + num2;
    // Variable c is holding the addition total of
	System.out.println("Addition of "+num1+" And "+num2+" is : "+total);
    }
}