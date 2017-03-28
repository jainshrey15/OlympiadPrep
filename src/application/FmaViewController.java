package application;

import java.io.IOException;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import application.Main;
import application.Item;


public class FmaViewController {
	
	
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
	public FmaViewController() {
			//This is REQUIRED even if it has no commands.  The LOADER looks for this first, then will call initialize ONLY if initialize is decorated with @FXML
	}
	
	@FXML
	private void handlePracticeC(){
		choicePicker.setItems(FXCollections.observableArrayList(
			    Main.fma1.getItemName(), Main.fma2.getItemName(), Main.fma3.getItemName(), Main.fma4.getItemName(), 
			    Main.fma5.getItemName(), Main.fma6.getItemName(), Main.fma7.getItemName(), Main.fma8.getItemName(), 
			    Main.fma9.getItemName(), Main.fma10.getItemName(), Main.fma11.getItemName(), Main.fma12.getItemName(), 
			    Main.fma13.getItemName(), Main.fma14.getItemName())
			);
		
		
		choicePicker.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		      @Override
		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
		        
		    	  switch (choicePicker.getItems().get((Integer) number2)) {
		    	  			    	
		    	  case "F=ma 2016" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2016/upload/exam1-2016-3-1-2.pdf");	
		    	  				break;
		    	  			 }
		    	  case "F=ma 2016 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2016/upload/exam1-2016-3-1-solutions.pdf");	
		    	  				break;
		    	  			 }
		    	 
		    	 
		    	  case "F=ma 2015" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2015/upload/exam1-2015-1-8.pdf");	
    	  				break;
    	  			 }
		    	  case "F=ma 2015 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2016/upload/exam1-2015-1-8-answer-typo-corrected.pdf");	
		    	  				break;
		    	  			 }
		    	  
		    	  case "F=ma 2014" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2015/upload/exam1-2014-2-2.pdf");	
    	  				break;
    	  			 }
		    	  case "F=ma 2014 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2015/upload/exam1-2014-2-2-solutions.pdf");	
		    	  				break;
		    	  			 }
		    	  case "F=ma 2013" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2014/upload/exam1-2013-1-6-unlocked.pdf");	
    	  				break;
    	  			 }
		    	  case "F=ma 2013 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2014/upload/exam1-2013-solutions.pdf");	
		    	  				break;
		    	  			 }
		    	  case "F=ma 2012" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2013/upload/exam1-2012-unlocked.pdf");	
		    	  				break;
		    	  			 }
		    	  case "F=ma 2012 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2013/upload/exam1-2012-unlocked-solutions.pdf");	
		    	  				break;
		    	  			 }
		    	  case "F=ma 2011" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2012/upload/WebAssign-exam1-2011-1-4.pdf");	
		    	  				break;
		    	  			 }
		    	  case "F=ma 2011 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2012/upload/exam1-2011-1-3-answers_1.pdf");	
		    	  				break;
		    	  			 }
		    	  case "F=ma 2010" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2010/upload/2010_Fma.pdf");	
		    	  				break;
		    	  			 }
		    	  case "F=ma 2010 Solutions" :  {
		    		  WebEngine webEngine = myWebView.getEngine();
		    			webEngine.load("http://docs.google.com/gview?embedded=true&url=https://www.aapt.org/physicsteam/2010/upload/2010_FmaSolutions.pdf");	
		    	  				break;
		    	  			 }
		    	  
		    	  }
		      }
		    });
	}
			
	@FXML
	private void handleVideos(){
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://www.youtube.com/playlist?list=PLFozXTdFY8TgViSYd9dF2ZNwLzPFxTtp4");			
	}
	
	@FXML
	private void handleStrategy() {
		WebEngine webEngine = myWebView.getEngine();
		webEngine.load("https://www.quora.com/What-books-resources-should-I-use-to-prepare-for-the-initial-f-ma-Physics-Olympiad-exam");			
	}
	
	
	public void setMainApp(Main mainApp) {
    	
		//This sets the field for this controller to the application passed in:  
		//This allows the main application to have a pointer to itself by setting its own pointer into the controller's field
		this.mainApp = mainApp;
	}
}
