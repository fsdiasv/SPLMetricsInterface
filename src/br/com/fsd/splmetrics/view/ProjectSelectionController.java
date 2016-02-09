package br.com.fsd.splmetrics.view;

import br.com.fsd.splmetrics.Main;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ProjectSelectionController {
	/**
	 * Executado ao clica no botão Apply do Dialog ProjectSelection
	 * 
	 */
	@FXML
	private void handleApplyMetrics() {
	    
	    boolean okClicked = Main.showResultsDialog();
	    if (okClicked) {
	    	//fechar o anterior
	    }
	}
}
