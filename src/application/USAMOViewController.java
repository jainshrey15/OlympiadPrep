package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class USAMOViewController {
	
	@FXML
	private WebView myWebView;
	
	@FXML
	private Button practiceTests;
	@FXML
	private Button videos;
	@FXML
	private Button strategies;
	
	private Main mainApp;
	
	//Constructor that is empty
	public USAMOViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	@FXML
	private void handlePractice(){
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://artofproblemsolving.com/wiki/index.php/USAMO_Problems_and_Solutions");			
	}
	
	@FXML
	private void handleVideos() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://www.youtube.com/playlist?list=PLa8j0YHOYQQIpg8wQ-_uyD22iuJeBFq-H");			
	}
	
	@FXML
	private void handleStrategy() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("http://artofproblemsolving.com/wiki/index.php/Resources_for_mathematics_competitions#Beginning_Olympiad_Preparation");			
	}
	
	
	public void setMainApp(Main mainApp) {
    	
		//This sets the field for this controller to the application passed in:  
		//This allows the main application to have a pointer to itself by setting its own pointer into the controller's field
		this.mainApp = mainApp;
	}
}
