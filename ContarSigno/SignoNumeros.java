package boletin9_1;

import java.util.Scanner;

public class SignoNumeros {

    public void contNumeros(){
        int pos=0, neg=0, cero=0; //Creamos tres atributos, uno para los números positivos (pos), números negativos (neg) y ceros (cero). Los inicializamos en 0.
        for(int contador=0; contador<10; contador++){ //Iniciamos un bucle for que se va a repetir 10 veces.
            Scanner lerNumero = new Scanner(System.in); //Creamos un objeto da clase Scanner para poder leer los números.
            int num; //Creamos un atributo llamado num.
            System.out.println("Introduce un número: "); //Le pedimos que introduzca un número por teclado.
            num= lerNumero.nextInt(); //Asignamos el valor que introduzcan al atributo que hemos creado anteriormente.

            //Condicionais:

            if(num>0){ //Si el valor del número que introducen es mayor que cero aumentamos el marcador de números positivos.
                pos++;
            }
            else if(num<0){ //Si el valor del número que introducen es menor que cero aumentamos el marcador de números negativos.
                neg++;
            }
            else{ //Si el número es igual a cero aumentamos el marcador de ceros.
                cero++;

                //Esta condición se repite hasta que el bucle se acabe, es decir, hasta recoger los 10 números.
            }         
        }
       
        System.out.println("Positivos= "+ pos + "\n" + "Negativos= "+ neg + "\n" +"Ceros= " + cero ); //Mostramos por pantalla el marcador de cada signo de los números para saber cuantos hay de cada tipo.
    }
    
}
