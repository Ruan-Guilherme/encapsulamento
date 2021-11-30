/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author IFSC
 */
public class Agenda {
    
    int dia;
    int mes;
    String anotacao;
    
    void anote(int d,int m, String nota){
        dia = d;
        mes = m;
        anotacao = nota;
        validaData();
        
        
    }
    void validaData(){
        if ((dia < 1)||(dia > 31)||(mes < 1)||(mes>12)){
            dia = 0;
            mes = 0;
            anotacao ="anotação não incerida "
                    + "deviado a data invalida";
        }
        
        
        
    }
            void mostraAnotacao(){
                System.out.println(dia+"/"+mes+" :"+anotacao);
    }
    
    
    
}
