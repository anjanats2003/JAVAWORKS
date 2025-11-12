package java_study;
import java .util.*;

public class Day2_classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_Of_Books=3;
		int Price_Per_Book=275;
		int Discount_Percent=10;
		double total_amount = (double) (number_Of_Books * Price_Per_Book);
		double discount_amount = (double) Discount_Percent / 100;
		double final_bill = total_amount - (total_amount * discount_amount);
		System.out.println("Number Of Books: "+number_Of_Books);
		System.out.println("Price per book : "+Price_Per_Book);
		System.out.println("Total Amount : "+total_amount);
		System.out.println("final bill : "+final_bill);
	}

}
