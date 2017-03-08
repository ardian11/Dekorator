/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;


public abstract class ZutatDekorator extends Getränk {

    private Getränk g;
    
    public ZutatDekorator(String beschreib,Getränk getränk) {
        super(beschreib);
        g= getränk;
    }
    
    public Getränk getGetränk()
    {
     return g;
    }
    
     abstract String getBeschreibung();
    
}
