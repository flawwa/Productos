package dad.productos.listar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class ProductosController implements Initializable{
	
	// actions 
	
	private EventHandler<ActionEvent> onBack;
	
    @FXML
    private TableColumn<?, ?> codigoColumn;

    @FXML
    private TableColumn<?, ?> congeladoColumn;

    @FXML
    private TableColumn<?, ?> denoColumn;

    @FXML
    private TableColumn<?, ?> familiaColumn;

    @FXML
    private TableColumn<?, ?> observaColumn;

    @FXML
    private TableColumn<?, ?> precioColumn;

    @FXML
    private TableView<?> productsTable;

    @FXML
    private BorderPane view;
    
    
    public ProductosController() {
    	try { 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/TablaProductosView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    }
    
    public BorderPane getView() {
    	return view;
    }
    
    @FXML
    void onBack(ActionEvent event) {
    	
    }
    
    @FXML
    void onCancelar(ActionEvent event) {
    	System.out.println("cancelar");
    	if (onBack != null) onBack.handle(event);
    }
    
    @FXML
    void onGuardar(ActionEvent event) {
    	System.out.println("guardar");
    	if (onBack != null) onBack.handle(event);
    }

    public void setOnBack(EventHandler<ActionEvent> onBack) {
    	this.onBack = onBack;
    }

}

