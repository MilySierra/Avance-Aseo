/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

public class Rooms {
    static Lectura mc = new Lectura();
    protected int idRoom;
    protected int condicionHabitacion;

    public static int registroID(int idRoom){
        idRoom = mc.leerInt("Ingrese el id de la habitacion");
        idRoom = mc.ValidarInt(idRoom);
        return idRoom;
    }
    public static int registroSuciedad( int condicionHabitacion){
        condicionHabitacion = mc.leerInt("Ingrese la condicion de la habitacion (1) para Limpia , (2) para Sucia");
        condicionHabitacion = mc.ValidarInt(condicionHabitacion);
        return condicionHabitacion;
    }
    public static int validarSuciedad(int condicionHabitacion){
        while (condicionHabitacion > 2){
            condicionHabitacion = mc.leerInt("Ingreso mal la condicion de la habitacion, recuerde que: (1) para Limpia , (2) para Sucia");
        }
        return condicionHabitacion;
    }
}