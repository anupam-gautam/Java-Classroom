import java.awt.*;
import java.awt.event.*;

public class ItemEventExample extends Frame implements ItemListener {

   private Checkbox checkbox1, checkbox2;

   public ItemEventExample() {
      checkbox1 = new Checkbox("Checkbox 1");
      checkbox2 = new Checkbox("Checkbox 2");

      add(checkbox1);
      add(checkbox2);

      checkbox1.addItemListener(this);
      checkbox2.addItemListener(this);

      setTitle("Item Event Example");
      setSize(300, 200);
      setVisible(true);
   }

   public void itemStateChanged(ItemEvent e) {
      if (e.getSource() == checkbox1) {
         System.out.println("Checkbox 1 state changed");
      } else if (e.getSource() == checkbox2) {
         System.out.println("Checkbox 2 state changed");
      }
   }

   public static void main(String[] args) {
      new ItemEventExample();
   }
}
