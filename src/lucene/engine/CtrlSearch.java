package lucene.engine;

import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.util.ResourceBundle;
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


public class CtrlSearch implements Initializable {

	@FXML // fx:id="search_tab"
	private AnchorPane search_tab;
	
	@FXML // fx:id="query_str"
	private TextField query_str;
	
	/**
	 * Handle action related to click on search button
	 * 
	 * @param event
	 */
	@FXML
	private void searchInit(final ActionEvent event) {
		CtrlMyNews.searchInIndex("C:\\Users\\admin\\workspace\\LSD\\index", query_str.getText());
	}

	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {

	}

}
