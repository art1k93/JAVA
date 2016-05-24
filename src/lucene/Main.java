package lucene;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {	
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			DialogWindow.create("LSD", "view/main_form.fxml", null).show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {

	}

}
