import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazProyectoFinal PRIMER = new InterfazProyectoFinal();
                PRIMER.setBounds(500,250,900,600);
                PRIMER.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                PRIMER.setContentPane(PRIMER.panelPrincipal);
                PRIMER.setVisible(true);
            }
        });

    }
}