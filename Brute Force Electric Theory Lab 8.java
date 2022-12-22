import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class bruteForce {

    public static void main(String[] args) {
	    List<Double> capacitors = new ArrayList<Double>();
		capacitors.add(.00000000033);
		capacitors.add(0.000000001);
		capacitors.add(0.000000005);
		capacitors.add(0.00000001);
		capacitors.add(0.000000039);
		capacitors.add(0.0000001);
		capacitors.add(0.0000047);
		capacitors.add(0.000001);
		capacitors.add(0.00001);
		List<Double> resistors = new ArrayList<Double>();
		resistors.add(100.0);
		resistors.add(1000.0);
		resistors.add(2000.0);
		resistors.add(2200.0);
		resistors.add(3300.0);
		resistors.add(5100.0);
		resistors.add(10000.0);
		resistors.add(100000.0);
		resistors.add(360000.0);
		resistors.add(470000.0);
	    System.out.println("w0 = 6283.18530718");
	    System.out.println("Q = .5");
		int i = 0;
		for (double c1 : capacitors){
			for (double c2 : capacitors){
				for (double r1 : resistors){
					for (double r2 : resistors){
						double w0 = sqrt(1/(r1*r2*c1*c2));
						double Q = sqrt((c1/c2)*(((r1*r2)/(r1+r2))/(r1+r2)));
						i++;
						if (Q < .6 && Q > .4 && w0 > 6000 && w0 < 6600){
							System.out.println("c1: " + c1 + " c2: " + c2 + " r1: " + r1 + " r2 " + r2 + " w0 " + w0 + " Q: " + Q);
						}
					}
				}
			}
		}
	    System.out.println("Q = .25");
	    for (double c1 : capacitors){
		    for (double c2 : capacitors){
			    for (double r1 : resistors){
				    for (double r2 : resistors){
					    double w0 = sqrt(1/(r1*r2*c1*c2));
					    double Q = sqrt((c1/c2)*(((r1*r2)/(r1+r2))/(r1+r2)));
					    i++;
					    if (Q < .3 && Q > .2 && w0 > 6000 && w0 < 6600){
						    System.out.println("c1: " + c1 + " c2: " + c2 + " r1: " + r1 + " r2 " + r2 + " w0 " + w0 + " Q: " + Q);
					    }
				    }
			    }
		    }
	    }
	    System.out.println("Q = .1");
	    for (double c1 : capacitors){
		    for (double c2 : capacitors){
			    for (double r1 : resistors){
				    for (double r2 : resistors){
					    double w0 = sqrt(1/(r1*r2*c1*c2));
					    double Q = sqrt((c1/c2)*(((r1*r2)/(r1+r2))/(r1+r2)));
					    i++;
					    if (Q < .15 && Q > .09 && w0 > 6000 && w0 < 6600){
						    System.out.println("c1: " + c1 + " c2: " + c2 + " r1: " + r1 + " r2 " + r2 + " w0 " + w0 + " Q: " + Q);
					    }
				    }
			    }
		    }
	    }
	    System.out.println("Q = 1");
	    for (double c1 : capacitors){
		    for (double c2 : capacitors){
			    for (double r1 : resistors){
				    for (double r2 : resistors){
					    double w0 = sqrt(1/(r1*r2*c1*c2));
					    double Q = sqrt((c1/c2)*(((r1*r2)/(r1+r2))/(r1+r2)));
					    i++;
					    if (Q < 1.2 && Q > .7 && w0 > 6000 && w0 < 6600){
						    System.out.println("c1: " + c1 + " c2: " + c2 + " r1: " + r1 + " r2 " + r2 + " w0 " + w0 + " Q: " + Q);
					    }
				    }
			    }
		    }
	    }

	    System.out.println("Q = 2.5");
	    for (double c1 : capacitors){
		    for (double c2 : capacitors){
			    for (double r1 : resistors){
				    for (double r2 : resistors){
					    double w0 = sqrt(1/(r1*r2*c1*c2));
					    double Q = sqrt((c1/c2)*(((r1*r2)/(r1+r2))/(r1+r2)));
					    i++;
					    if (Q < 3.0 && Q > 2.0 && w0 > 6000 && w0 < 6600){
						    System.out.println("c1: " + c1 + " c2: " + c2 + " r1: " + r1 + " r2 " + r2 + " w0 " + w0 + " Q: " + Q);
					    }
				    }
			    }
		    }
	    }
	    System.out.println(i);
    }
}
