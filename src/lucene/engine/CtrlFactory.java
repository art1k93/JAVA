package lucene.engine;

import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class CtrlFactory implements Initializable {

	@FXML // fx:id="main_tabpane"
	private TabPane main_tabpane; 
	
	@FXML // fx:id="search_tab"
	private Tab search_tab;
	
	@FXML // fx:id="index_tab"
	private Tab index_tab;

	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {

	}

}
