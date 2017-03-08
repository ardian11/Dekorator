
package dekorator;


public abstract class Getränk {
    String beschreibung;
    public Getränk(String beschreib)
    {
      beschreibung = beschreib;
    }
    
    private String getBeschreibung()
    {
      return beschreibung;
    }
    
    public abstract double preis();
    
    
    
    
}
