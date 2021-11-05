package main;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {
	public static void main (String[] args) {
		Javalin webServer = Javalin.create (configuration -> {
			configuration.addStaticFiles ("/", Location.CLASSPATH);
		}).start (80);
		
		webServer.post ("/add", context -> {
			String parameter1 = context.formParam ("number1").trim ();
			String parameter2 = context.formParam ("number2").trim ();
			
			if (parameter1.isEmpty () || parameter2.isEmpty ()) {
				context.result ("Invalid input!");
				
				return;
			}
			
			float number1 = Float.parseFloat (parameter1);
			float number2 = Float.parseFloat (parameter2);
			
			context.result (String.valueOf (number1 + number2));
		});
		
		webServer.post ("/subtract", context -> {
			String parameter1 = context.formParam ("number1").trim ();
			String parameter2 = context.formParam ("number2").trim ();
			
			if (parameter1.isEmpty () || parameter2.isEmpty ()) {
				context.result ("Invalid input!");
				
				return;
			}
			
			float number1 = Float.parseFloat (parameter1);
			float number2 = Float.parseFloat (parameter2);
			
			context.result (String.valueOf (number1 - number2));
		});
		
		webServer.post ("/multiply", context -> {
			String parameter1 = context.formParam ("number1").trim ();
			String parameter2 = context.formParam ("number2").trim ();
			
			if (parameter1.isEmpty () || parameter2.isEmpty ()) {
				context.result ("Invalid input!");
				
				return;
			}
			
			float number1 = Float.parseFloat (parameter1);
			float number2 = Float.parseFloat (parameter2);
			
			context.result (String.valueOf (number1 * number2));
		});
		
		webServer.post ("/divide", context -> {
			String parameter1 = context.formParam ("number1").trim ();
			String parameter2 = context.formParam ("number2").trim ();
			
			if (parameter1.isEmpty () || parameter2.isEmpty ()) {
				context.result ("Invalid input!");
				
				return;
			}
			
			float number1 = Float.parseFloat (parameter1);
			float number2 = Float.parseFloat (parameter2);
			
			context.result (String.valueOf (number1 / number2));
		});
	}
}
