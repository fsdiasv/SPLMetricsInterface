package br.com.fsd.splmetrics.view;


import br.com.fsd.splmetrics.Main;
import br.com.fsd.splmetrics.ReadXML;
import br.com.fsd.splmetrics.metrics.NoF;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ResultsController {
    @FXML
    private Label fTotalLabel;
    @FXML
    private Label fAbstractsLabel;
    @FXML
    private Label fConcretesLabel;
    
    // Reference to the main application.
    private Main mainApp;

    /**
     * O construtor.
     * O construtor é chamado antes do método inicialize().
     */
    public ResultsController() {

    	ReadXML raiz = new ReadXML("model.xml");
		NoF.setTotalFeatures(raiz.getRaiz());
		
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        fTotalLabel.setText(String.valueOf(NoF.getTotalFeatures()));
        fAbstractsLabel.setText(String.valueOf(NoF.getAbstractsFeatures()));
        fConcretesLabel.setText(String.valueOf(NoF.getConcretesFeatures()));

    }
    
    

    /**
     * É chamado pela aplicação principal para dar uma referência de volta a si mesmo.
     * 
     * @param mainApp
     */
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;

    }
}