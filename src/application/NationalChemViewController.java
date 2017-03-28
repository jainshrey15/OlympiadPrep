package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class NationalChemViewController {
	
	
	@FXML
	private WebView myWebView;
	@FXML
	private Button videos;
	
	@FXML
	private ChoiceBox<String> choicePicker;
	
	private Main mainApp;
	
	//Constructor that is empty
	public NationalChemViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	@FXML
	private void handlePracticeC(){
		choicePicker.setItems(FXCollections.observableArrayList(
			    "NCO 2016 Part I", "NCO 2016 Part II", "NCO 2016 Part III", "NCO 2015 Part I", 
			    "NCO 2015 Part II", "NCO 2015 Part III", "NCO 2014 Part I", "NCO 2014 Part II", 
			    "NCO 2014 Part III", "NCO 2013 Part I", "NCO 2013 Part II", "NCO 2013 Part III")
			);
		
		
		choicePicker.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		      @Override
		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
		        
		    	  switch (choicePicker.getItems().get((Integer) number2)) {
		    	  			    	
		    	  case "NCO 2016 Part I" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2016-usnco-exam-part-i.pdf");	
		    	  				break;
		    	  			 }
		    	  case "NCO 2016 Part II" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2016-usnco-exam-part-ii.pdf?logActivity=true");	
		    	  				break;
		    	  			 }
		    	  case "NCO 2016 Part III" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2016-usnco-exam-part-iii.pdf?logActivity=true");	
    	  				break;
    	  			 }
		    	  case "NCO 2015 Part I" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/2015-usnco-exam-part-i.pdf");	
		    	  				break;
		    	  			 }
		    	  
		    	  case "NCO 2015 Part II" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/2015-usnco-exam-part-ii.pdf");	
    	  				break;
    	  			 }
		    	  case "NCO 2015 Part III" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/process/competitions/2015-usnco-exam-part-iii.pdf");	
		    	  				break;
		    	  			 }
		    	  case "NCO 2014 Part I" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2014-usnco-exam-part-i.pdf");	
    	  				break;
    	  			 }
		    	  case "NCO 2014 Part II" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2014-usnco-exam-part-ii.pdf");	
		    	  				break;
		    	  			 }
		    	  case "NCO 2014 Part III" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2014-usnco-exam-part-iii.pdf");	
		    	  				break;
		    	  			 }
		    	  case "NCO 2013 Part I" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2013-olympiad-national-exam-part1.pdf");	
		    	  				break;
		    	  			 }
		    	  case "NCO 2013 Part II" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2013%20national-exam-part-2.pdf");	
		    	  				break;
		    	  			 }
		    	  case "NCO 2013 Part III" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.acs.org/content/dam/acsorg/education/students/highschool/olympiad/pastexams/2013-national-exam-part-3.pdf");	
		    	  				break;
		    	  			 }
		    	  }
		      }
		    });
	}
	
	@FXML
	private void handleVideos() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://youtu.be/1Vn1Y-CwG60?t=1");			
	}
	
	
	
	public void setMainApp(Main mainApp) {
    	
		//This sets the field for this controller to the application passed in:  
		//This allows the main application to have a pointer to itself by setting its own pointer into the controller's field
		this.mainApp = mainApp;
	}
}
