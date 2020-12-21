import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String name,colour;
		char brand,product;
		double total;
		int phone_num;
		int quantity,gucci=100,coach=280,louisvouitton=500;
		System.out.print("Enter your name : ");
		name= sc.next();
		System.out.print("Enter your number phone : ");
		phone_num= sc.nextInt();
		System.out.print("Enter the product did you want to buy (Enter 'H' for handbag) : ");
		product= sc.next().charAt(0);
		if (product=='H') {
			System.out.print("Please enter 'G' for gucci or 'C' for coach or 'L' for louis vouitton : ");
			brand= sc.next().charAt(0);
			if (brand=='G') {
				System.out.print("Colour of your handbag : ");
				colour= sc.next();
				System.out.println("Price for each bag is RM 100 ");
				System.out.print("Enter the quantity : ");
				quantity= sc.nextInt();
				total=gucci*quantity;
				System.out.println();
				System.out.println("Your Detail:-");
				System.out.println("Customer name :" + name);
				System.out.println("Customer phone number :0" + phone_num);
				System.out.println("Product that you buy :Handbag ");
				System.out.println("Type of brand :Gucci ");
				System.out.println("Colour of handbag :" + colour);;
				System.out.println("Number of quantity :" + quantity);
				System.out.println("Total that you need to pay :RM " + total);
			}
			else if (brand=='C') {
				System.out.print("Colour of your handbag : ");
				colour= sc.next();
				System.out.println("Price for each bag is RM 280 ");
				System.out.print("Enter the quantity : ");
				quantity= sc.nextInt();
				total=coach*quantity;
				System.out.println();
				System.out.println("Your Detail:-");
				System.out.println("Customer name :" + name);
				System.out.println("Customer phone number :0" + phone_num);
				System.out.println("Product that you buy :Handbag ");
				System.out.println("Type of brand :Coach ");
				System.out.println("Colour of handbag :" + colour);
				System.out.println("Number of quantity :" + quantity);
				System.out.println("Total that you need to pay :RM " + total);
			}
			else if (brand=='L') {
				System.out.print("Colour of your handbag : ");
				colour= sc.next();
				System.out.println("Price for each bag is RM 500 ");
				System.out.print("Enter the quantity : ");
				quantity= sc.nextInt();
				total=louisvouitton*quantity;
				System.out.println();
				System.out.println("Your Detail:-");
				System.out.println("Customer name :" + name);
				System.out.println("Customer phone number :0" + phone_num);
				System.out.println("Product that you buy :Handbag ");
				System.out.println("Type of brand :Louis Vouitton ");
				System.out.println("Colour of handbag :" + colour);
				System.out.println("Number of quantity :" + quantity);
				System.out.println("Total that you need to pay :RM " + total);
			}
			else {
				System.out.println("Invalid code");
			}
		}
		else {
			System.out.println("Invalid code");
		}
	}

}
