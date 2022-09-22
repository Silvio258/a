/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telefono;

import modelos.Compañia;
import modelos.Mensaje;
import modelos.Movil;



/**
 *
 * @author Usuario
 */
public class Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compañia megaPhone = new Compañia(1, "Megaphone", 1);
        Movil synthia=new Movil(11223344, 10, megaPhone);
        Movil megan=new Movil(22334455, 10, megaPhone);
        System.out.println(synthia);
        System.out.println(megan);
        Mensaje msn = new Mensaje();
        msn.setDestino(11223344);
        msn.setOrigen(22334455);
        msn.setMsn("Sos show");
        System.out.println(msn.enviarMensaje(synthia.getSaldo(), megaPhone.getPrecioMsn()));
        double nSaldo = megaPhone.disminuirSaldo(synthia.getSaldo());
        synthia.setSaldo(nSaldo);
        System.out.println(synthia);
        System.out.println(megan);
        
    }
    
}
