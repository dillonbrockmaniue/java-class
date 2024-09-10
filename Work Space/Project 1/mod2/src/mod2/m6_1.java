package mod2;


		//1.1
public class m6_1 {
	public static void main(String[] args) {
		// Display welcome to java!
		System.out.println("Welcome to Java");
		System.out.println("Welcome to computer science, programming is fun.");
		System.out.println("");
		
		//1.2
		
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		      
		System.out.println("");
		
		// 1.3
		
		// writing JAVA in a pattern 
		
		System.out.println("        J     A   V     V   A");
		System.out.println("        J    A A   V   V   A A");
		System.out.println("    J   J   AAAAA   V V   AAAAA");
		System.out.println("     J J   A     A   V   A     A");
		
		// writing in a table 
	
		
		
		System.out.println();
		System.out.println(" a a^2 a^3");
		System.out.println(" 1  1  1");
		System.out.println(" 2  4   8");
		System.out.println(" 3  9   27");
		System.out.println(" 4  16  64");
		
		System.out.println();
		
		//1.4
		
		// Displaying a table of powers using formatted output
        System.out.printf("%-2s  %-4s  %-4s%n", "a", "a^2", "a^3");
        System.out.printf("%-2d  %-4d  %-4d%n", 1, 1, 1);
        System.out.printf("%-2d  %-4d  %-4d%n", 2, 4, 8);
        System.out.printf("%-2d  %-4d  %-4d%n", 3, 9, 27);
        System.out.printf("%-2d  %-4d  %-4d%n", 4, 16, 64);

        System.out.println();
        
		// 1.5
        
        //ComputeExpression 
		
		System.out.print("(9.5 * 4.5 -) / (2.5*3)=");
		System.out.println("(10.5 + 2 * 3) / (45 – 3.5)");
		        // Calculating the first expression: 9.5 * 4.5 - 2.5 * 3
		        double result1 = 9.5 * 4.5 - 2.5 * 3;
		        
		        // Calculating the second expression: 45.5 - 3.5
		        double result2 = 45.5 - 3.5;
		        
		        // Displaying the results
		        System.out.println("Result of 9.5 * 4.5 - 2.5 * 3 is: " + result1);
		        System.out.println("Result of 45.5 - 3.5 is: " + result2);
		        
		        
		        
		    //  1.6
		                // Initialize the sum variable
		                int sum = 0;

		                // Calculate the summation of the series from 1 to 9
		                for (int i = 1; i <= 9; i++) {
		                    sum += i;}
		                
		                
		                // Display the result
		                System.out.println("The sum of the series 1 + 2 + 3 + ... + 9 is: " + sum);
		                		
		                // value of pi
		                        double approximation = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9);

		                     
		  // 1.7 Use the built-in constant for the actual value of pi
		                        double pi = Math.PI;

		                        // Display the approximate and actual value of pi
		                        System.out.println("The approximate value of pi is: " + approximation);
		                        System.out.println("The actual value of pi is: " + pi);
		                        
		// 1.8 
		                        
		                        //Radius
		                        	
		                                double radius = 5.5;
		                                double perimeter = 2 * radius * Math.PI;
		                                double area = radius * radius * Math.PI;
		                               
		                                // Display the results
		                                System.out.println("Radius: " + radius);
		                                System.out.println("Perimeter (Circumference): " + perimeter);
		                                System.out.println("Area: " + area);
		               
	   // 1.9
		                        //RectangleCalculator
		                               
		                                    // Define width and height of the rectangle
		                                    double width = 4.5 * Math.PI;
		                                    double height = 7.9 * Math.PI;
		                                    
		                                    // Calculate the area of the rectangle
		                                    double area1 = width * height;
		                                    
		                                    // Calculate the parameter of the rectangle
		                                    double perimeter1 = 2 * (width + height);
		                                    
		                                    // Display the results
		                                    System.out.println("Width: " + width);
		                                    System.out.println("Height: " + height);
		                                    System.out.println("Area: " + area1);
		                                    System.out.println("Perimeter: " + perimeter1);
		                                }
		                            }


		                	
		                	
	
