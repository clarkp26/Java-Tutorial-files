import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Students{
	private String name,ID,program;
	
	Students(String n,String i,String p){
		name =n;
		ID = i;
		program = p;
	}
	public String getName(){return name;}
	public String getID(){return ID;}
	public String getProgram(){return program;}
	
}

public class Question42015 extends JFrame implements ActionListener, ListSelectionListener{
	private JButton New, Save;
	private JLabel Title,Name,ID,Program;
	private TextField NameText,IDText,ProgramText;
	private JList<Students> list;
	private JScrollPane s;
	private String name,id,program;
	private Vector<Students> students;
	
	public Question42015(){
		super("Test Question");
		students = new Vector<Students>();

		this.setLayout(new BorderLayout());
		
		New = new JButton("New Student Record");
		Save = new JButton("Save Student Record");
		Title = new JLabel("DCU Student Details Editor");
		Name = new JLabel("Name:");
		ID = new JLabel("Student ID:");
		Program = new JLabel("Programme:");
		NameText =new TextField(15);
		IDText =new TextField(15);
		ProgramText =new TextField(15);
		
		
		students.add(new Students("Dave","1234567","ECE"));
		students.add(new Students("Phil","9875532","ECE"));
		students.add(new Students("Julio Jones","1239327","ME"));
				
		list = new JList<Students>(students);
		s = new JScrollPane(list);
		
		this.list.addListSelectionListener(this);
		JPanel rightPanel = new JPanel(new FlowLayout());
		JPanel rightGrid = new JPanel(new GridLayout(3,2));
		rightPanel.add(Title);
		rightPanel.add(rightGrid);
//		rightGrid.add(Title);
		rightGrid.add(NameText);
		rightGrid.add(Name);
		rightGrid.add(IDText);
		rightGrid.add(ID);
		rightGrid.add(ProgramText);
		rightGrid.add(Program);
		rightPanel.add(New);
		rightPanel.add(Save);
		
		this.list.addListSelectionListener(this);
		this.New.addActionListener(this);
		this.Save.addActionListener(this);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				s, rightPanel);
				splitPane.setOneTouchExpandable(true);
				splitPane.setDividerLocation(110);

		
//		this.getContentPane().add("West",list);
		this.getContentPane().add(splitPane);
//		this.getContentPane().add("East",rightPanel);
		
		this.setSize(500,200);
//		this.pack();
		this.setVisible(true);
		
		}
		
	
	
	
	


	public static void main(String[] args) {
		new Question42015();

	}



	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(New)){
//			NameText.setText(" ");
//			IDText.setText(" ");
//			ProgramText.setText(" ");
			NameText.setEditable(true);
			IDText.setEditable(true);
			ProgramText.setEditable(true);
			name = NameText.getText();
			id = IDText.getText();
			program = ProgramText.getText();
			students.add(new Students(name,id,program));
			list.updateUI();
			
			System.out.println("yeooooo");
		}
		else if(e.getSource().equals(Save)){
			Students selected = (Students)list.getSelectedValue();
			NameText.setText(selected.getName());
			IDText.setText(selected.getID());
			ProgramText.setText(selected.getProgram());
			list.updateUI();
			
		}
		
	}





	public void valueChanged(ListSelectionEvent e) {
		Students selected = (Students)list.getSelectedValue();
		NameText.setText(selected.getName());
		IDText.setText(selected.getID());
		ProgramText.setText(selected.getProgram());
		
	}
}
