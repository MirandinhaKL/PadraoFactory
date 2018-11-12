package testeformas;

import PadraoFactory.FabricaDeFormas;
import PadraoFactory.Forma;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * @author kmiranda
 */
public class FXMLDocumentController implements Initializable {
    
    FabricaDeFormas fabricaDeFormas = new FabricaDeFormas();
    
    @FXML
    private Rectangle retangulo;

    @FXML
    private Circle circulo;
    
    @FXML
    private Rectangle quadrado;

    @FXML
    private Label labelTexto;

    @FXML
    private void handleBtnCriarRetangulo(ActionEvent event) {
        apagaFormaAnterior();
        Forma forma2 = fabricaDeFormas.makeForma("RETANGULO");
        labelTexto.setText(forma2.desenhaForma());
        retangulo.setVisible(true);
    }

    @FXML
    private void handleBtnCriarCirculo(ActionEvent event) {
        apagaFormaAnterior();
        Forma forma1 = fabricaDeFormas.makeForma("CIRCULO");
        labelTexto.setText(forma1.desenhaForma());
        circulo.setVisible(true);
    }

    @FXML
    private void handleBtnCriarQuadrado(ActionEvent event) {
        apagaFormaAnterior();
        Forma forma3 = fabricaDeFormas.makeForma("QUADRADO");
        labelTexto.setText(forma3.desenhaForma());
        quadrado.setVisible(true);
    }
    
    public void apagaFormaAnterior(){
        retangulo.setVisible(false);
        quadrado.setVisible(false);
        circulo.setVisible(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
