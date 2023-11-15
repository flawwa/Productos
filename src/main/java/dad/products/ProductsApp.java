package dad.products;

import dad.productos.menu.MenuController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProductsApp extends Application{
	
	private MenuController mainController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		mainController = new MenuController();
		
		primaryStage.setTitle("Productos");
		primaryStage.setScene(new Scene(mainController.getView(), 800, 600));
		primaryStage.show();
		
		primaryStage.minWidthProperty().bind(mainController.getView().prefWidthProperty());
		primaryStage.minHeightProperty().bind(mainController.getView().prefHeightProperty());
	}
}
