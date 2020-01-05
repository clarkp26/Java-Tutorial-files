import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class CounterApplication2 extends Frame implements ActionListener{

        private Counter count1, count2;    //two separate threads
        private TextField count1Field, count2Field;
        private Button start, stop, toggle;
        
        public CounterApplication2() {
                super("Multi-Thread Counter");
                
                this.count1Field = new TextField(10);
                this.count2Field = new TextField(10);
                this.count1 = new Counter(count1Field, 1, 0);    // delay 1ms start at 0
                this.count1.setPriority(Thread.MAX_PRIORITY);
                this.count2 = new Counter(count2Field, 1, 200);   // delay 1ms start at 50
                this.count2.setPriority(Thread.MIN_PRIORITY);
                this.start = new Button("Start");
                this.stop = new Button("Stop");
                this.toggle = new Button("Toggle");
                
                this.start.addActionListener(this);
                this.stop.addActionListener(this);
                this.toggle.addActionListener(this);
                
                this.setLayout(new FlowLayout());
                this.add(this.count1Field);
                this.add(this.count2Field);
                this.add(this.start);
                this.add(this.stop);
                this.add(this.toggle);
        
                this.pack();
                this.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(start)){
                        this.count1.start();
                        this.count2.start();
                }
                else if (e.getSource().equals(stop)){
                        this.count1.stopCount();
                        this.count2.stopCount();
                }
                else if (e.getSource().equals(toggle)){
                        this.count1.toggleCount();
                        this.count2.toggleCount();
                }
        }
        
        public static void main(String[] args) {
                new CounterApplication2();
        }
}
