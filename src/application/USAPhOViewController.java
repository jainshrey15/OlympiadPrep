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
		
		
	@FXML
	private WebView myWebView;
	
	@FXML
	private Button strategies;
	@FXML
	private Button videos;
	@FXML
	private ChoiceBox<String> choicePicker;
	
	private Main mainApp;
	
	//Constructor that is empty
	public USAPhOViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	@FXML
	private void handlePracticeC(){
		choicePicker.setItems(FXCollections.observableArrayList(
			    "USAPhO 2016", "USAPhO 2016 Solutions", "USAPhO 2015", "USAPhO 2015 Solutions", 
			    "USAPhO 2014", "USAPhO 2014 Solutions", "USAPhO 2013", "USAPhO 2013 Solutions", 
			    "USAPhO 2012", "USAPhO 2012 Solutions", "USAPhO 2011", "USAPhO 2011 Solutions", 
			    "USAPhO 2010", "USAPhO 2010 Solutions")
			);
		
		
		choicePicker.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
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
			
	
	
	@FXML
	private void handleStrategy() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://www.quora.com/Im-a-high-school-junior-who-got-a-19-on-the-F-Ma-and-passed-onto-the-semifinal-round-this-year-I-want-to-spend-all-of-this-summer-studying-so-that-I-can-get-an-honorable-mention-in-the-USAPhO-How-many-hours-should-I-study-throughout-the-summer-each-day");			
	}
	
	@FXML
	private void handleVideos() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://www.youtube.com/playlist?list=PLskOoff9hfsZHm2oZfmQFgpuQ3oWLgp0M");			
	}
	
	
	public void setMainApp(Main mainApp) {
    	
		//This sets the field for this controller to the application passed in:  
		//This allows the main application to have a pointer to itself by setting its own pointer into the controller's field
		this.mainApp = mainApp;
	}
}

