package testeformas;

import PadraoFactory.FabricaDeFormas;
import PadraoFactory.Forma;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author kmiranda
 */
public class TesteFormas extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Padrão de projeto Factory");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
//        //Criamos o fabricante de formas.
//        FabricaDeFormas fabricaDeFormas = new FabricaDeFormas();
//
//        //O fabricante de formas cria os objetos da forma desejada;
//        Forma forma1 = fabricaDeFormas.makeForma("CIRCULO");
//        Forma forma2 = fabricaDeFormas.makeForma("RETANGULO");
//        Forma forma3 = fabricaDeFormas.makeForma("QUADRADO");
//
//        //Acessando os métodos criados para cada tipo de forma.
//        forma1.desenhaForma();
//        forma2.desenhaForma();
//        forma3.desenhaForma();
    }
}
