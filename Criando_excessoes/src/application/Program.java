package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println("Room number");
			int roomNumber = sc.nextInt();
			System.out.println("Check-in");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out");
			Date checkOut = sdf.parse(sc.next());
	
		
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
	
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.println("Check-In Date: (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-Out Date: (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());
	
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
		}
		
		catch (ParseException e){
			System.out.println("Invalid Date Format");
		}
		
		catch(DomainExceptions e) {
			System.out.println("Error in reservation, " + e.getMessage());
		}
	}
}
	


