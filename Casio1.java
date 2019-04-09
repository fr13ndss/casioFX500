package CasioHocSinh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Casio1 extends JFrame {

	private JPanel contentPane;
	private JTextField input_TF;
	private JTextField output_TF;
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String so="";
	String vl="";
	ArrayList<String> ds=new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Casio1 frame = new Casio1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	private JTextField bt_TF;
	public Casio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 487);
		setTitle("CASIO       fx-570S PLUS");
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		input_TF = new JTextField();
		input_TF.setBounds(31, 22, 264, 31);
		contentPane.add(input_TF);
		input_TF.setColumns(10);
		
		output_TF = new JTextField();
		output_TF.setBounds(31, 86, 264, 31);
		contentPane.add(output_TF);
		output_TF.setColumns(10);
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int so1=1;
//				input_TF.setText("1");
				 so=input_TF.getText()+num1.getText();
				 vl=vl+input_TF.getText()+num1.getText();
				input_TF.setText(so);
				bt_TF.setText(vl);
			}
		});
		num1.setBounds(10, 367, 42, 23);
		contentPane.add(num1);
		
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				so=input_TF.getText()+num2.getText();
				vl=vl+input_TF.getText()+num2.getText();
				input_TF.setText(so);
				bt_TF.setText(vl);
			}
		});
		num2.setBounds(62, 367, 44, 23);
		contentPane.add(num2);
		
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 so=input_TF.getText()+num3.getText();
				 vl=vl+input_TF.getText()+num3.getText();
				input_TF.setText(so);bt_TF.setText(vl);
			}
		});
		num3.setBounds(116, 367, 44, 23);
		contentPane.add(num3);
		
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				so=input_TF.getText()+num4.getText();
				vl=vl+input_TF.getText()+num4.getText();
				input_TF.setText(so);bt_TF.setText(vl);
			}
		});
		num4.setBounds(10, 332, 42, 23);
		contentPane.add(num4);
		
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 so=input_TF.getText()+num5.getText();
				 vl=vl+input_TF.getText()+num5.getText();
				input_TF.setText(so);bt_TF.setText(vl);
			}
		});
		num5.setBounds(62, 332, 44, 23);
		contentPane.add(num5);
		
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 so=input_TF.getText()+num6.getText();
				 vl=vl+input_TF.getText()+num6.getText();
				input_TF.setText(so);bt_TF.setText(vl);
			}
		});
		num6.setBounds(116, 333, 44, 23);
		contentPane.add(num6);
		
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 so=input_TF.getText()+num7.getText();
				 vl=vl+input_TF.getText()+num7.getText();
				input_TF.setText(so);bt_TF.setText(vl);
			}
		});
		num7.setBounds(10, 298, 42, 23);
		contentPane.add(num7);
		
		JButton num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 so=input_TF.getText()+num8.getText();
				 vl=vl+input_TF.getText()+num8.getText();
				input_TF.setText(so);bt_TF.setText(vl);
			}
		});
		num8.setBounds(62, 298, 44, 23);
		contentPane.add(num8);
		
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				so=input_TF.getText()+num9.getText();
				vl=vl+input_TF.getText()+num9.getText();
				input_TF.setText(so);bt_TF.setText(vl);
			}
		});
		num9.setBounds(116, 299, 44, 23);
		contentPane.add(num9);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setBounds(186, 298, 87, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("AC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input_TF.setText("");
				output_TF.setText("");
				bt_TF.setText("");
				vl="";
			}
		});
		btnNewButton_2.setBounds(283, 298, 67, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(input_TF.getText());
				input_TF.setText("");
				vl=vl+"X";
				operation="X";bt_TF.setText(vl);
			}
		});
		btnX.setBounds(186, 332, 67, 23);
		contentPane.add(btnX);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(input_TF.getText());
				input_TF.setText("");vl=vl+"%";
				operation="/";bt_TF.setText(vl);
			}
		});
		btnNewButton_3.setBounds(273, 332, 76, 23);
		contentPane.add(btnNewButton_3);
		
		JButton button_8 = new JButton("+");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(input_TF.getText());
				input_TF.setText("");vl=vl+"+";
				operation="+";bt_TF.setText(vl);
			}
		});
		button_8.setBounds(184, 367, 67, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(input_TF.getText());
				input_TF.setText("");
				vl=vl+"-";bt_TF.setText(vl);
				operation="-";
			}
		});
		button_9.setBounds(273, 367, 76, 23);
		contentPane.add(button_9);
		
		JButton num0 = new JButton("0");
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 so=input_TF.getText()+num0.getText();
				 vl=vl+input_TF.getText()+num0.getText();
				input_TF.setText(so);bt_TF.setText(vl);
			}
		});
		num0.setBounds(10, 401, 45, 23);
		contentPane.add(num0);
		
		JButton button_1 = new JButton(".");
		button_1.setBounds(72, 401, 42, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("=");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ketqua;
				secondnum=Double.parseDouble(input_TF.getText());
				if(operation=="+") {
					result=firstnum+secondnum;
					ketqua=String.format("%.0f", result);
					output_TF.setText(ketqua);
					output_TF. setHorizontalAlignment(JTextField.RIGHT);;
				}
				else if(operation=="-") {
					result=firstnum-secondnum;
					ketqua=String.format("%.0f", result);
					output_TF.setText(ketqua);
					output_TF. setHorizontalAlignment(JTextField.RIGHT);;
				}
				else if(operation=="X") {
					result=firstnum*secondnum;
					ketqua=String.format("%.0f", result);
					output_TF.setText(ketqua);
					output_TF. setHorizontalAlignment(JTextField.RIGHT);;
				}
				else if(operation=="/") {
					result=firstnum/secondnum;
					ketqua=String.format("%.0f", result);
					output_TF.setText(ketqua);
					output_TF. setHorizontalAlignment(JTextField.RIGHT);;
					
				}
			}
		});
		button_2.setBounds(206, 401, 89, 23);
		contentPane.add(button_2);
		
		bt_TF = new JTextField();
		bt_TF.setBounds(31, 55, 264, 31);
		contentPane.add(bt_TF);
		bt_TF.setColumns(10);
	}
}
