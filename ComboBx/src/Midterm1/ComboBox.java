package Midterm1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class ComboBox extends JPanel {


	private static final long serialVersionUID = 1L;
	
	private JFrame frame;



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox window = new ComboBox();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}


	public ComboBox() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] months = { "January", "February", "March", "April", "May", "June", "July"
				, "August", "September", "October", "November", "December"};
		
		String[] days = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", 
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
		
		String[] years = { "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" };
		
		JLabel labelMonth = new JLabel("Month");
		labelMonth.setBounds(103, 75, 61, 16);
		frame.getContentPane().add(labelMonth);
		
		JLabel labelDay = new JLabel("Day");
		labelDay.setBounds(103, 132, 61, 16);
		frame.getContentPane().add(labelDay);
		
		JLabel labelYear = new JLabel("Year");
		labelYear.setBounds(103, 192, 61, 16);
		frame.getContentPane().add(labelYear);
		
		JComboBox comboBx_month = new JComboBox(months);
		comboBx_month.setBounds(196, 70, 106, 27);
		frame.getContentPane().add(comboBx_month);
		
		JComboBox comboBx_day = new JComboBox(days);
		comboBx_day.setBounds(196, 124, 106, 32);
		frame.getContentPane().add(comboBx_day);
		
		JComboBox comboBox_year = new JComboBox(years);
		comboBox_year.setBounds(196, 184, 106, 32);
		frame.getContentPane().add(comboBox_year);
	}
}