package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


public class AMCViewController {

	//creates a web view
	@FXML
	private WebView myWebView;
	
	//buttons for the view
	@FXML
	private Button practiceTests;
	@FXML
	private Button videos;
	@FXML
	private Button strategies;
	//choice box for the view
	@FXML
	private ChoiceBox<String> choicePicker;
	
	//creates a variable that is used to reference the main class
	private Main mainApp;
	
	//Constructor that is empty
	public AMCViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	//method to open a web page when the Practice button is clicked
	/**
	 * @param event
	 * @exception IO exception
	 * Loads the practice tests for the AMC exam
	*/
	@FXML
	public void handlePractice(){
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://artofproblemsolving.com/wiki/index.php/AMC_12_Problems_and_Solutions");			
	}
	
	//method which inputs choices into the choice box when the user clicks on the choice box
	/**
	 * @param event
	 * @exception IO exception
	 * Sets items to a choice box and loads the conceptual videos for the AMC exam
	*/
	@FXML
	public void initialize(){
		choicePicker.setItems(FXCollections.observableArrayList(  Main.amc1.getItemName(), Main.amc2.getItemName()));//sets the items into the choice box
		
		//creates an index for the options in the choice box and adds an event listener
		choicePicker.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		     
			//loads the corresponding webpage for the option selected
			  @Override
		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				//the options selected is switched
		    	  switch (choicePicker.getItems().get((Integer) number2)) {
		    	  			    	
		    	  case "Art of Problem Solving" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("https://www.youtube.com/user/ArtofProblemSolving/videos");	
		    	  				break;
		    	  			 }
		    	  case "Walt S" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("https://www.youtube.com/channel/UC7KSSynUiuMhsDVf9tS8qtQ/videos");	
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
	 * Loads the strategies for the AMC exam
	*/
	@FXML
	public void handleStrategy() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("http://artofproblemsolving.com/wiki/index.php/How_should_I_prepare%3F");			
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
