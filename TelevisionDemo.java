/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisiion;

/**
 *
 * @author 18660
 */
public class TelevisionDemo {
    public static void main(String []args){
        TeleVisiion tv1 = new TeleVisiion("Sony",40);
        tv1.power();
        tv1.decreaseVolume();
        tv1.increaseVolume();
        tv1.increaseVolume();
        tv1.setChannel();
        
        tv1.Display();
        
    }
}
