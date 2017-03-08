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
public class DunkleRöstung extends Getränk{

    public DunkleRöstung(String beschreib) {
        super(beschreib);
    }
    
    public double preis()
    {
     return 1.89;
    }
    
}
