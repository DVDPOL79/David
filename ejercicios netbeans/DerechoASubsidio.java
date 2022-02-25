//Mostrar si una persona tiene derecho a subsidio de transporte teniendo en cuenta que debe ganar menos de 2 salarios minimos 
package derecho.a.subsidio;

import javax.swing.JOptionPane
public class DerechoASubsidio {

    
    public static void main(String[] args) {
         byte salr; // declaramos la variable del salario a ingresar
    //se solicita el salario
    salr = Bite.parseBite(JoptionsPane.showImputDialog(null,"n" + "Digite su Salario", "Clasificacion de salario", 3));
    if (salario<1817052){JoptionsPane.showMessageDialog(null, "Usted si tiene derecho a subsidio de transporte");
    //Si el numero es menor a 2 salarios minimos se imprime que si tiene derecho al subsidio
    //Si no se imprime que no tiene derevho
    else {JoptionsPane.showMessageDialog(null, "Usted si tiene derecho a subsidio de transporte");
    }
    }
    }
    
}
