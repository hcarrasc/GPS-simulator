/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author hcarrasc
 */
public class Punto {
    public int x;
    public int y;
    public int idpunto;
    
    Punto psiguiente;
    Punto panterior;
    
    public Punto(){
        this.idpunto = 1;
        this.x = 0;
        this.y = 0;
    }
}
