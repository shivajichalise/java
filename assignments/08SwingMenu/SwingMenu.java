import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JDialog;
import javax.swing.JPopupMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.FlowLayout;

public class SwingMenu extends JFrame{
  
  public SwingMenu(){
    // Menu Bar
    JMenuBar menuBar = new JMenuBar();

    // Menu
    JMenu file, fileSubMenu, edit, view, open;
    file = new JMenu("File");
    edit = new JMenu("Edit");
    view = new JMenu("View");
    open = new JMenu("Open");
    fileSubMenu = new JMenu("New");
    
    //Menu Item
    JMenuItem save, close, newFile, newFolder, window, panel;
    
    newFile = new JMenuItem("File");
    newFolder = new JMenuItem("Folder");
    window = new JMenuItem("Window");
    panel = new JMenuItem("Panel");
    save = new JMenuItem("Save");
    close = new JMenuItem("Close");
    
    //Dialog
    JDialog openDialog = new JDialog(this, "Are you sure?", true);
    openDialog.setLayout(new FlowLayout());
    JButton noBtn = new JButton("No");

    noBtn.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e ){  
        openDialog.setVisible(false);  
      }
    });
    
    openDialog.add(new JLabel("This will close currently opened file!"));
    openDialog.add(new JButton("Yes"));
    openDialog.add(noBtn);
    openDialog.setSize(500,500);    
    openDialog.setVisible(false);  
    
    newFile.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){  
        openDialog.setVisible(true);  
      }
    });
    

    fileSubMenu.add(newFile);
    fileSubMenu.add(newFolder);
    file.add(fileSubMenu);
    file.add(save);
    file.add(close);

    view.add(window);
    view.add(panel);
    
    open.add(newFile);
    
    //Popup
    JPopupMenu popup;
    popup = new JPopupMenu("File");
    popup.add(save);
    popup.add(close);

    addMouseListener(new MouseAdapter(){
      public void mouseClicked(MouseEvent e) {              
        popup.show(getContentPane(), e.getX(), e.getY());  
      }
    });
    
    // Last
    menuBar.add(file);
    menuBar.add(edit);
    menuBar.add(view);
    menuBar.add(open);
    
    setJMenuBar(menuBar);
    add(popup);
    setSize(900, 900);
    setLayout(null);
    setVisible(true);
  }

  public static void main(String[] args){
    new SwingMenu();
  }
}
