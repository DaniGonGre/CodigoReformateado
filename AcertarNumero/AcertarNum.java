package boletin11_2;

import javax.swing.JOptionPane;

public class AcertarNum {
    
    public void Acertar(){
    int numAleatorio = (int) (Math.random()*50 + 1);  //  Creamos un número aleatorio.
        //       System.out.println("Número aleatorio: " + numAleatorio);
        //       Para hacer pruebas y comprobar la eficiencia del programa mostramos el número aleatorio.
    
    int intentos, num, i;    
    intentos= Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de intentos: "));
    //  Pedimos al jugador que elija el número de intentos que quiere tener.

    for (i=0; i<=intentos; i++) { //  Creamos un bucle for que se detendrá cuando el número de intentos sea 0.
        
        num= Integer.parseInt(JOptionPane.showInputDialog("Introduce o número entre 1 y 50: "));
        //  Pedimos al jugador que introduzca un número entre el 1 y el 50 para saber si acierta el número aleatorio.

        System.out.println("Te quedan " +intentos + " intentos");
        //  Mostramos al jugador el número de intentos que le quedan.

        if (numAleatorio==num) //  Añadimos una condición
            System.out.println("O número é correcto.");
        //  Si el número aleatorio es igual al número que da el jugador, mostramos por pantalla que el número es el correcto.
        
        else{
        //  Si no es correcto quitamos un intento, restando uno por cada fallo.
        intentos--;
        
        if ((numAleatorio - num) > 20){
            System.out.println("Moi lonxe.");
            //  Si la diferencia entre los número es mayor de 20 le diremos que está muy lejos.
        }
        else if ((numAleatorio - num) >= 10 && (numAleatorio - num) <= 20){
            System.out.println("Lonxe.");
            //  Si la diferencia entre los número es mayor o igual a 10 y menor o igual a 20 le diremos que está lejos.
        }
        else if ((numAleatorio - num) > 10 && (numAleatorio - num) < 5){
            System.out.println("Preto.");
            //  Si la diferencia entre los número es mayor de 10 y menor que 5 le diremos que está cerca.

        }   
            else if ((numAleatorio - num) <= 5){
            System.out.println("Moi preto.");
            //  Si la diferencia entre los número es menor o igual que 5 le diremos que está mui cerca.

        }
        
    }
        
    }
        if (intentos==0){
            System.out.println("Non quedan intentos.");
            }
        // Si el número de intentos es igual a cero le diremos que no le quedan intentos y finalizará el programa.

        
    } 
    
    
    
}
