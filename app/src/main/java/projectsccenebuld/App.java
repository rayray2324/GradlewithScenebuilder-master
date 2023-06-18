package projectsccenebuld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
	
    public static void main(String[] args) {
    	launch();
    }
    
	@Override
	public void start(Stage palco) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("minhatela.fxml"));
		
		Scene scene = new Scene(root, 300,275);
		
		palco.setTitle("FXML welcome");
		palco.setScene(scene);
		palco.show();
	}
}
