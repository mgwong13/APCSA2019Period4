
public class Quadratic {
		public static String quadrDescriber(double a, double b, double c) {
			String description = "";
			
			description += "Description of the Graph: \n";
			 //standard form of the equation
			description+= "y= " + a+"x^2 +"+b+" x + "+c + "\n";
			//orientation/end behavior
			description+= "Opens:"; 
			if (a<0) {
				description+="down";
			}else {
				description+="up";
			}
			 //axis of symmetry 
			description += "\n" + "Axis of Symmetry: " + (-1*b)/(2*a) + "\n";
			//where the graph changes slope (pos to neg or neg to pos)
			description += "Vertex: ("  + (-1*b)/(2*a)+"," + (a*(-b / 2*a)*(-b / 2*a))+ b*(-b / 2*a) + c+") \n"; 
			//where the equation intercepts with the x-axis
			description += "x intercept(s): " + quadForm(a,b,c)+"\n"; 
			//where the equation intercepts with the y-axis
			description += "y intercept :" + c;
			return description; 
		}
			
	
	
	//discriminant
		public static double discriminant(double a, double b, double c) {
			double answer = 0;
			answer = (b*b) - (4*a*c);
			return answer;
		}

	//round2
		public static double round2(double a) {
			a = a*100;
			a= a+0.5;
			a= (int)a;
			a= a/100;
			return a;				
		}

	//square root
		public static double sqrt(double num) {
			if(num<0)throw new IllegalArgumentException("can't square root a negative number");
			double answer = num / 2;
			while((answer*answer) - num >= .005) {
				answer = (.5*((num/answer)+answer));
			}	
		return (round2(answer));
		}	

	//PART 4	
	//Quadratic Formula
		public static String quadForm(double a, double b, double c) {
			String twoRoots = "";
			String oneRoot = "";
			String noRoots = "";
			if(discriminant(a, b, c)>0) {
				twoRoots += ((-1*b)+(sqrt(discriminant(a,b,c))))/(2*a) + " and ";
				twoRoots += ((-1*b)-(sqrt(discriminant(a,b,c))))/(2*a);
				return twoRoots;
			}else if(discriminant(a,b,c)==0) {
				oneRoot +=(-1*b)/(2*a);
				return oneRoot;
			}else if(discriminant(a,b,c)<0) {
				noRoots ="no real roots";
				return noRoots;
			}
			return twoRoots;
			}
		}

