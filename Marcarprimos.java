
package Metodos;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


/**
 *
 * @author Alvaro
 */
public class Marcarprimos extends DefaultTableCellRenderer{
        
        
//Primero se debe sobreescribir un metodo de esta clase y el metodo es:
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, 
                boolean Selected, boolean hasFocus, int row, int col){
            
            
                       
            if(value instanceof Integer){
                int valor =(int)value; //dividendo
                int divisor=0;
                int resultado=0; 
                do{
                for(int i=0; i<1;i++){
                    divisor=((int)(Math.random()*(valor-1+1)+1));
                   
                    }resultado = valor/divisor;  
                }while(valor%divisor!=0);
                
                
                if(valor%2==0 || valor%3==0 || valor%5==0 || valor%7==0 || valor%9==0 
                        || valor%11==0 || valor%13==0 || valor%15==0 || valor%17==0 
                        || valor%19==0 || valor%21==0 || valor%23==0 || valor%25==0 
                        || valor%27==0 || valor%29==0 || valor%31==0 || valor%33==0){
                           setBackground(Color.white);
                        }else{
                                setBackground(Color.red);
                                }
                    
                if(valor==1 || valor==2 || valor==3 || valor==5 || valor==7){
                            setBackground(Color.red);
                    
                            }
                
                
                
                
                
            }
            
            
            //Definimos las caracteristicas de nuestras celdes y para acceder el  metodo getTableCellRendererComponent se debe utilizar la palabra super y pasamos los parametros de arriba
            super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
            
            
            
            
            return this;
        }
        
        
  
}

