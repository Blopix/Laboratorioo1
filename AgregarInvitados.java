
import static java.lang.System.out;
import javax.swing.JOptionPane;

public class AgregarInvitados {

    public static void main(String[] args) {
        int VectorInvitados[];
        String respuesta;
        VectorInvitados = new int[10];

        //Inicializamos el vector
        for (int Numcuartos = 0; Numcuartos < 10; Numcuartos++) {
            VectorInvitados[Numcuartos] = 0;
        }
        do {
            int habitacion = Integer.parseInt(JOptionPane.showInputDialog("Digite"
                    + " por favor el Numero de Cuarto"));
            int numInvitados = Integer.parseInt(JOptionPane.showInputDialog("Cuantos"
                    + " Huespedes?"));
            VectorInvitados[habitacion] = numInvitados;
            out.println();
            respuesta = JOptionPane.showInputDialog("Desea Continuar?");
        } while (respuesta.charAt(0) == 'Y');
        out.println();
        out.println("Cuartos\tHuespedes");

        for (int NumCuarto = 0; NumCuarto < 10; NumCuarto++) {
            out.print(NumCuarto);
            out.print("\t");
            out.println(VectorInvitados[NumCuarto]);
        }//Hola mundo
    }
}
//Como estan?
