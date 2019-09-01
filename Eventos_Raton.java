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
		addMouseMotionListener(miraton);
		
	}
		
}

class EventosDeRaton extends MouseAdapter implements MouseMotionListener{

	/*public void mouseClicked(MouseEvent e) {
		
		System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		
		System.out.println("Este es el numero de veces que has hecho click: " + e.getClickCount());
		
		
	}*/
	
	public void mousePressed(MouseEvent e) {
		
		//to know which mouse button have been pressed by the user
		
		int boton1 = MouseEvent.BUTTON1_DOWN_MASK; //remember that MouseEvent class extends from InputEvent class (check Java API for further reference)
		int boton2 = MouseEvent.BUTTON3_DOWN_MASK;
		
		if(e.getModifiersEx() == boton1) {
			
			System.out.println("Usted ha presionado el boton izquierdo del mouse");
			
		} else if(e.getModifiersEx() == boton2) {
			
			System.out.println("Usted ha presionado el  boton derecho del mouse");
			
		}
		
		//didn't use public static final int BUTTON2_DOWN_MASK because I'm working from my laptop
		
		
	}
	
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Estas arrastrando");
		
	}
	
	public void mouseMoved(MouseEvent e) {
		
		System.out.println("Estas moviendo");
		
	}
	
	
}

