package aula04javahoradosistema;

import java.awt.Dimension;
import java.util.Date;
import java.util.Locale;

public class Aula04JavaHoraDoSistema {

    public static void main(String[] args) {

        Date data = new Date(); //objeto data da classe Date
        System.out.println("A data e hora do sistema é:" + data.toString()); //método toString converte data para string
        
        Locale loc = Locale.getDefault();  //classe locale
        System.out.print ("A língua do seu sistema é: " + loc.getDisplayLanguage()); //metodo getDisplayLanguage mostra "Português" 
        System.out.println ("  " + loc.getLanguage()); // metodo getLanguage imprime "pt"
        
       
       
 
    }

    private static Toolkit Toolkit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
