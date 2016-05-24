package lucene;

import java.util.Map;

import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;

public class Results {

	public final static String DEFAULT_TITLE_INFO = "Information Dialog";
	public final static String DEFAULT_HEADER_INFO = "The process is completed successfully";
	public final static String DEFAULT_LABEL_INFO = "label";

	public final static String DEFAULT_TITLE_ERR = "Error Dialog";
	public final static String DEFAULT_HEADER_ERR = "Look, an Error Dialog";
	public final static String DEFAULT_LABEL_ERR = "label";

	public final static String DEFAULT_NOTE = "During the process the folowing messages were received:";

	private boolean status = false;
	
	private String title = null;
	private String header = null;
	private String note = null;
	private String mes = null;
	
	private boolean isExpandable = true;

	public void showResults(Map<String, String> args) {
		
		for (Map.Entry<String, String> pair : args.entrySet())
        {
			if(pair.getKey().equals("-status")) {
				status = Boolean.parseBoolean(pair.getValue());
			} else if (pair.getKey().equals("-title")) {
				title = pair.getValue();
			} else if (pair.getKey().equals("-header")) {
				header = pair.getValue();
			} else if (pair.getKey().equals("-note")) {
				note = pair.getValue();
			} else if (pair.getKey().equals("-mes")) {
				mes = pair.getValue();
			} else if (pair.getKey().equals("-isexpanadable")) {
				isExpandable = Boolean.parseBoolean(pair.getValue());
			}

        }

		if (status == true) {
			title = (title != null && !title.isEmpty()) ? title : DEFAULT_TITLE_INFO;
			header = (header != null && !header.isEmpty()) ? header : DEFAULT_HEADER_INFO;

		} else {
			title = (title != null && !title.isEmpty()) ? title : DEFAULT_TITLE_ERR;
			header = (header != null && !header.isEmpty()) ? header : DEFAULT_HEADER_ERR;
		}

		note = (note != null && !note.isEmpty()) ? note : DEFAULT_NOTE;
		
		Alert alert = new Alert((status == true) ? AlertType.INFORMATION : AlertType.ERROR);

		alert.setTitle(title);
		alert.setHeaderText(header);

		TextArea textArea = new TextArea(mes);
		textArea.setEditable(false);
		textArea.setWrapText(true);

		GridPane gpContent = new GridPane();
		gpContent.add(textArea, 0, 0);

		if (isExpandable == true) {
			alert.setContentText(note);
			alert.getDialogPane().setExpandableContent(gpContent);
		} else {
			alert.getDialogPane().setContent(gpContent);
		}

		alert.showAndWait();

	}

}
