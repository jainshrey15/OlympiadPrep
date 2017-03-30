package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ChemistryViewController {

	//buttons for the fxml file
	@FXML
	private Button lco;
	@FXML
	private Button nco;
	
	//method to open the Local Chem View when the button called LCO is clicked
	/*
	 @param
	 @exception
	 @return
	 */
	@FXML
	private void handleLCO(ActionEvent event) 
	                         throws IOException {
	
  		
  	//new stage and root
	Stage stage; 
	Parent root;

	if(event.getSource()==lco)//if button is clicked
	{
	  stage = new Stage();
	  
	  root = FXMLLoader.load(getClass().getResource("LCOLayout.fxml"));//gets the fxml file
	  stage.setScene(new Scene(root));//sets the scene to the fxml file
	  stage.setTitle("Local Chemistry Olympiad");//sets the title
	  stage.initModality(Modality.APPLICATION_MODAL);
	  stage.initOwner(lco.getScene().getWindow());//opens the view in a new window
	  stage.showAndWait();
	}
	}  
      
      
    
  	//method to open a new view when the button called NCO is clicked
	/*
	 @param
	 @exception
	 @return
	 */
  	@FXML
	private void handleNCO(ActionEvent event) 
	                         throws IOException {
	
  		
  	//new stage and root
	Stage stage; 
	Parent root;

	if(event.getSource()==nco)//if button is clicked
	{
	  stage = new Stage();
	  root = FXMLLoader.load(getClass().getResource("NCOLayout.fxml"));//gets the fxml file
	  stage.setScene(new Scene(root));//sets the scene to the fxml file
	  stage.setTitle("National Chemistry Olympiad");//sets the title
	  stage.initModality(Modality.APPLICATION_MODAL);
	  stage.initOwner(nco.getScene().getWindow());//opens the view in a new window
	  stage.showAndWait();
	}
	

	}    
  	
  	
  	
  	
  	
  		
  		
}
