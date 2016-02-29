/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopharkkatyo;

/**
 *
 * @author Toni
 */
public class Varaus {
    private String varaajanNimi;
    

public Varaus(String varaajanNimi) {
    this.varaajanNimi = varaajanNimi;
    }
public String varauksenTiedot() {
    return this.varaajanNimi;
}
}