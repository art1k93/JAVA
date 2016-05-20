package lucene;

import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import lucene.engine.CtrlIndex;
import lucene.engine.CtrlMyNews;
import lucene.engine.CtrlSearch;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class Main extends Application implements EventHandler<ActionEvent> {	

	public static final String TASK_BAR_IMAGE_PATH = "https://pbs.twimg.com/profile_images/3539682071/dadc2e535d4cdb2f79ed9278d9f1a3df_400x400.jpeg";
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			primaryStage.setTitle("LSD");
			primaryStage.getIcons().add(new Image(TASK_BAR_IMAGE_PATH));
			Parent layout = FXMLLoader.load(new URL(getClass().getResource("view/mainform.fxml").toExternalForm()));
			primaryStage.setScene(new Scene(layout));
			primaryStage.show();

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
