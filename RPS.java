import java.util.*;


public class RPS {

	public static void main(String args[]) {
		System.out.println("Type in 'r' for rock, 's' for scissors, 'p' for paper ");
		
		Scanner userinput = new Scanner(System.in);
		String rps = userinput.next();
		
		yourchoice(rps);
		//System.out.println(rps);
		System.out.println("The computer chooses... ");
		
		String yourPICK = rps;
		
		
		int comeback = compchoice();
		//System.out.println(comeback);
		String compPICK = Integer.toString(comeback); 
		//the conversion from the returned int from compchoice() means now 'yourPICK' and 'compPICK' can now both be passed for cases
		System.out.println(compPICK);
		
		
		caseEvaluation(yourPICK, compPICK);
		
	}
	
	public static String yourchoice(String rps) {
		//switch case to evaluate the string you put in, states your choice 
		//returns rps to be used as a value later
		switch(rps) {
		
			case "r":
				System.out.println("you chose rock ");
				break;
			case "p":
				System.out.println("you chose paper ");
				break;
			case "s":
				System.out.println("you chose scissors ");
				break;
			default:
				System.out.println("not one of r p s ");
				
		}
		
		return "rps";
	}
	
	public static int compchoice() {
		//switch case to evaluate the computers randomized choice, no input so its auto generated
		//0,1,2 from randomizer correlates to r, p, s       sends back to main the 0,1,2 for comparison later
		Random rand = new Random();
		int newnum = rand.nextInt(2);
		
		switch(newnum) {
			case 0:
				System.out.println("comp chose rock ");
				break;
			case 1:
				System.out.println("comp chose paper ");
				break;
			case 2:
				System.out.println("comp chose scissors ");
				break;
			default:
				System.out.println("none");
		
		}
		
		
		return newnum;
	}
	
	public static String caseEvaluation(String a, String b) {
		System.out.println(a + b); //see if everything came through
		
		//evaluates your choice 'a', then another evaluation on the comp choice 'b'
			switch(a) {
			
			
				//you as rock
			case "r":
				switch(b) {
					case "0":
						System.out.println("both chose rock");
						break;
					case "1":
						System.out.println("you chose rock, comp chose paper, COMP WINS");
						break;
					case "2":
						System.out.println("you chose rock, comp chose scissors, YOU WIN");
						break;
					default:
						System.out.println("none");
				}
				break;
				
				//you as paper
			case "p":
				switch(b) {
					case "0":
						System.out.println("you chose paper, comp chose rock, YOU WIN");
						break;
					case "1":
						System.out.println("both chose paper");
						break;
					case "2":
						System.out.println("you chose paper, comp chose scissors, COMP WINS");
						break;
					default:
						System.out.println("none");
				}
				break;
				
				//you as scissors
			case "s":
				switch(b) {
					case "0":
						System.out.println("you chose scissors, comp chose rock, COMP WINS");
						break;
					case "1":
						System.out.println("both chose scissors, comp chose paper, YOU WIN");
						break;
					case "2":
						System.out.println("both chose scissors");
						break;
					default:
						System.out.println("none");
				}
				break;
		
		
		
		
		
		
		
	}
			return "a";
	
}}
