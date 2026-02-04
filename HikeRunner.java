/*
 * Activity 2.2.5
 */
public class HikeRunner
{
  public static void main(String[] args)
  {
    Hike hike1 = new Hike("Sharp Top", 3.3, 1253);
    System.out.println(hike1);
    Hike hike2 = new Hike("Apple Orchard", 2.6, 1003);
    System.out.println(hike2);
    System.out.println("First hike longer? " + hike1.isLongerThan(hike2));
    Hike hike3 = new Hike("Mountain Hill", 3.2, 1000);
    Hike hike4 = new Hike("Red Road", 4.4, 1580);
    System.out.println("Name: " + hike4.getName() + "Length: " + hike4.getMiles() + "Elevation: " + hike4.getElevation());
    System.out.println("First hike more challenging than second? " + hike1.getChallenging(hike2));
  }
}