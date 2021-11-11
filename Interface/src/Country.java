public class Country implements Measurable
{
   private String name;
   private double area;

   /**
      Construct a country with name and area.
      @param name country's name
      @param area total area of country
   */
   public Country(String names, double areas)
   {
      name = names;
      area = areas;
   }

   /**
      Measurable interface method to retrieve measure.
      @return the measured area
   */
   public double getMeasure()
   {
      return area;
   }
}