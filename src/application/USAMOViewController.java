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
	
	//creates a web view
	@FXML
	private WebView myWebView;
	
	//creates buttons for the fxml file
	@FXML
	private Button practiceTests;
	@FXML
	private Button videos;
	@FXML
	private Button strategies;
	
	//creates a variable that is used to reference to the main class
	private Main mainApp;
	
	//Constructor that is empty
	public USAMOViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	//method which opens a webpage in a web view when the button called Practice is clicked
	/*
	 @param
	 @exception
	 @return
	 */
	@FXML
	private void handlePractice(){
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://artofproblemsolving.com/wiki/index.php/USAMO_Problems_and_Solutions");			
	}
	
	//method which opens a webpage in a web view when the button called Learn is clicked
	/*
	 @param
	 @exception
	 @return
	 */
	@FXML
	private void handleVideos() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://www.youtube.com/playlist?list=PLa8j0YHOYQQIpg8wQ-_uyD22iuJeBFq-H");			
	}
	
	//method which opens a webpage in a web view when the button called Strategize is clicked
	/*
	 @param
	 @exception
	 @return
	 */
	@FXML
	private void handleStrategy() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("http://artofproblemsolving.com/wiki/index.php/Resources_for_mathematics_competitions#Beginning_Olympiad_Preparation");			
	}
	
	/*
	 @param
	 @exception
	 @return
	 */
	public void setMainApp(Main mainApp) {
    	
		//This sets the field for this controller to the application passed in:  
		//This allows the main application to have a pointer to itself by setting its own pointer into the controller's field
		this.mainApp = mainApp;
	}
}
