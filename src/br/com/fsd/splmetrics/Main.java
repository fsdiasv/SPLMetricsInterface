package br.com.fsd.splmetrics;

import java.io.IOException;

import br.com.fsd.splmetrics.view.ResultsController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Main extends Application {

	public static Scene scene;
    @Override
    public void start(Stage stage) throws Exception {
    	Parent root = FXMLLoader.load(getClass().getResource("view/ProjectSelection.fxml"));
        
    	scene = new Scene(root);
    
        stage.setTitle("SPL Metrics");
        stage.setScene(scene);
        stage.show();
    }
    

    /**
     * Abre uma janela para editar detalhes para a pessoa especificada. Se o usuário clicar
     * OK, as mudanças são salvasno objeto pessoa fornecido e retorna true.
     * 
     * @param person O objeto pessoa a ser editado
     * @return true Se o usuário clicou OK,  caso contrário false.
     */
    public static boolean showResultsDialog() {
        try {
            // Carrega o arquivo fxml e cria um novo stage para a janela popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Results.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            // Cria o palco dialogStage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("SPL Metrics Results");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Mostra a janela e espera até o usuário fechar.
            dialogStage.showAndWait();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}