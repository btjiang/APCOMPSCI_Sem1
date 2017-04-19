import java.util.ArrayList;
public class Satellite2
{
	
   public static void main(String[]args)
   {
       ArrayList<Location2> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda2(honLoc));
       locate.add(new Toyota2("8, 9"));
       locate.add(new GMC2(3, 8));

        double[] home = {0, 0};

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

        for (Location2 l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Location2 l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }
	    printout += "\n\n" + "==========================";
		for (Location2 l : locate)
		{
			double xMove = Math.round((1+ (Math.random()*100))*100.00)/100.00;
			double yMove = Math.round((1+ (Math.random()*100))*100.00)/100.00;
			printout += "\nAfter " + l.getID() + " Moved (" + xMove + "," + yMove +")";
			((Car)l).move(xMove, 2*yMove);
			printout += "\nNew Location: (" + getLocation(l.getLoc()) + ")\n";
		}
      

  	  //for (Location l : locate)
       //{
           //printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       //}

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Location2 l : locate)
		{
           printout += "\n\tDistance for " + l.getID() + ": (" + Math.round((getDistance(l.getLoc(), home)*100.00)/100.00) + ")";
        }

        System.out.println(printout);
   }

    public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

    public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}
