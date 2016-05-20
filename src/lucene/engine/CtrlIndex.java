package lucene.engine;

import java.io.File;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class CtrlIndex implements Initializable {

	private final StringProperty index_dir = new SimpleStringProperty(this, "index_dir", "");
	private final StringProperty dir_to_index = new SimpleStringProperty(this, "dir_to_index", "");

	@FXML // fx:id="index_tab"
	private AnchorPane index_tab;

	@FXML // fx:id="index_dir_path"
	private TextField index_dir_path;

	@FXML // fx:id="dir_to_index_path"
	private TextField dir_to_index_path;

	/**
	 * Handle action related to click on the button that gets the possibility to
	 * set a directory in which an index will be saved
	 * 
	 * @param event
	 */
	@FXML
	private void setIndexDir(final ActionEvent event) {

		DirectoryChooser dc = new DirectoryChooser();

		File selectedDir = dc.showDialog(new Stage());

		if (selectedDir == null) {
			index_dir_path.setText("No Directory selected");
		} else {
			index_dir_path.setText(selectedDir.getAbsolutePath());
			index_dir.set(index_dir_path.getText());
		}
	}

	/**
	 * Handle action related to click on the button that gets the possibility to
	 * set a directory which text files will be added to index
	 * 
	 * @param event
	 */
	@FXML
	private void setDirToIndex(final ActionEvent event) {

		DirectoryChooser dc = new DirectoryChooser();
		File selectedDir = dc.showDialog(new Stage());

		if (selectedDir == null) {
			dir_to_index_path.setText("No Directory selected");
		} else {
			dir_to_index_path.setText(selectedDir.getAbsolutePath());
			dir_to_index.set(dir_to_index_path.getText());
		}
	}

	/**
	 * Handle action related to click on the button that gets the possibility to
	 * create or to update an index
	 * 
	 * @param event
	 */
	@FXML
	private void indexInit(final ActionEvent event) {
		CtrlMyNews.addToIndex(index_dir.get(), dir_to_index.get());
	}

	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {

	}

}
