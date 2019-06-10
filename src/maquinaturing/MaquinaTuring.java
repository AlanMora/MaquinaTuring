package maquinaturing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaquinaTuring {
    public static Scanner teclado = new Scanner(System.in);

    public static void iniciarCinta(String texto) {
        //formando la cinta reemplazando los espacios por □, representa vacio
        String patron = ("(0)|(1)|( )|([^01 ])");
        String tokenA, tokenB, tokenVacio, tokenError, cinta [] = new String [texto.length()+10];
        int pos = 5;    //evita borrar los caraceres vacios de las orillas
      
        for (int i = 0; i < (texto.length()+10); i++) {
            cinta[i] = "□"; //5 caracteres vacios al inicio y final de la cinta
        }
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(texto);
            
        while(matcher.find()) {
            tokenA = matcher.group(1);  //reconociendo caracter valido "a"
            if (tokenA != null) {
                cinta[pos] = "0";
                pos = pos + 1;
            }
            tokenB = matcher.group(2);  //reconociendo caracter valido "b"
            if (tokenB != null) {
                cinta[pos] = "1";
                pos = pos + 1;
            }
            tokenVacio = matcher.group(3);  //reconociendo caracter valido □ vacio
            if (tokenVacio != null) {
                cinta[pos] = "□";
                pos = pos + 1;
            }
            tokenError = matcher.group(4);  //reconociendo error
            if (tokenError != null) {
                cinta[pos] = tokenError;
                pos = pos + 1;
            }
        }
        //moviendo la cinta
        String finalEstado = "\tVERDE"; //estado de aceptacion
        int estado = 0;
        boolean puntero = false;    //lo que esta entre parentesis()
        pos = 5;
        System.out.print("\n Presione enter para continuar...");
        do{ //reconociendo caracter valido "a"
            if(cinta[pos].equals("0")||cinta[pos].equals("(0)")){
                if (cinta[pos].equals("(0)")) {
                        cinta[pos] = "0";
                }
                try{
                if (estado==0 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    //ciclo de estado
                    puntero = true;
                }
                else if (estado==1 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==2 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==3 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==4 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==5 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==6 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }                     
                else  if (estado==7 && puntero == false) {
                          
                     pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;                
                }                       
                else if (estado==8 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==9 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==10 && puntero == false) {
                    if (cinta[pos].equals("a")) {
                        cinta[pos] = "b";   //cambio de caracter
                    }
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==11 && puntero == false) {
                    if (cinta[pos].equals("0")) {
                        cinta[pos] = "1";   //cambio de caracter
                    }
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==12 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    //ciclo de estado
                    puntero = true;
                }
                else if (estado==13 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==14 && puntero == false) {
                    if (cinta[pos].equals("0")) {
                        cinta[pos] = "1";   //cambio de caracter
                    }
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==15 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==16 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==17 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==18 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==19 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    //ciclo de estado
                    puntero = true;
                }
            }catch(Exception e){
                    System.out.println("adsfg");
            }
            }//reconociendo caracter valido "b"
            
            else if(cinta[pos].equals("1")||cinta[pos].equals("(1)")){
                if (cinta[pos].equals("(1)")) {
                        cinta[pos] = "1";
                }
                if (estado==0 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    //ciclo de estado
                    puntero = true;
                }
                else if (estado==1 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==2 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==3 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==4 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==5 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==6 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==7 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==8 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==9 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==10 && puntero == false) {
                    if (cinta[pos].equals("1")) {
                        cinta[pos] = "0";   //cambio de caracter
                    }
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==11 && puntero == false) {
                    if (cinta[pos].equals("1")) {
                        cinta[pos] = "0";   //cambio de caracter
                    }
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==12 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    //ciclo de estado
                    puntero = true;
                }
                else if (estado==13 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==14 && puntero == false) {
                    if (cinta[pos].equals("1")) {
                        cinta[pos] = "0";   //cambio de caracter
                    }
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==15 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==16 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==17 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==18 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==19 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    //ciclo de estado
                    puntero = true;
                }
            }//reconociendo caracter valido □ vacio
            else if(cinta[pos].equals("□")||cinta[pos].equals("(□)")){
                if (cinta[pos].equals("(□)")) {
                        cinta[pos] = "□";
                    }
                if (estado==0 && puntero == false) {
                    pos = pos + 1;
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==1 && puntero == false) {
                    pos = pos - 1;
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==2 && puntero == false) {
                    pos = pos + 1;
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;  //avanza al siguiente estado
                    puntero = true;
                }
                else if (estado==3 && puntero == false) {
                    pos = pos - 1;
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==4 && puntero == false) {
                    pos = pos + 1;
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==5 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==6 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==7 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    //ciclo de estado
                    puntero = true;
                }
                else if (estado==8 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==9 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==10 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==11 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==12 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==13 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==14 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==15 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    //ciclo de estado
                    puntero = true;
                }
                else if (estado==16 && puntero == false) {
                    pos = pos + 1;  //puntero se mueve a la derecha
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==17 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==18 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
                else if (estado==19 && puntero == false) {
                    pos = pos - 1;  //puntero se mueve a la izquierda
                    cinta[pos] = "("+cinta[pos]+")";
                    estado ++;
                    puntero = true;
                }
            }//reconociendo error para cerrar el procesoab 
            else if(!cinta[pos].equals("0")||!cinta[pos].equals("(0)")||
                    !cinta[pos].equals("1")||!cinta[pos].equals("(1)")||
                    !cinta[pos].equals("□")||!cinta[pos].equals("(□)")
                    ||!cinta[pos].equals(" ")){
                finalEstado = "\tROJO"; //estado fallido
            }   //color del estado final
            if (estado == 20 || finalEstado.equals("\tROJO")) {
                System.out.println("\n" + finalEstado);
            }
            else{
                System.out.println("\n\tq"+estado);
            }
            for (int i = 0; i < (texto.length()+10); i++) {
                System.out.print(cinta[i]);
            }
            puntero = false;
            teclado.nextLine();
        }while(estado != 20 && finalEstado.equals("\tVERDE"));
    }
    
    public static void main(String[] args)  {
        String texto;
        
        System.out.println("*****Maquina de Turing*****");
        
        System.out.print("Escriba su codigo: ");
        texto = teclado.nextLine();
      try{
        iniciarCinta(texto);
      }catch(Exception e){
          System.out.println("\n\n\tRojo");
      }
        System.out.println("\nFin del programa...");
    }
    
}