/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Interfaces.Phone;
/**
 *
 * @author salir
 */
public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;
    
    public Xiaomi(){
        this.volume = 50;
    }
    
    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di Xiaomi");
        System.out.println("Android Version 10");
    }
    
    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Mematikan Handphone");
    }
    
    @Override
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume Sudah Maksimal!!!");
                System.out.println("Volume = " + this.volume + "%");
            }else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.volume);
            }
        }else{
            System.out.println("Handphone Mati");
        }
    }
    @Override
    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = " + this.volume + "%");
            }else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.volume + "%");
            }
        }else{
            System.out.println("Handphone Mati");
        }
    }
    public int getVolume(){
        return volume;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public boolean isPowerOn(){
        return isPowerOn;
    }
    
    public void setPowerOn(boolean isPowerOn){
        this.isPowerOn = isPowerOn;
    }
}
