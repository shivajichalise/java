import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.util.List;
import java.util.ArrayList;
import models.User;

import javax.swing.JButton;

class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField emailTextField;
	private JTable table;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	private JScrollPane scrollPane;

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("CRUD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(12, 12, 55, 15);

		contentPane.add(lblId);

		idTextField = new JTextField();
		idTextField.setEditable(false);
		idTextField.setBounds(80, 10, 322, 19);
		idTextField.setColumns(10);

		contentPane.add(idTextField);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(12, 38, 55, 15);

		contentPane.add(lblName);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(12, 65, 55, 15);

		contentPane.add(lblEmail);

		nameTextField = new JTextField();
		nameTextField.setBounds(80, 36, 322, 19);
		nameTextField.setColumns(10);

		contentPane.add(nameTextField);

		emailTextField = new JTextField();
		emailTextField.setBounds(80, 63, 322, 19);
		emailTextField.setColumns(10);

		contentPane.add(emailTextField);

		btnAdd = new JButton("Add");
		btnAdd.setBounds(57, 92, 98, 25);

		contentPane.add(btnAdd);

		btnEdit = new JButton("Edit");
		btnEdit.setBounds(184, 92, 98, 25);

		contentPane.add(btnEdit);

		btnDelete = new JButton("Delete");
		btnDelete.setBounds(316, 92, 98, 25);

		contentPane.add(btnDelete);

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

		String[][] array = new String[usersList.size()][];
		for (int i = 0; i < usersList.size(); i++) {
			List<String> row = usersList.get(i);
			array[i] = row.toArray(new String[row.size()]);
		}

		String column[] = new String[] { "ID", "NAME", "AGE", "Address" };
		table = new JTable(array, column);
		table.setBounds(12, 126, 416, 132);
		table.setEnabled(false);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 154, 433, 135);
		scrollPane.setViewportView(table);

		contentPane.add(scrollPane);

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
