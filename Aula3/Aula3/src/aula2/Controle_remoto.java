/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

/**
 *
 * @author moise
 */
public class Controle_remoto {
    String modelo, cor, marca;
    int volume, vol_max = 10;
    boolean tv_ligada, tv_mudo;
    
    void liga_tv(){
        if (tv_ligada == true){
            System.out.println("A tv já está ligada");
        }else{
            System.out.println("Ligando tv...");
        }
    }

    void mutar(){
        if (tv_ligada == false){
            System.out.println("A tv está desligada no momento.");
        }else{
            if (tv_mudo == true){
                System.out.println("Tv já está no mudo");
            }else{
                System.out.println("Tv mutada!");
            }
        }
    }
    
    void aumenta_volume(){
        if(this.volume == this.vol_max){
            System.out.println("Volume já está no máximo.");
        }else{
            if(this.volume++ == this.vol_max){
                System.out.println("Volume aumentado para o máximo");
            }else{
                System.out.println("Aumentando volume...");
            }
        }
    }
    
    
            
}
