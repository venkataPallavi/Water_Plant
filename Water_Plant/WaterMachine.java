import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
//import java.awt.print;

public class WaterMachine implements ActionListener{ 
	int ltrcost=10;
	JLabel l;
        JLabel l1;
	JLabel l2,lblError;
	JLabel l3,lblname,lbl2t,lbl500,lbl200,lbl100,lbl50,lbl20,lbl10,lblErrorPayment;
	
	JLabel lblFinalMsg,lblFinalName,lblFinalLtrs,lblCost,lblPaid;
	
	JTextField tf;
	JTextField tf1;
	JTextField tf2000,tf500,tf200,tf100,tf50,tf20,tf10;
	JButton GetCost;
	JButton ProceedPayment,printPage;
	JFrame jfrm = new JFrame("WaterMachine");	
	JFrame jfrmPayment = new JFrame("WaterMachine");
	JFrame jfrmFinal = new JFrame("WaterMachine");
	int Total =0;
	
	WaterMachine(){
	
		jfrm.setSize(600,500);
		jfrmPayment.setSize(600,700);
		jfrmFinal.setSize(600,500);
		// Frame1 Get Cost
		l = new JLabel("Enter your Name");
		l1 = new JLabel("1-Liter : Rs "+ltrcost);
		l2= new JLabel("Enter how many liters you want");
		 
		l.setBounds(50,30, 450,40);  
		l1.setBounds(50,100,400,40);  
		l2.setBounds(50,180,400,40);
		
		tf = new JTextField();
		tf.setBounds(50,70, 200,30);
		tf1 = new JTextField();
		tf1.setBounds(50,150, 200,30);    
		
		GetCost=new JButton("Get Cost");  
		GetCost.setBounds(50,250,300,30); 
		GetCost.addActionListener(this);
		
		lblError = new JLabel("");
	      	lblError.setBounds(50,200, 4500,40);   
		
		jfrm.add(GetCost); 
		jfrm.add(l);
		jfrm.add(tf);
		jfrm.add(l1);
	      
		jfrm.add(tf1);
		jfrm.add(l2);
		jfrm.add(lblError);
	       
		jfrm.setLayout(null);
		jfrm.setVisible(true);
		// Frame1 Get Cost
		
		// Frame2 Proceed Payment
		ProceedPayment=new JButton("Proceed Payment");  
		ProceedPayment.setBounds(50,500,300,30); 
		ProceedPayment.addActionListener(this);
	      	
	      	l3= new JLabel("");
	      	l3.setBounds(50,30, 450,40);        	 
	      	lblname=new JLabel("");
	      	lblname.setBounds(50,70, 450,40); 
	      	lbl2t  = new JLabel("2000 X");
	      	lbl2t.setBounds(50,70, 450,40);  
	      	lbl500 = new JLabel("500  X");
	      	lbl500.setBounds(50,120, 450,40);  
	      	lbl200 = new JLabel("200  X");
	      	lbl200.setBounds(50,170, 450,40);  
	      	lbl100 = new JLabel("100  X");
	      	lbl100.setBounds(50,220, 450,40);  
	      	lbl50 = new JLabel("50    X");
	      	lbl50.setBounds(50,270, 450,40);  
	      	lbl20 = new JLabel("20    X");
	      	lbl20.setBounds(50,320, 450,40);  
	      	lbl10 = new JLabel("10    X");
	      	lbl10.setBounds(50,370, 450,40);   
	  	lblErrorPayment = new JLabel("");
	      	lblErrorPayment.setBounds(50,420, 4500,40);     	
	      	
	      	tf2000 = new JTextField();
	      	tf2000.setBounds(50,100, 200,30);
	      	tf500 = new JTextField();
	      	tf500.setBounds(50,150, 200,30);
	      	tf200 = new JTextField();
	      	tf200.setBounds(50,200, 200,30);
	      	tf100 = new JTextField();
	      	tf100.setBounds(50,250, 200,30);
	      	tf50 = new JTextField();
	      	tf50.setBounds(50,300, 200,30);
	      	tf20 = new JTextField();
	      	tf20.setBounds(50,350, 200,30);
	      	tf10 = new JTextField();
	      	tf10.setBounds(50,400, 200,30);
	      	
	 	jfrmPayment.add(l3);
	 	jfrmPayment.add(lblname);
	 	jfrmPayment.add(lbl2t);
	 	jfrmPayment.add(lbl500);
	 	jfrmPayment.add(lbl200);
	 	jfrmPayment.add(lbl100);
	 	jfrmPayment.add(lbl50);
	 	jfrmPayment.add(lbl20);
	 	jfrmPayment.add(lbl10);
	 	
	 	
	 	jfrmPayment.add(tf2000);
	 	jfrmPayment.add(tf500);
	 	jfrmPayment.add(tf200);
	 	jfrmPayment.add(tf100);
	 	jfrmPayment.add(tf50);
	 	jfrmPayment.add(tf20);
	 	jfrmPayment.add(tf10);
	 	 	      
	 	jfrmPayment.add(lblErrorPayment);
		jfrmPayment.add(ProceedPayment); 
		jfrmPayment.setLayout(null);
		jfrmPayment.setVisible(false);
		// Frame2 Proceed Payment	
		
		// Frame3 Final Message	
		lblFinalMsg = new JLabel("Congratulations....,  Payment done successfully. Please collect your water.");
	      	lblFinalMsg.setBounds(50,50, 4500,40);  
	      		      	
	      	lblFinalName= new JLabel("");
	      	lblFinalName.setBounds(50,80, 4500,40);  
	      	lblFinalLtrs= new JLabel("");
	      	lblFinalLtrs.setBounds(50,110, 4500,40);  
	      	lblCost= new JLabel("");
	      	lblCost.setBounds(50,140, 4500,40);  
	      	lblPaid= new JLabel("");      	
	      	lblPaid.setBounds(50,170, 4500,40);  
	      	
	      	printPage=new JButton("Print Receipt");  
		printPage.setBounds(50,250,300,30); 
		printPage.addActionListener(this);
	      	
	      	
	      	
		jfrmFinal.add(lblFinalName);
		jfrmFinal.add(lblFinalLtrs);		
		jfrmFinal.add(lblCost);
		jfrmFinal.add(lblPaid);
		jfrmFinal.add(lblFinalMsg);
		//jfrmFinal.add(printPage);
		jfrmFinal.setLayout(null);
		jfrmFinal.setVisible(false);
		// Frame3 Final Message	
	}


public static void main(String[] args)
    {
        new WaterMachine();
    }
    
public void actionPerformed(ActionEvent e) {
	//lblError.setText(e.getSource().toString() );
	//lblError.setText("actionPerformed starts" );
	if(e.getSource()== GetCost )
	{
		boolean isNumber = true;
		int In = 0;
	    	String out = tf1.getText();
	    	lblError.setText("out value : " + out );
	    	if(out.isEmpty())
	    	{
	    		lblError.setText("please enter valid quantiy in Ltrs" );	    		
	    	}
	    	else if(tf.getText().isEmpty())
	    	{
	    		lblError.setText("please enter name" );	
	    	}
	    	else
	    	{
	    		for (char c : out.toCharArray()) {
			    if (Character.isAlphabetic(c)){
			    	isNumber = false;
				break;
			    }
			}
			if(isNumber == false)
			{				
				lblError.setText("please enter valid numbers only" );
			}
			else
			{
			    	In = Integer.parseInt(out);
				Total = In * ltrcost;
			    
			    	l3.setText("Totalcost for "+In+" Ltrs is Rs "+Total );
			    	if(Total > 0)
			    	{
					jfrm.setVisible(false);
					jfrmPayment.setVisible(true);	
				}
				else
				{
					lblError.setText("please enter valid quantiy in Ltrs" );
				}
			}
		}	
	}
	else if(e.getSource()== ProceedPayment)
	{
		lblError.setText("Proceed payment click action");
		int In2000 = 0;
		int In500 = 0;
		int In200 = 0;
		int In100 = 0;
		int In50 = 0;
		int In20 = 0;
		int In10 = 0;
		String out2000 = tf2000.getText();
		if(!out2000.isEmpty())
		{
	    		In2000 = Integer.parseInt(out2000);
	    	}
	    	
	    	String out500 = tf500.getText();
	    	if(!out500.isEmpty())
		{
	    		In500 = Integer.parseInt(out500);
	    	}
	    	String out200 = tf200.getText();
	    	if(!out200.isEmpty())
		{
	    		In200 = Integer.parseInt(out200);
	    	}
	    	String out100 = tf100.getText();
	    	if(!out100.isEmpty())
		{
	    		In100 = Integer.parseInt(out100);
	    	}
	    	String out50 = tf50.getText();
	    	if(!out50.isEmpty())
		{
	    		In50 = Integer.parseInt(out50);
	    	}
	    	String out20 = tf20.getText();
	    	if(!out20.isEmpty())
		{
	    		In20 = Integer.parseInt(out20);
	    	}
	    	String out10 = tf10.getText();
	    	if(!out10.isEmpty())
		{
	    		In10 = Integer.parseInt(out10);
	    	}
	    	
	    	
	    	int finalTotal = (In2000*2000) + (In500*500) + (In200*200) + (In100*100) + (In50*50) + (In20*20) + (In10*10);
	    	if(finalTotal != Total)
	    	{
	    		lblErrorPayment.setText("Amount paid is not matched with total cost, please verify once again");
	    	}
	    	else
	    	{
	    		jfrm.setVisible(false);
			jfrmPayment.setVisible(false);	
	    		jfrmFinal.setVisible(true);
	      		lblFinalName.setText("Name : 			"+ tf.getText()); 
		      	lblFinalLtrs.setText("ordered Water in Ltrs : " + tf1.getText());  
	      		lblCost.setText("Total Cost in Rs : 		" +Integer.toString(Total));  
		      	lblPaid.setText("Total paid Amount in Rs : 		" + Integer.toString(finalTotal));  
	    	}
	    	
	}
	else if(e.getSource()== printPage )
	{
		jfrm.setVisible(false);
		jfrmPayment.setVisible(false);	
    		jfrmFinal.setVisible(true);
		
		/*
		PrinterJob job = PrinterJob.getPrinterJob();     
        	PageFormat format = job.defaultPage();
		format.setOrientation(PageFormat.LANDSCAPE);	  
		job.setPrintable(jfrmFinal, format);
		 
		try{
		    if(job.printDialog()) job.print();
		}
		catch(Exception e){e.printStackTrace();}
		}
		*/
    	}
    }
    
}    



