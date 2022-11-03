/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_2_app.formulas;

//@author Your Name <Rodrigo Pereyra>
public class F_radio {

    public Double radio, area, perimetro;

    public Double formulaArea() {
        this.area = Math.PI * this.radio * this.radio;
        return null;

    }
    
    public Double perimetro(){
        this.perimetro = 2*Math.PI*this.radio;
        return null;
        
    }
}
