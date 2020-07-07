/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisiion;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 *
 * @author 18660
 */
public class TeleVisiion {

    /**
     * @param args the command line arguments
     */
   
     private String Manufacturer;
     private int screenSize;
     private boolean Status ;
     private int volume;
     private int channel;
     
     TeleVisiion(){}
     TeleVisiion(String Manufact,int size){
         this.Manufacturer = Manufact;
         this.screenSize = size;
         this.Status = false;
         this.volume = 20;
         this.channel = 2;
        
     }
     
     public void setChannel(){
         StdOut.println("Enter Channel Number");
         this.channel = StdIn.readInt();
     }
     
     public void decreaseVolume(){
         this.volume--;
     }
     public void increaseVolume(){
         this.volume++;
     }
     public void power(){
         this.Status = ! this.Status;
     }
     public void Display(){
         StdOut.println("Manufacturer " + this.Manufacturer);
         StdOut.println("screenSize   " + this.screenSize);
         StdOut.println("Status       " + this.Status);
         StdOut.println("volume       " + this.volume);
         StdOut.println("channel      " + this.channel);
         
     }
     
     public int getChannel(){
         return this.channel;
     }
     public int getVolume(){
         return this.volume;
     }
     public String getManufacturer(){
         return this.Manufacturer;
     }
     public int getScreenSize(){
         return this.screenSize;
     }
     
     
}
