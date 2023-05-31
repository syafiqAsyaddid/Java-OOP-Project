/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Interfaces.Phone;
/**
 *
 * @author salir
 */
public class PhoneUser {
    private Phone phone;
    
    public PhoneUser(Phone phone){
        this.phone = phone;
    }
    
    public void turnOnThePhone(){
        this.phone.powerOn();
    }
    public void turnOffThePhone(){
        this.phone.powerOff();
    }
    
    public void makePhoneLouder(){
        this.phone.volumeUp();
    }
    public void makePhoneSilent(){
        this.phone.volumeDown();
    }
    public Phone getPhone(){
        return this.phone;
    }
    
    public void setPhone(Phone phone){
        this.phone = phone;
    }
}
