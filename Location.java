/*
 * Activity 2.2.5
 *
 * A Location class representing a place (e.g., where a hike is located).
 */
public class Location
{
  private String locality;

  /**
   * Constructs a Location with a null string for locality.
   *
   * <p>Postcondition: getLocality() returns null.
   */
  public Location()
  {
    this.locality = null;
  }

  /**
   * Constructs a Location with the given locality.
   *
   * @param locality the locality (e.g., town or area name); may be null
   *
   * <p>Postcondition: getLocality() returns the given locality.
   */
  public Location(String locality)
  {
    this.locality = locality;
  }

  /**
   * Gets the locality of this location.
   *
   * @return the locality, or null if not set
   */
  public String getLocality()
  {
    return locality;
  }

  /**
   * Sets the locality of this location.
   *
   * @param locality the new locality; may be null
   *
   * <p>Postcondition: getLocality() returns the given locality.
   */
  public void setLocality(String locality)
  {
    this.locality = locality;
  }
}
