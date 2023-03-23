import java.awt.FlowLayout;
  import java.awt.event.ActionListener;
  import java.awt.event.ActionEvent;
  import javax.swing.JFrame;
  import javax.swing.JButton;
  import javax.swing.Icon;
  import javax.swing.ImageIcon;
  import javax.swing.JOptionPane;
  
public class ButtonJFrame extends JFrame
{
     
    private JButton plainJButton; // botão apena s com texto
    private JButton fancyJButton; // botaõ com ícones 
    
    //buttonframe adiciona jbutton ao frame
    public ButtonJ Frame()
    {
       super( "Testing Buttons" );
       setLayout( new FlowLayout() );// configura o layout de frame
               
plainJButton = new JButton( "plain Button" );// botão com texto
add( plainJButton );// adiciona plainJButton ao jframe

Icon bug1 = new ImageIcon(getClass().getResource( "bug1.gif" ) );
Icon bug2 = new ImageIcon(getClass().getResource( "bug2.gif" ) );
fancyJButton = new JButton( " fancy Button", bug1 );
fancyJButton.setRolloverIcon( bug2 );
add(fancyJButton);
ButtonHandler handler = new ButtonHandler();
fancyJButton.addActionListener( handler );
plainJButton.addActionListener( handler );
   }
     
private class ButtonHandler implements ActionListener
}
public void actionPerformed(ActionEvent event)
{
 JOptionpane.showMessageDialog(ButtonFrame.this.String.forma
"you pressed:%s",event.getActionCommand() ) );
     import javax.swing.JFrame;
        public class ButtonTest
        {
            public static void main(String[ args )
            {
                ButtonFrame buttonFrame = new ButtonFrame();
                buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                buttonFrame.setSize( 275,110 );
                buttonFrame.setVisible( true );
            }
        }
            
        
}
