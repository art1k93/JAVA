package lucene.engine;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;

public class CtrlMenu implements Initializable {

	@FXML // fx:id="menuBar"
	private MenuBar menuBar;

	/**
	 * Handle action related to "New" menu item.
	 * 
	 * @param event
	 * Event on "New" menu item.
	 */
	@FXML
	private void handleNewAction(final ActionEvent event) {
		CtrlMyNews.create();
	}
	
	/**
	 * Handle action related to "Open" menu item.
	 * 
	 * @param event
	 * Event on "Open" menu item.
	 */
	@FXML
	private void handleOpenAction(final ActionEvent event) {
		CtrlMyNews.open();
	}
	
	/**
	 * Handle action related to "Save" menu item.
	 * 
	 * @param event
	 * Event on "Save" menu item.
	 */
	@FXML
	private void handleInsertAction(final ActionEvent event) {
		try {
			CtrlMyNews.insert();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	/**
	 * Handle action related to "Save" menu item.
	 * 
	 * @param event
	 * Event on "Save" menu item.
	 */
	@FXML
	private void handleSaveAction(final ActionEvent event) {
		CtrlMyNews.save();
	}
	
	/**
	 * Handle action related to "Delete" menu item.
	 * 
	 * @param event
	 * Event on "Delete" menu item.
	 */
	@FXML
	private void handleDeleteAction(final ActionEvent event) {
		CtrlMyNews.delete();
	}
	
	/**
	 * Handle action related to "Show" menu item.
	 * 
	 * @param event
	 * Event on "Show" menu item.
	 */
	@FXML
	private void handleShowAction(final ActionEvent event) {
		CtrlMyNews.show();
	}
	
	/**
	 * Handle action related to "Exit" menu item.
	 * 
	 * @param event
	 * Event on "Exit" menu item.
	 */
	@FXML
	private void handleExitAction(final ActionEvent event) {
		System.exit(0);
	}

	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
		menuBar.setFocusTraversable(true);
	}
	
}
