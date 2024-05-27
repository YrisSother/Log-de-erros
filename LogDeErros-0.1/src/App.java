import java.util.logging.Logger;
import java.util.logging.Level;

public class App {
    public static void main(String[] args) throws Exception {
        private final static Logger LOGGER = Logger.getLogger(App.class.getName());

        try {

            throw new Exception("Um erro ocorreu!");

        } catch (Exception e) {

            LOGGER.log(Level.SEVERE, "Erro capturado", e);
        }
    }
}
