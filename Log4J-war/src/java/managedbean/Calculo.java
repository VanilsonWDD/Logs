/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.apache.log4j.Logger;

/**
 *
 * @author Vanilson
 */
@ManagedBean
@RequestScoped
public class Calculo {
    private Logger logger = Logger.getLogger(Calculo.class);
    /**
     * Creates a new instance of Calculo
     */
    public Calculo() {
    }
    
    public int soma(){
        int soma = 0;
         try{
            soma = 10 + Integer.parseInt("numero");
         }
         catch(Exception e){
             logger.error("Erro ao somar número: " + e);
         }
         return soma;
    }
}
