package application;

	

	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	import javafx.application.Application;
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
	import javafx.scene.control.TableView;
	import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

	import java.sql.Connection;
	import java.sql.ResultSet;
	import javafx.application.Application;
	import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.scene.Scene;
	import javafx.scene.control.TableColumn;
	import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.control.TableView;
	import javafx.stage.Stage;
	import javafx.util.Callback;

	public class PhysicsViewController {

		
		//buttons for the fxml file	
		@FXML
		private Button fma;
		@FXML
		private Button usapho;
		
		
	  	
		
		
		
		
		
		@FXML
		private void handleFma(ActionEvent event) 
		                         throws IOException {
		
	  		
	  	//new stage and root
		Stage stage; 
		Parent root;

		if(event.getSource()==fma)//if button is clicked
		{
		  stage = new Stage();
		  
		  root = FXMLLoader.load(getClass().getResource("FmaLayout.fxml"));//gets the fxml file
		  stage.setScene(new Scene(root));//sets the scene to the fxml file
		  stage.setTitle("F=ma");//sets the title
		  stage.initModality(Modality.APPLICATION_MODAL);
		  stage.initOwner(fma.getScene().getWindow());//opens the view in a new window
		  stage.showAndWait();
		}
		}  
	      
	      
	    
	  	//method to open a new view when the button called usapho is clicked
	  	@FXML
		private void handleUsapho(ActionEvent event) 
		                         throws IOException {
		
	  		
	  	//new stage and root
		Stage stage; 
		Parent root;

		if(event.getSource()==usapho)//if button is clicked
		{
		  stage = new Stage();
		  root = FXMLLoader.load(getClass().getResource("UsaphoLayout.fxml"));//gets the fxml file
		  stage.setScene(new Scene(root));//sets the scene to the fxml file
		  stage.setTitle("USAPhO");//sets the title
		  stage.initModality(Modality.APPLICATION_MODAL);
		  stage.initOwner(usapho.getScene().getWindow());//opens the view in a new window
		  stage.showAndWait();
		}
		

		}    
	  	
	  	
	  	
	  	
	  	
	  		
	  		
	  		
}
	  	
	  	
	  	
