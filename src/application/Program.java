package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.parse("22/05/2005", fmt1), 3000.00, obj);
		
		System.out.println(seller);
		
	}

}