/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

/**
 *
 * @author ardise
 */
public class Milch extends ZutatDekorator {
    
    public Milch(String beschreib,Getränk getränk)
    {
     super(beschreib,getränk);
     
    }

    @Override
 public double preis()
 {
  return getGetränk().preis()+0.10;
 }
 
    @Override
 String getBeschreibung()
 {
  return beschreibung;
 }
    
}
