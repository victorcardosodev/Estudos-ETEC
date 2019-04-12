
import javax.swing.JOptionPane;



public class Soma2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor"));
        double b=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor"));
        double c=0;
                c=a+b;
        JOptionPane.showMessageDialog(null,"a soma é:"+c);
    }
    
}
