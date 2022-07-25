import javax.swing.JOptionPane;

public class math {
    
 public static void main(String[] args) {
  
     
  double z;
  
  double x = Double.parseDouble(JOptionPane.showInputDialog("x: "));
  double y = Double.parseDouble(JOptionPane.showInputDialog("y: "));
  
  z = Math.sqrt((x*x)+(y*y));

  
  JOptionPane.showMessageDialog(null,"The hypotenuse is : "+z);

 }
}
/*Math.max(x,y)-->gives maximum value out of 2
Math.min(x,y)
Math.abs(y)  --> give absolute value like 3.14->3.0
Math.sqrt(x) --> square root
Math.round(x) --> round the no.  3.14 --> 3.0, 3.66->4.0
Math.ceil(x) --> round it to up 3.2 --> 4
Math.floor(x) -->round it to down -> 3.7-. 3.0
*/