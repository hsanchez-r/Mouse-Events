package graficos;
import javax.swing.*;
import java.awt.event.*;
public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton mimarco = new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setBounds(700,300,600,450);
		setTitle("Eventos con el mouse");
		setVisible(true);
		
		EventosDeRaton miraton = new EventosDeRaton();
		
		addMouseListener(miraton);
		
	}
		
}

class EventosDeRaton extends MouseAdapter{

	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Acabas de hacer click");
		
	}
	
	
}
