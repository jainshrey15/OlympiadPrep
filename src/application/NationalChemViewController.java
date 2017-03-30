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
	
	//creates a web view
	@FXML
	private WebView myWebView;
	//creates button for the fxml file
	@FXML
	private Button videos;
	//creates a choice box for the fxml file
	@FXML
	private ChoiceBox<String> choicePicker;
	
	//creates a variable that is used to reference to the main class
	private Main mainApp;
	
	//Constructor that is empty
	public NationalChemViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	
	//method which inputs choices into the choice box when the user clicks on the choice box
	/*
	 @param
	 @exception
	 @return
	 */
	@FXML
	private void initialize(){
		choicePicker.setItems(FXCollections.observableArrayList(
				//sets the options into the choice box
				Main.nco1.getItemName(), Main.nco2.getItemName(), Main.nco3.getItemName(), Main.nco4.getItemName(), 
			    Main.nco5.getItemName(), Main.nco6.getItemName(), Main.nco7.getItemName(), Main.nco8.getItemName(), 
			    Main.nco9.getItemName(), Main.nco10.getItemName(), Main.nco11.getItemName(), Main.nco12.getItemName())
			);
		
		//creates an index for the options in the choice box and adds an event listener
		choicePicker.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		      
			//loads the corresponding pdf file in a web view for the option selected
			  @Override
		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				  //the options selected is switched
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
	
	//loads the webpage in a web view when the Learn button is clicked
	/*
	 @param
	 @exception
	 @return
	 */
	@FXML
	private void handleVideos() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://youtu.be/1Vn1Y-CwG60?t=1");			
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
