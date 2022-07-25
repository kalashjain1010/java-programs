import javax.swing.JOptionPane;


public class gui {
        public static void main(String[] args){
        String name = JOptionPane.showInputDialog("your name");
        JOptionPane.showMessageDialog(null,"hello "+ name);
        
        //to use int
        int age = Integer.parseInt(JOptionPane.showInputDialog("your age"));
        JOptionPane.showMessageDialog(null,"your age is "+ age);
        
        //for double
        double height = Double.parseDouble(JOptionPane.showInputDialog("your height"));
        JOptionPane.showMessageDialog(null,"you are "+ height+" cm tall");
        }
}
 