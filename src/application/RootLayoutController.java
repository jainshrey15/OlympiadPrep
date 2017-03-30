package application;


import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import application.PhysicsViewController;

public class RootLayoutController {
	
	
	//@FXML is needed so that the buttons in scene builder can be assigned fx:ids
	//buttons for the first view
	@FXML
	private Button physics;//creates a button called physics
	@FXML
	private Button chemistry;//creates a button called chemistry
	@FXML
	private Button math;//creates a button called math
	@FXML
	private Button citations;//creates a button called citations
	
	//button to enter the name to the next view
	@FXML
	private Button btn1;//creates a button which will be assigned to the Continue button in fxml
	@FXML
	private Button btn2;//creates a button which will be assigned to the Surprise button in fxml
	
	
	
	
	//creates a variable which can be used to reference to the main class
	private Main mainApp;
	
	
	//creates a variable which can be used to reference to the Physics View Controller class
	private PhysicsViewController physicsViewApp;
	
	public void setPhysicsViewApp(PhysicsViewController physicsViewApp) {
		//This sets the field for this controller to the application passed in:  
//This allows the physics view controller application to have a pointer to itself by setting its own pointer into the controller's field
this.physicsViewApp = physicsViewApp;
}

	
	public void setMainApp(Main mainApp) {
    	//This sets the field for this controller to the application passed in:  
		//This allows the main application to have a pointer to itself by setting its own pointer into the controller's field
		this.mainApp = mainApp;
	}

	//method to create an animation which will display the continue button
	@FXML
	private void handleContinue(ActionEvent event) throws IOException{
		
		//creates a new path
		Path path = new Path();
		//sets the initial position of the object
		 MoveTo start = new MoveTo();
		 path.getElements().add(start);
		path.getElements().add(new LineTo(370,0));
		//creates a path transition
		PathTransition pathTransition = new PathTransition();
		//sets the duration of the motion
		pathTransition.setDuration(Duration.millis(4000));
		//sets the path of the object to the path created
		pathTransition.setPath(path);
		//sets the object to be btn1
		pathTransition.setNode(btn1);
		//sets the orientation of the object to be orthogonal to the tangent of the curve
		pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		//sets the number of cyclyes of the animation
		pathTransition.setCycleCount(1);
		//allows the animation to be performed multiple times
		pathTransition.setAutoReverse(true);
		//plays the animation
		pathTransition.play();
	}
	
	//method to open a new view when the continue button is clicked
	@FXML
	private void handleOpening(ActionEvent event) 
	                         throws IOException {

	//new stage and root
	Stage stage; 
	Parent root;

	//if the button is clicked
	if(event.getSource()==btn1)
	{
	
	  //creates a new stage
	  stage = new Stage();
	  //loads the fxml file into the root
	  root = FXMLLoader.load(getClass().getResource("SubjectsLayout.fxml"));
	  //sets the scene of the stage to the root
	  stage.setScene(new Scene(root));
	  //sets the title of the stage
	  stage.setTitle("WELCOME");
	  //initializes the modality
	  stage.initModality(Modality.APPLICATION_MODAL);
	  //open the new view in a new window
	  stage.initOwner(btn1.getScene().getWindow());
	  //shows the stage and waits for user's response
	  stage.showAndWait();
	  
	  
	}
	

	}
	
	//method to open a new view when the button called physics is clicked
	@FXML
	private void handlePhysics(ActionEvent event) 
	                         throws IOException {

	//new stage and root
	Stage stage; 
	Parent root;

	//if the button physics is clicked
	if(event.getSource()==physics)
	{
	  stage = new Stage();
	  root = FXMLLoader.load(getClass().getResource("PhysicsLayout.fxml"));//open the physics layout fxml
	  stage.setScene(new Scene(root));
	  stage.setTitle("Physics");//sets the title
	  stage.initModality(Modality.APPLICATION_MODAL);//initializing the modality
	  stage.initOwner(physics.getScene().getWindow());//open the new view in a new window
	  stage.showAndWait();
	  	
	}
	

	}

	//method to open a new view when the button called chemistry is clicked
	@FXML
	private void handleChemistry(ActionEvent event) 
	                         throws IOException {

	//new stage and root
	Stage stage; 
	Parent root;

	if(event.getSource()==chemistry)
	{
	  stage = new Stage();
	  root = FXMLLoader.load(getClass().getResource("ChemistryLayout.fxml"));//gets the fxml file
	  stage.setScene(new Scene(root));//sets the scene to root
	  stage.setTitle("Chemistry");//sets the title
	  stage.initModality(Modality.APPLICATION_MODAL);
	  stage.initOwner(chemistry.getScene().getWindow());//opens the view in new window
	  stage.showAndWait();
	}
	

	}
	
	//method to open a new view when the button called math is clicked
	@FXML
	private void handleMath(ActionEvent event) 
	                         throws IOException {
	//new stage and root
	Stage stage; 
	Parent root;

	if(event.getSource()==math)//if button is clicked
	{
	  stage = new Stage();
	  root = FXMLLoader.load(getClass().getResource("MathLayout.fxml"));//gets the fxml file
	  stage.setScene(new Scene(root));//sets the scene to the fxml file
	  stage.setTitle("Mathematics");//sets the title
	  stage.initModality(Modality.APPLICATION_MODAL);
	  stage.initOwner(math.getScene().getWindow());//opens the view in a new window
	  stage.showAndWait();
	}
	

	}
	
	//method to open a new view when the button called See Citations is clicked
		@FXML
		private void handleCitations(ActionEvent event) 
		                         throws IOException {

		//new stage and root
		Stage stage; 
		Parent root;

		//if the button See Citations is clicked
		if(event.getSource()==citations)
		{
		  stage = new Stage();
		  root = FXMLLoader.load(getClass().getResource("CitationsLayout.fxml"));//open the citations layout fxml
		  stage.setScene(new Scene(root));
		  stage.setTitle("Citations");//sets the title
		  stage.initModality(Modality.APPLICATION_MODAL);//initializing the modality
		  stage.initOwner(citations.getScene().getWindow());//open the new view in a new window
		  stage.showAndWait();
		}
		

		}

}
	