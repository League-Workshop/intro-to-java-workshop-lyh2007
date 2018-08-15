package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog("what is your name?");
 JOptionPane.showMessageDialog(null,"Hello beautiful " + name);
 String name1 = JOptionPane.showInputDialog("do you like coffe and lattes?");
 JOptionPane.showMessageDialog(null, name1);
 String name2 = JOptionPane.showInputDialog("Do you like Swedish Fish?");
 JOptionPane.showMessageDialog(null, name2);
}
}
