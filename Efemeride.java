

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abel
 */
import java.io.Serializable;

public class Efemeride implements Serializable{
    
String efem;
int dia,mes;

public Efemeride(int mes, int dia,String efem){
this.mes=mes;
this.dia=dia;
this.efem=efem;}

public Object clone(){return  new Efemeride(mes,dia,efem);}

}
