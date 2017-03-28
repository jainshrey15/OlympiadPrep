
package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import application.Item;


public class Main extends Application {
	
		//private field of a stage that will be the primary stage
		private Stage primaryStage;
		//private field of the root layout of our main window
		private AnchorPane rootLayout;
		//shreyis dumb
		//creates a static object of the item class with a specific input of F=ma 2016
		static Item fma1 = new Item("F=ma 2016");
		//creates a static object of the item class with a specific input of F=ma 2016 Solutions
		static Item fma2 = new Item("F=ma 2016 Solutions");
		//creates a static object of the item class with a specific input of F=ma 2015
		static Item fma3 = new Item("F=ma 2015");
		//creates a static object of the item class with a specific input of F=ma 2015 Solutions
		static Item fma4 = new Item("F=ma 2015 Solutions");
		//creates a static object of the item class with a specific input of F=ma 2014
		static Item fma5 = new Item("F=ma 2014");
		//creates a static object of the item class with a specific input of F=ma 2014 Solutions
		static Item fma6 = new Item("F=ma 2014 Solutions");
		//creates a static object of the item class with a specific input of F=ma 2013
		static Item fma7 = new Item("F=ma 2013");
		//creates a static object of the item class with a specific input of F=ma 2013 Solutions
		static Item fma8 = new Item("F=ma 2013 Solutions");
		//creates a static object of the item class with a specific input of F=ma 2012
		static Item fma9 = new Item("F=ma 2012");
		//creates a static object of the item class with a specific input of F=ma 2012 Solutions
		static Item fma10 = new Item("F=ma 2012 Solutions");
		//creates a static object of the item class with a specific input of F=ma 2011
		static Item fma11 = new Item("F=ma 2011");
		//creates a static object of the item class with a specific input of F=ma 2011 Solutions
		static Item fma12 = new Item("F=ma 2011 Solutions");
		//creates a static object of the item class with a specific input of F=ma 2010 
		static Item fma13 = new Item("F=ma 2010");
		//creates a static object of the item class with a specific input of F=ma 2010 Solutions
		static Item fma14 = new Item("F=ma 2010 Solutions");
		
		
	//method to open the start view 
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//sets the primary stage to the parameter
			this.primaryStage = primaryStage;
			//sets the title of the primary stage
			this.primaryStage.setTitle("Olympiad Prep");	//Set the title of the Window

			//Here we call a method to set up the Root Layout
			initRootLayout();
			
			
		} catch(Exception e) {//catches an exception
			e.printStackTrace();
		}
	}
	
	//this method is needed to launch the arguments of the main class
	public static void main(String[] args) {
		launch(args);
	}

	//method to open the first view
	public void initRootLayout() {
		
		try {
			//Main initialization routines for layout and app commencement
			
			//create an FXML Loader object
			FXMLLoader loader = new FXMLLoader();
			
			//Point the loader at the FXML file to load
			loader.setLocation(Main.class.getResource("/application/RootLayout.FXML"));
			
			//Sets the rootlayout field to the BorderPane FXM file injected via @FXML
			rootLayout = (AnchorPane) loader.load();
			
			
			//Sets a Scene object to this rootLayout
			Scene scene = new Scene(rootLayout);
			
			 // Give the controller access to the main app.
	        RootLayoutController controller = loader.getController();
	        controller.setMainApp(this);
			
			//Sets the primaryScene Scene object to scene
			primaryStage.setScene(scene);
			
			//Shows the primaryStage object
			primaryStage.show();
		
		} catch (IOException e) {//catches an exception
			e.printStackTrace();
		}
	}

}