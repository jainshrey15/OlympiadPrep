package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class AIMEViewController {

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
	//creates a choice box for the fxml file
	@FXML
	private ChoiceBox<String> choicePicker;
	
	//creates a variable that is used to reference to the main class
	private Main mainApp;
	
	//Constructor that is empty
	public AIMEViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	//method which opens a webpage in a web view when the button called Practice is clicked
	
	/**
	 * @param event
	 * @exception IO exception
	 * Loads the practice tests for the AIME
	*/
	@FXML
	public void handlePractice(){
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://artofproblemsolving.com/wiki/index.php/AIME_Problems_and_Solutions");			
	}
	
	//method which inputs choices into the choice box when the user clicks on the choice box

	
	/**
	 * @param event
	 * @exception IO exception
	 * Loads the conceptual videos for the AIME exam
	*/
	@FXML
	public void initialize(){
		
		//sets the items into the choice box
		choicePicker.setItems(FXCollections.observableArrayList(
				 Main.amc1.getItemName(), Main.aime1.getItemName()));
		
		//creates an index for the options in the choice box and adds an event listener
		choicePicker.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		     
			//loads the corresponding webpage for the option selected
			  @Override
		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
		        //the options selected is switched
		    	  switch (choicePicker.getItems().get((Integer) number2)) {
		    			    	
		    	  case "Art of Problem Solving" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("https://www.youtube.com/playlist?list=PLqviylkZszITz4PCC78AhOXa6xl_c8qF6");	
		    	  				break;
		    	  			 }
		    	  case "Concepts" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("https://www.youtube.com/user/CyclicSquares/playlists");	
		    	  				break;
		    	  			 }
		    	  }
		      }
		    });
	}
	
	//loads the webpage in a web view when the Strategy button is clicked
	
	/**
	 * @param event
	 * @exception IO exception
	 * Loads the strategies for the AIME
	*/
	@FXML
	public void handleStrategy() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("http://artofproblemsolving.com/wiki/index.php/Resources_for_mathematics_competitions#AIME_Preparation");			
	}
	
	
	public void setMainApp(Main mainApp) {
    	
		//This sets the field for this controller to the application passed in:  
		//This allows the main application to have a pointer to itself by setting its own pointer into the controller's field
		this.mainApp = mainApp;
	}
	
}
