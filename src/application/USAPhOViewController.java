package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class USAPhOViewController {
		
	//creates a web view
	@FXML
	private WebView myWebView;
	
	//creates buttons for the fxml file
	@FXML
	private Button strategies;
	@FXML
	private Button videos;
	
	//creates a choice box for the fxml file
	@FXML
	private ChoiceBox<String> choicePicker;
	
	//creates a variable that is used to reference to the main class
	private Main mainApp;
	
	//Constructor that is empty
	public USAPhOViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	//method which inputs choices into the choice box when the user clicks on the choice box
	/**
	 * @param event
	 * @exception IO exception
	 * Sets items into a choice box and loads the practice tests for the USAPhO exam
	*/
	@FXML
	public void initialize(){
		choicePicker.setItems(FXCollections.observableArrayList(
				//sets the items into the choice box
				 Main.usapho1.getItemName(), Main.usapho2.getItemName(), Main.usapho3.getItemName(), Main.usapho4.getItemName(), 
				    Main.usapho5.getItemName(), Main.usapho6.getItemName(), Main.usapho7.getItemName(), Main.usapho8.getItemName(), 
				    Main.usapho9.getItemName(), Main.usapho10.getItemName(), Main.usapho11.getItemName(), Main.usapho12.getItemName(), 
				    Main.usapho13.getItemName(), Main.usapho14.getItemName())
			);
		
		//creates an index for the options in the choice box and adds an event listener
		choicePicker.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		     
			//loads the corresponding webpage for the option selected
			  @Override
		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
		        
		    	  switch (choicePicker.getItems().get((Integer) number2)) {
		    	  			    	
		    	  case "USAPhO 2016" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2016/upload/E3-2-3.pdf");	
		    	  				break;
		    	  			 }
		    	  case "USAPhO 2016 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2016/upload/E3-2-3-solutions.pdf");	
		    	  				break;
		    	  			 }
		    	 
		    	 
		    	  case "USAPhO 2015" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2015/upload/E3-2-5.pdf");	
    	  				break;
    	  			 }
		    	  case "USAPhO 2015 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2015/upload/E3-2-5-solutions.pdf");	
		    	  				break;
		    	  			 }
		    	  
		    	  case "USAPhO 2014" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2015/upload/E3-2-2.pdf");	
    	  				break;
    	  			 }
		    	  case "USAPhO 2014 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2015/upload/E3-2-2-solutions.pdf");	
		    	  				break;
		    	  			 }
		    	  case "USAPhO 2013" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2014/upload/E3-1-7.pdf");	
    	  				break;
    	  			 }
		    	  case "USAPhO 2013 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2014/upload/E3-1-7-solutions.pdf");	
		    	  				break;
		    	  			 }
		    	  case "USAPhO 2012" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2013/upload/E3-2-3.pdf");	
		    	  				break;
		    	  			 }
		    	  case "USAPhO 2012 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2013/upload/E3-2-3-solutions.pdf");	
		    	  				break;
		    	  			 }
		    	  case "USAPhO 2011" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2012/upload/SemiFinal.pdf");	
		    	  				break;
		    	  			 }
		    	  case "USAPhO 2011 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2012/upload/SemFinal_solutions.pdf");	
		    	  				break;
		    	  			 }
		    	  case "USAPhO 2010" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2010/upload/2010_SemiFinal.pdf");	
		    	  				break;
		    	  			 }
		    	  case "USAPhO 2010 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2010/upload/2010_SemiFinalSolutions.pdf");	
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
	 * Loads the strategies for the USAPhO exam
	*/
	@FXML
	public void handleStrategy() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://www.quora.com/Im-a-high-school-junior-who-got-a-19-on-the-F-Ma-and-passed-onto-the-semifinal-round-this-year-I-want-to-spend-all-of-this-summer-studying-so-that-I-can-get-an-honorable-mention-in-the-USAPhO-How-many-hours-should-I-study-throughout-the-summer-each-day");			
	}
	
	//loads the webpage in a web view when the Learn button is clicked
	/**
	 * @param event
	 * @exception IO exception
	 * Loads the conceptual videos for the USAPhO exam
	*/
	@FXML
	public void handleVideos() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://www.youtube.com/playlist?list=PLskOoff9hfsZHm2oZfmQFgpuQ3oWLgp0M");			
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

