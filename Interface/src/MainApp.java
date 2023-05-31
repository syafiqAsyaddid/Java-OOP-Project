
import java.util.Scanner;
import Interfaces.Phone;

public class MainApp {
    public static void main(String [] args){
        Phone redmiNote10 = new Xiaomi();
        
        PhoneUser dian = new PhoneUser(redmiNote10);
        
        dian.turnOnThePhone();
        
        Scanner input = new Scanner(System.in);
        String aksi;
        boolean isLooping = true;
        
        do {
            System.out.println("====Aplikasi Interfaces====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Perkecil Volume");
            System.out.println("[0] Keluar");
            System.out.println("==========================");
            
            System.out.println("Pilih aksi: ");
            aksi = input.next();
            
            if(aksi.equalsIgnoreCase("1")){
                dian.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("2")){
                dian.turnOffThePhone();
            }else if(aksi.equalsIgnoreCase("3")){
                dian.makePhoneLouder();
            }else if(aksi.equalsIgnoreCase("4")){
                dian.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("0")){
                isLooping = false;
            }else{
                System.out.println("Aksi yg anda pilih tidak tersedia");
                System.out.println("Silahkan pilih kembali");
            }
        }while(isLooping);
    }
}
