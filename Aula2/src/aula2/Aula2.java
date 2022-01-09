/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2;

/**
 *
 * @author moise
 */
public class Aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "PRETA";
        c2.destampar();
        c2.rabiscar();
        
        Controle_remoto cr1 = new Controle_remoto();
        cr1.modelo = "modeloum";
        cr1.cor = "rosa";
        cr1.marca = "modelitojuniot";
        cr1.volume = 0;
        cr1.tv_ligada = false;
        cr1.tv_mudo = false;
        
        
    }
}
