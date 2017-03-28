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

	
	@FXML
	private WebView myWebView;
	
	@FXML
	private Button practiceTests;
	@FXML
	private Button videos;
	@FXML
	private Button strategies;
	@FXML
	private ChoiceBox<String> choicePicker;
	
	private Main mainApp;
	
	//Constructor that is empty
	public AMCViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	@FXML
	private void handlePractice(){
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://artofproblemsolving.com/wiki/index.php/AMC_12_Problems_and_Solutions");			
	}
	
	@FXML
	private void handleVideos(){
		choicePicker.setItems(FXCollections.observableArrayList( "Art of Problem Solving", "Walt S"));
			  
		
		choicePicker.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		      @Override
		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
		        
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
	
	
	@FXML
	private void handleStrategy() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("http://artofproblemsolving.com/wiki/index.php/How_should_I_prepare%3F");			
	}
	
	
	public void setMainApp(Main mainApp) {
    	
		//This sets the field for this controller to the application passed in:  
		//This allows the main application to have a pointer to itself by setting its own pointer into the controller's field
		this.mainApp = mainApp;
	}
}
