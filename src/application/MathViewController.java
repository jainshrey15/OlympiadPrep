package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

public class MathViewController {
	
	//buttons for the fxml file
	@FXML
	private Button amc;
	@FXML
	private Button aime;
	@FXML
	private Button usamo;
	
	
	//method to open a new view when the button called amc is clicked
	/**
	 * @param event
	 * @exception IO exception
	 * Opens the AMC Layout in a new view
	*/
	@FXML
	public void handleAMC(ActionEvent event) 
	                         throws IOException {
	//new stage and root
	Stage stage; 
	Parent root;

	if(event.getSource()==amc)//if button is clicked
	{
	  stage = new Stage();
	  root = FXMLLoader.load(getClass().getResource("AMCLayout.fxml"));//gets the fxml file
	  stage.setScene(new Scene(root));//sets the scene to the fxml file
	  stage.setTitle("AMC");//sets the title
	  stage.initModality(Modality.APPLICATION_MODAL);
	  stage.initOwner(amc.getScene().getWindow());//opens the view in a new window
	  stage.showAndWait();
	}
	}
	
	//method to open the AIME view when the button called AIME is clicked
	/**
	 * @param event
	 * @exception IO exception
	 * Opens the AIME Layout in a new view
	*/
	@FXML
	public void handleAIME(ActionEvent event) 
	                         throws IOException {
	//new stage and root
	Stage stage; 
	Parent root;
	if(event.getSource()==aime)//if button is clicked
	{
	  stage = new Stage();
	  root = FXMLLoader.load(getClass().getResource("AIMELayout.fxml"));//gets the fxml file
	  stage.setScene(new Scene(root));//sets the scene to the fxml file
	  stage.setTitle("AIME");//sets the title
	  stage.initModality(Modality.APPLICATION_MODAL);
	  stage.initOwner(aime.getScene().getWindow());//opens the view in a new window
	  stage.showAndWait();
	}
	}
	
	//method to open the USAMO view when the button called USAMO is clicked
	/**
	 * @param event
	 * @exception IO exception
	 * Opens the USAMO Layout in a new view
	*/
	@FXML
	public void handleUSAMO(ActionEvent event) 
	                         throws IOException {
	//new stage and root
	Stage stage; 
	Parent root;
	
	if(event.getSource()==usamo)//if button is clicked
	{
	  stage = new Stage();
	  root = FXMLLoader.load(getClass().getResource("USAMOLayout.fxml"));//gets the fxml file
	  stage.setScene(new Scene(root));//sets the scene to the fxml file
	  stage.setTitle("USAMO");//sets the title
	  stage.initModality(Modality.APPLICATION_MODAL);
	  stage.initOwner(usamo.getScene().getWindow());//opens the view in a new window
	  stage.showAndWait();
	}
	

	}
	
	
}