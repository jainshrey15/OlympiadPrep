
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
		static Item usapho1 = new Item("USAPhO 2016");
		static Item usapho2 = new Item("USAPhO 2016 Solutions");
		static Item usapho3 = new Item("USAPhO 2015");
		static Item usapho4 = new Item("USAPhO 2015 Solutions");
		static Item usapho5 = new Item("USAPhO 2014");
		static Item usapho6 = new Item("USAPhO 2014 Solutions");
		static Item usapho7 = new Item("USAPhO 2013");
		static Item usapho8 = new Item("USAPhO 2013 Solutions");
		static Item usapho9 = new Item("USAPhO 2012");
		static Item usapho10 = new Item("USAPhO 2012 Solutions");
		static Item usapho11 = new Item("USAPhO 2011");
		static Item usapho12 = new Item("USAPhO 2011 Solutions");
		static Item usapho13 = new Item("USAPhO 2010");
		static Item usapho14 = new Item("USAPhO 2010 Solutions");
		static Item amc1 = new Item("Art of Problem Solving");
		static Item amc2 = new Item("Walt S");
		static Item aime1 = new Item("Concepts");
		static Item lco1 = new Item("LCO 2016");
		static Item lco2 = new Item("LCO 2015");
		static Item lco3 = new Item("LCO 2014");
		static Item lco4 = new Item("LCO 2013");
		static Item lco5 = new Item("LCO 2012");
		static Item lco6 = new Item("LCO 2011");
		static Item lco7 = new Item("LCO 2010");
		static Item lco8 = new Item("LCO 2009");
		static Item lco9 = new Item("LCO 2008");
		static Item lco10 = new Item("LCO 2007");
		static Item nco1 = new Item("NCO 2016 Part I");
		static Item nco2 = new Item("NCO 2016 Part II");
		static Item nco3 = new Item("NCO 2016 Part III");
		static Item nco4 = new Item("NCO 2015 Part I");
		static Item nco5 = new Item("NCO 2015 Part II");
		static Item nco6 = new Item("NCO 2015 Part III");
		static Item nco7 = new Item("NCO 2014 Part I");
		static Item nco8 = new Item("NCO 2014 Part II");
		static Item nco9 = new Item("NCO 2014 Part III");
		static Item nco10 = new Item("NCO 2013 Part I");
		static Item nco11 = new Item("NCO 2013 Part II");
		static Item nco12 = new Item("NCO 2013 Part III");
		
		
	//method to open the start view 
		/**
		 * @param event
		 * @exception IO exception
		 * Opens the start view and loads the fxml file into it 
		*/
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
	/**
	 * @param event
	 * @exception IO exception
	 * Loads the fxml file into the scene of the start view
	*/
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