/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nelly TUMUKUNDE
 */
public class Whistle {
    
    private String _sound;
    
    public  Whistle(String whistleSound){
        _sound = whistleSound;
    }
    
    public void sound(){
        System.out.println(_sound);
    }
}
