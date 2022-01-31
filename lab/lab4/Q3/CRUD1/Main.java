import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.List;
import java.util.ArrayList;
import models.User;

class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField ageTextField;
	private JTextField addressTextField;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("CRUD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(23, 34, 55, 15);

		contentPane.add(lblId);

		idTextField = new JTextField();
		idTextField.setBounds(80, 32, 162, 15);
		idTextField.setColumns(10);

		contentPane.add(idTextField);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(23, 52, 55, 15);

		contentPane.add(lblName);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(23, 109, 55, 15);

		contentPane.add(lblAddress);

		nameTextField = new JTextField();
		nameTextField.setBounds(80, 50, 322, 19);
		nameTextField.setColumns(10);

		contentPane.add(nameTextField);

		addressTextField = new JTextField();
		addressTextField.setBounds(80, 107, 322, 19);
		addressTextField.setColumns(10);

		contentPane.add(addressTextField);

		btnAdd = new JButton("Add");
		btnAdd.setBounds(55, 136, 98, 25);

		contentPane.add(btnAdd);

		btnEdit = new JButton("Edit");
		btnEdit.setBounds(184, 136, 98, 25);

		contentPane.add(btnEdit);

		btnDelete = new JButton("Delete");
		btnDelete.setBounds(314, 136, 98, 25);

		contentPane.add(btnDelete);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 173, 433, 116);
		contentPane.add(scrollPane);

		UserController userController = new UserController();

		List<User> userList = userController.listUsers();
		ArrayList<String> users = new ArrayList<String>();

		/**
		 * Table
		 */
		for (User user : userList) {
			users.add(Integer.toString(user.getId()));
			users.add(user.getName());
			users.add(Integer.toString(user.getAge()));
			users.add(user.getAddress());
		}

		List<List<String>> usersList = chopped(users, 4);

		/**
		 * Turns List into 2D array
		 */
		String[][] array = new String[usersList.size()][];
		for (int i = 0; i < usersList.size(); i++) {
			List<String> row = usersList.get(i);
			array[i] = row.toArray(new String[row.size()]);
		}

		String column[] = new String[] { "ID", "NAME", "AGE", "Address" };
		table = new JTable(array, column);
		table.setEnabled(false);
		scrollPane.setViewportView(table);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(252, 31, 98, 15);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i = idTextField.getText();
				try {
					int id = Integer.parseInt(i);
					User u = userController.getUser();
					System.out.println(u.getAge());
					// User user = userController.getUser(id);
					// nameTextField.setText(user.getName());
					// ageTextField.setText(Integer.toString(user.getAge()));
					// addressTextField.setText(user.getAddress());
				} catch (Exception error) {
					idTextField.setText("Give valid Input");
				}
			}
		});

		contentPane.add(btnSearch);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(23, 82, 55, 15);
		contentPane.add(lblAge);

		textField = new JTextField();
		textField.setBounds(80, 76, 324, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

	/**
	 * Chop array into sublist of length L
	 */
	static <T> List<List<T>> chopped(List<T> list, final int L) {
		List<List<T>> parts = new ArrayList<List<T>>();
		final int N = list.size();
		for (int i = 0; i < N; i += L) {
			parts.add(new ArrayList<T>(
					list.subList(i, Math.min(N, i + L))));
		}
		return parts;
	}
}
