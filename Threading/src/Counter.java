import java.awt.*;
import java.awt.event.*;

class Counter extends Thread{
        private int count = 0, delay;
        private boolean running = true, paused = false, countup = true;
        private TextField outputField;
        
        public Counter(TextField t, int delay, int startAt){
                this.outputField = t;
                this.delay = delay;
                this.count = startAt;
        }
        
        public void run(){
                while(running){
                        this.outputField.setText("Count: " + count);
                        if(countup ==true) {
                        	count++;
                        }
                        else count--;
                        try{
                                Thread.sleep(this.delay);
                                synchronized(this){
                                        while (this.paused) wait();
                                }
                        }
                        catch (InterruptedException e){
                                System.out.println("Counter was Interrupted!");
                                this.running = false;
                        }
                }
        }
        
        public void stopCount() { this.running = false; }
        
        public void toggleCount() {                 
                synchronized(this){
                        this.paused = !this.paused;
                        if (!this.paused) this.notify();
                }
        }
        public void UpDown() {
                       this.countup = !this.countup;
                }
          
}

