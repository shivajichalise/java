import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFrame;

class MenuExample extends JFrame {
  MenuExample() {
    JMenuBar menubar = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenu subMenu = new JMenu("Sub Menu");
    JMenuItem i1, i2, s1, s2;

    i1 = new JMenuItem("Menu Item1");
    i2 = new JMenuItem("Menu Item2");
    s1 = new JMenuItem("Submenu item 1");
    s2 = new JMenuItem("Submenu item 2");

    menu.add(i1);
    menu.add(i2);

    subMenu.add(s1);
    subMenu.add(s2);
    menu.add(subMenu);

    menubar.add(menu);

    menubar.add(menu);
    setJMenuBar(menubar);
    setSize(400, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new MenuExample();
  }
}
