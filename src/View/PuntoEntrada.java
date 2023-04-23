package View;
import Controllers.PuntoEntradaController;

import javax.swing.*;
import java.awt.*;
//PuntoEntrada es mi VISTA principal.
//JFRAME: recuadro principal
//JPANEL: componente del recuadro principal
public class PuntoEntrada extends JFrame{
    PuntoEntradaController controller;
    public PuntoEntrada() {
        //instancio controller
        controller= new PuntoEntradaController(this);
        //this.setLocationRelativeTo(null);//para que se centralice la ventana
        this.setVisible(true);
    }

    public void crearCuadrado(JPanel container) {
        this.add(container);
    }

}
