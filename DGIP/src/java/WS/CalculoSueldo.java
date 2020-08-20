/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Aaron
 */
@WebService(serviceName = "CalculoSueldo")
public class CalculoSueldo {

 
    @WebMethod(operationName = "SueldoCalculado")
    public double SueldoCalculado(@WebParam(name = "sueldohora") double sueldohora, @WebParam(name = "dia1") int dia1, @WebParam(name = "dia2") int dia2, @WebParam(name = "dia3") int dia3, @WebParam(name = "dia4") int dia4, @WebParam(name = "dia5") int dia5, @WebParam(name = "dia6") int dia6, @WebParam(name = "dia7") int dia7, @WebParam(name = "con") int con) {
        double result = 0;
        switch(con){
            case 1: {
                result = dia1+dia2+dia3+dia4+dia5+dia6+dia7;
            }break;
            case 2: {
                result = (dia1+dia2+dia3+dia4+dia5+dia6+dia7)*sueldohora;
            }break;
            default:{
            }break;
            
        }
        return result;
    }
}
