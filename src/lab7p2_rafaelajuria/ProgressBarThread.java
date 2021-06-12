/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rafaelajuria;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author rajur
 */
public class ProgressBarThread extends Thread {
    JProgressBar ProgressBar;
    private JLabel Current;
    Boolean Avanzar;

    public ProgressBarThread(JProgressBar ProgressBar, JLabel Current) {
        this.ProgressBar = ProgressBar;
        this.Current = Current;
        this.Avanzar = true;
    }

    public JProgressBar getProgressBar() {
        return ProgressBar;
    }

    
    public void run(){
        while(Avanzar){
            if(Avanzar){
                ProgressBar.setValue(ProgressBar.getValue()+1);
                Current.setText(""+Math.floor(ProgressBar.getValue()/10));
                if(ProgressBar.getValue()==100000){
                    Avanzar=false;
                }                
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
}
