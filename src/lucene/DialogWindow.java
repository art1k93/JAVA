package lucene;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class DialogWindow {

	public static String TASK_BAR_IMAGE_PATH = "https://pbs.twimg.com/profile_images/3539682071/dadc2e535d4cdb2f79ed9278d9f1a3df_400x400.jpeg";

	public static Stage create(String window_Title, String tpl_path, String tb_img_path) throws Exception {
		
		tb_img_path = (tb_img_path == null) ? TASK_BAR_IMAGE_PATH : tb_img_path ;
		
		Stage newDW = new Stage();
		
		newDW.setTitle(window_Title);
		newDW.getIcons().add(new Image(tb_img_path));
		Parent layout = FXMLLoader.load(new URL(DialogWindow.class.getResource(tpl_path).toExternalForm()));
		newDW.setScene(new Scene(layout));

		return newDW;

	}

}
