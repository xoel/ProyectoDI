/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import java.awt.TextField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class InputValidation {
    public static boolean inputsAreValidServicio(JTextField tfNombreServicio, JTextField tfImporte){
       boolean valid;
       if(tfNombreServicio.getText().isEmpty() || tfImporte.getText().isEmpty()){
           valid=false;
       }else{
           Pattern r = Pattern.compile("[0-9]+(.[0-9]+)?");
           Matcher m = r.matcher(tfImporte.getText());
           valid=m.matches();
       }
       return valid;
    }
    public static boolean inputsAreValidCategoria(JTextField tfNombreServicio){
       boolean valid=true;
       if(tfNombreServicio.getText().isEmpty()){
           valid=false;
       }
       return valid;
    }
}
