/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwebservice;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class ClientWebService {

    /**
     * @param args the command line arguments
     * http://localhost:8080/DGIP/CalculoSueldo?WSDL
     */
    public static void main(String[] args) {
        
        DecimalFormat decimal1 = new DecimalFormat("#.00");
        
        double sueldohora = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor por hora:"));
        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas trabajadas el Lunes:"));
        int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas trabajadas el Martes:"));
        int dia3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas trabajadas el Miércoles:"));
        int dia4 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas trabajadas el Jueves:"));
        int dia5 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas trabajadas el Viernes:"));
        int dia6 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas trabajadas el Sábado:"));
        int dia7 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas trabajadas el Domingo:"));
        int con = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si quiere conocer el total de horas trabajas en la semana o \n"
                + "digite 2 si quiere conocer el sueldo a pagar"));
        
        int result1 = dia1 + dia2 + dia3 +dia4 +dia5 + dia6 + dia7;
        double result2 = (dia1 + dia2 + dia3 +dia4 +dia5 + dia6 + dia7)*sueldohora;
        
        if(con == 1){
            
            JOptionPane.showMessageDialog(null, "EL TOTAL DE HORAS TRABAJADAS ES DE: " + String.valueOf(result1));
        }else if(con ==2){
            JOptionPane.showMessageDialog(null, "EL SUELDO A PAGAR POR LAS HORAS TRABAJADAS ES DE: " + String.valueOf(decimal1.format(result2)));
        }
        
       
    }
    
    private static double CalculoSueldo(double sueldohora, int dia1, int dia2, int dia3, int dia4, int dia5, int dia6, int dia7, int con){
        ws.CalculoSueldo_Service service = new ws.CalculoSueldo_Service();
        ws.CalculoSueldo port = service.getCalculoSueldoPort();
        
        return port.sueldoCalculado(sueldohora, dia1, dia2, dia3, dia4, dia5, dia6, dia7, con);
        
    
    }
    
}
