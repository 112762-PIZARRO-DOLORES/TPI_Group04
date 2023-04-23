package Controllers;

import View.PuntoEntrada;
import javax.swing.*;
import java.awt.*;

public class PuntoEntradaController {
    //Prepara el diseño y se lo manda a la vista.
    private PuntoEntrada vista;
    private JButton [][] squares;
    //constructor del controller recibe una ventana completa como param
    public PuntoEntradaController(PuntoEntrada puntoEntrada) {
        //la ventana que se pasó completa la asigno a la vista del controlador. Queda asi asociado el controlador a la vista.
        this.vista=puntoEntrada;
        this.squares=squares;
        this.iniciarTablero();
    }

    private void iniciarTablero() {
        squares=new JButton[9][9];
        String laters= " ABCDEFGH";
        JPanel container=new JPanel(new GridLayout(9,9));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JButton button=new JButton();
                //si la posicion del button es paralela a una diagonal lo cambia de color
                if((i+j)%2==0){
                    button.setBackground(Color.GRAY);
                }
                //para teñir la columna izquierda amarilla
                if(i<8 && j==0){
                    int columna = (i-8)*-1;
                    button.setText(String.valueOf(columna));
                    button.setBackground(Color.YELLOW);
                    button.setEnabled(false);
                }
                //para teñir la fila inf. amarilla
                if(i==8){
                    String later = laters.substring(j, j+1);
                button.setText(later);
                button.setBackground(Color.YELLOW);
                button.setEnabled(false);
                }
                container.add(button);
            }
        }
        vista.crearCuadrado(container);
    }
}
