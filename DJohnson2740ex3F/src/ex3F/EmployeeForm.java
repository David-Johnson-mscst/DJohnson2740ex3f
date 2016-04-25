package ex3F;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

public class EmployeeForm extends JFrame {
	
//	private Employee emp1, emp2, emp3;

	private JPanel contentPane;
	private JTextField empIdTextField;
	private JTextField empNameTextField;
	private JTextField positionTextField;
	private JList employeeList;
	private DefaultListModel employeeListModel;
	private JComboBox deptComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
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
	public EmployeeForm() {
		setTitle("Exercise 3F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(10, 167, 126, 31);
		contentPane.add(lblEmployeeId);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 11, 377, 145);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();
		//employeeList = new JList();
		employeeList = new JList(employeeListModel);
		scrollPane.setViewportView(employeeList);
		
		empIdTextField = new JTextField();
		empIdTextField.setText("101");
		lblEmployeeId.setLabelFor(empIdTextField);
		empIdTextField.setBounds(146, 172, 86, 20);
		contentPane.add(empIdTextField);
		empIdTextField.setColumns(10);
		
		JLabel lblEmployeeName = new JLabel("Employee name:");
		lblEmployeeName.setBounds(10, 218, 126, 14);
		contentPane.add(lblEmployeeName);
		
		empNameTextField = new JTextField();
		empNameTextField.setText("David Johnson");
		lblEmployeeName.setLabelFor(empNameTextField);
		empNameTextField.setBounds(146, 215, 131, 20);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(10, 256, 126, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(10, 297, 126, 14);
		contentPane.add(lblPosition);
		
		positionTextField = new JTextField();
		positionTextField.setText("Software Engineer");
		lblPosition.setLabelFor(positionTextField);
		positionTextField.setBounds(146, 294, 159, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		JButton noArgButton = new JButton("No Arg");
		noArgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_noArgButton_actionPerformed(arg0);
			}
		});
		noArgButton.setBounds(10, 348, 89, 23);
		contentPane.add(noArgButton);
		
		JButton twoArgButton = new JButton("2 Arg");
		twoArgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_twoArgButton_actionPerformed(e);
			}
		});
		twoArgButton.setBounds(131, 348, 89, 23);
		contentPane.add(twoArgButton);
		
		JButton fourArgButton = new JButton("4 Arg");
		fourArgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_fourArgButton_actionPerformed(e);
			}
		});
		fourArgButton.setBounds(258, 348, 89, 23);
		contentPane.add(fourArgButton);
		
		deptComboBox = new JComboBox();
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		lblDepartment.setLabelFor(deptComboBox);
		deptComboBox.setBounds(146, 253, 159, 20);
		contentPane.add(deptComboBox);
	}
	protected void do_noArgButton_actionPerformed(ActionEvent arg0) {
		// Call appropriate constructor
		Employee emp1 = new Employee();
		// Add employee to employeeListModel
		 		employeeListModel.addElement(emp1);
	}
	
	protected void do_twoArgButton_actionPerformed(ActionEvent e) {
		// Get empID from empIdTextField, convert to int
		int id = Integer.parseInt(empIdTextField.getText());
		// Call appropriate constructor
		Employee emp2 = new Employee();
		// Add employee to employeeListModel
		 		employeeListModel.addElement(emp2);
	}
	
	protected void do_fourArgButton_actionPerformed(ActionEvent e) {
		// Get empID from empIdTextField, convert to int
		int id = Integer.parseInt(empIdTextField.getText());
		// Get selected string from deptComboBox
		String dept = (String) deptComboBox.getSelectedItem();
		// Call appropriate constructor
		Employee emp3 = new Employee();
		// Add employee to employeeListModel
		 	employeeListModel.addElement(emp3);
	}
}
