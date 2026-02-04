/*
 * Activity 2.2.5
 *
 * A Hike class
 */
public class Hike
{
  private String name;
  private double miles;
  private int elevation;
  private Location location;

  /**
   * Constructs a Hike with the given name, miles, and elevation.
   * The hike's location is set to a new Location with a null string for locality.
   *
   * @param name the name of this hike
   * @param miles the length of this hike in miles
   * @param elevation the elevation gain of the hike in feet
   *
   * <p>Postcondition: getName() returns name, getMiles() returns miles,
   * getElevation() returns elevation, and getLocation().getLocality() is null.
   */
  public Hike(String name, double miles, int elevation)
  {
    this.name = name;
    this.miles = miles;
    this.elevation = elevation;
    this.location = new Location();  // null string for Locality
  }

  /**
   * Gets the name of this hike.
   *
   * @return the name of the hike
   *
   * <p>Postcondition: result is the name set by the constructor or never modified.
   */
  public String getName()
  {
    return name;
  }

  /**
   * Gets the length of this hike in miles.
   *
   * @return the length of the hike in miles
   *
   * <p>Postcondition: result is the miles set by the constructor or never modified.
   */
  public double getMiles()
  {
    return miles;
  }

  /**
   * Gets the elevation gain of this hike.
   *
   * @return the elevation gain in feet
   *
   * <p>Postcondition: result is the elevation (possibly updated by addToElevation).
   */
  public int getElevation()
  {
    return elevation;
  }

  /**
   * Gets the location of this hike.
   *
   * @return the location; never null
   *
   * <p>Postcondition: result is not null.
   */
  public Location getLocation()
  {
    return location;
  }

  /**
   * Returns the absolute difference in elevation gain between this hike and another.
   *
   * @param other the other hike to compare with; must not be null
   * @return the absolute difference in elevation (feet), non-negative
   *
   * <p>Precondition: other is not null.
   * <p>Postcondition: result is |this.elevation - other.elevation|.
   */
  public int elevationDiff(Hike other)
  {
    return Math.abs(this.elevation - other.elevation);
  }

  /**
   * Adds the given amount to this hike's elevation and returns the new elevation.
   *
   * @param amount the amount to add (may be negative)
   * @return the new elevation after adding
   *
   * <p>Postcondition: getElevation() returns the value that was returned.
   */
  public int addToElevation(int amount)
  {
    this.elevation += amount;
    return this.elevation;
  }

  /**
   * Sets the location of this hike to a new Location with the given locality.
   *
   * @param locality the locality string for the location; may be null
   *
   * <p>Postcondition: getLocation().getLocality() equals locality.
   */
  public void setLocation(String locality)
  {
    this.location = new Location(locality);
  }

  /**
   * Determines if this hike is longer than another hike.
   *
   * @param h the hike to compare with; must not be null
   * @return true if this hike is longer (this.miles &gt; h.miles)
   *
   * <p>Precondition: h is not null.
   * <p>Postcondition: result == (this.miles &gt; h.miles).
   */
  public boolean isLongerThan(Hike h)
  {
    if (this.miles > h.miles)
      return true;
    else
      return false;
  }

  /**
   * Determines if this hike has more elevation gain than another.
   *
   * @param h the hike to compare with; must not be null
   * @return true if this hike has more elevation gain
   *
   * <p>Precondition: h is not null.
   * <p>Postcondition: result == (this.elevation &gt; h.elevation).
   */
  public boolean isHigherThan(Hike h)
  {
    if (this.elevation > h.elevation)
      return true;
    else
      return false;
  }

  /**
   * Returns a string representation of this hike.
   *
   * @return a string describing the name, miles, and elevation of the hike
   *
   * <p>Postcondition: result contains the hike's name, miles, and elevation.
   */
  public String toString() 
  {
    return name + " is " + miles + " miles and gains " + elevation + " feet."; 
  }
  /**
   * Constructs a Hike with the given name and zero miles and elevation.
   * Location is set with a null locality.
   *
   * @param name the name of this hike
   *
   * <p>Postcondition: getName() equals name, getMiles() is 0, getElevation() is 0.
   */
  public Hike(String name)
  {
    this(name, 0, 0);
  }

  /**
   * Constructs a Hike with the given name and miles, and zero elevation.
   * Location is set with a null locality.
   *
   * @param name the name of this hike
   * @param miles the length of this hike in miles
   *
   * <p>Postcondition: getElevation() is 0.
   */
  public Hike(String name, double miles)
  {
    this(name, miles, 0);
  }

  /**
   * Determines if the other hike is more challenging than this hike.
   * The other hike is more challenging if it is both longer and higher.
   *
   * @param h the hike to compare with; must not be null
   * @return true if h is longer than this and h has more elevation than this
   *
   * <p>Precondition: h is not null.
   * <p>Postcondition: result == (h.isLongerThan(this) &amp;&amp; h.isHigherThan(this)).
   */
  public boolean getChallenging(Hike h)
  {
    if (h.isLongerThan(this) && h.isHigherThan(this))
      return true;
    else
      return false;
  }
}