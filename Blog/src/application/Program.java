package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow thats awesome !");
		SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		Date moment = new Date();
		System.out.println("Enter with the post title: ");
		String title = sc.nextLine();
		System.out.print("Content: ");
		String content = sc.nextLine();
		System.out.println("Likes");
		int likes = sc.nextInt();
				
				
		Post p1 = new Post(moment, title, content, likes);
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		System.out.println(p1);
		
		sc.close();
	}

}
