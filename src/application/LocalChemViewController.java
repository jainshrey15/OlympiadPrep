package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class LocalChemViewController {

	@FXML
	private WebView myWebView;
	@FXML
	private Button videos;
	
	@FXML
	private ChoiceBox<String> choicePicker;
	
	private Main mainApp;
	
	//Constructor that is empty
	public LocalChemViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	@FXML
	private void handlePracticeC(){
		choicePicker.setItems(FXCollections.observableArrayList(
			    "LCO 2016", "LCO 2015", "LCO 2014", "LCO 2013", 
			    "LCO 2012", "LCO 2011", "LCO 2010", "LCO 2009", 
			    "LCO 2008", "LCO 2007")
			);
		
		
		choicePicker.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		      @Override
		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
		        
		    	  switch (choicePicker.getItems().get((Integer) number2)) {
		    	  			    	
		    	  case "LCO 2016" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2016-usnco-local-exam.pdf");	
		    	  				break;
		    	  			 }
		    	  case "LCO 2015" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2015-usnco-local-exam.pdf");	
		    	  				break;
		    	  			 }
		    	  case "LCO 2014" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2014-usnco-local-exam.pdf");	
    	  				break;
    	  			 }
		    	  case "LCO 2013" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2013-olympiad-exam.pdf");	
		    	  				break;
		    	  			 }
		    	  
		    	  case "LCO 2012" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2012-local-olympiad-exam.pdf");	
    	  				break;
    	  			 }
		    	  case "LCO 2011" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2011-local-olympiad-exam.pdf");	
		    	  				break;
		    	  			 }
		    	  case "LCO 2010" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2010-local-olympiad-exam.pdf");	
    	  				break;
    	  			 }
		    	  case "LCO 2009" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2009-local-olympiad-exam.pdf");	
		    	  				break;
		    	  			 }
		    	  case "LCO 2008" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2008-local-olympiad-exam.pdf");	
		    	  				break;
		    	  			 }
		    	  case "LCO 2007" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2007-local-olympiad-exam.pdf");	
		    	  				break;
		    	  			 }
		    	  }
		      }
		    });
	}
	
	@FXML
	private void handleVideos() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://www.youtube.com/playlist?list=PLVqkjsKI25jyqiW-GtjnpVv5BtYy1aRB_");			
	}
	
	
	
	public void setMainApp(Main mainApp) {
    	
		//This sets the field for this controller to the application passed in:  
		//This allows the main application to have a pointer to itself by setting its own pointer into the controller's field
		this.mainApp = mainApp;
	}
}
