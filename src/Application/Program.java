package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");

		Post p1 = new Post(sdf.parse("21/06/2022 13:05:10"), "Traveling to New Zealand",
				"I'm going to the visit this wonderful contry!", 2);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1.toString());
	}

}
