/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardatupassword;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class GuardaTuPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int menu=1;
        int menu2=5;
        String contra="1234"; //La contraseña por omisión es 1234
        String chckpss;
        
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
        Scanner scanne = new Scanner(System.in);
        
        do
        {
            System.out.println("Guarda tu Password");
            System.out.println("Introduce la contraseña");
            chckpss=sca.nextLine();
            if(chckpss.equals(contra))
            {
                System.out.println("Guarda tu Password");
                System.out.println("Elige la operacion: 1. Almacenar Contraseña nueva 2. Listar Contraseñas 3. Cambiar login 4. Salir");
                menu2=scann.nextInt();
                switch (menu2) {
                //Almacenar Contraseña nueva
                    case 1:
                        break;
                //Listar Contraseñas
                    case 2:
                        break;
                    case 3:
                        System.out.println("Introduzca nueva password para login");
                        contra=scanne.nextLine();
                        break;
                    case 4:
                        menu=2; break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
                
            }
            
            
        } while(menu==1);
    }
    
}
