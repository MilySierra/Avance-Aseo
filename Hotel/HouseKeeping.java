/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

public class HouseKeeping extends Rooms{
    static Lectura ln = new Lectura();
    static String nombreHk;
    static int idHk;
    static boolean limpiar;
    
    public static String setNameHousekeeping(String nombreHk){
        nombreHk = ln.leerString("Ingrese su nombre: ");
        return nombreHk;
    }
    public static int setIdHousekeeping(int idHk){
        idHk = ln.leerInt("Ingrese su ID: ");
        return idHk;  
    }
    
    public void cleanRoom(){
        idRoom = ln.leerInt("¿Qué número de habitación está limpiando? ");
        System.out.println("La mucama" + nombreHk + " con Id "+ idHk + "está limpiando la habitación " + idRoom);
        limpiar=true;
    }

    public boolean verifyClean(){
        if (limpiar != true){
            
        }
        return true;
    }
    

}
