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
        
        Passwords p = new Passwords();
        ManejaPasswords manp = new ManejaPasswords();
        
        int menu=1;
        int menu2=5;
        String contra="1234"; //La contraseña por omisión es 1234
        String chckpss;
        
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
        Scanner scanne = new Scanner(System.in);
        Scanner scanid = new Scanner(System.in);
        Scanner scanserv = new Scanner(System.in);
        Scanner scanpsswd = new Scanner(System.in);
        
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
                    {
                        System.out.println("Introduzca ID");
                        p.setId(scanid.nextInt());
                        
                        System.out.println("Introduzca Servicio");
                        p.setServicio(scanserv.nextLine());
                        
                        System.out.println("Introduzca Password");
                        p.setPass(scanpsswd.nextLine());
                        
                        manp.GuardaPass(p);
                    }
                        break;
                //Listar Contraseñas
                    case 2:
                        manp.Listar();
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
