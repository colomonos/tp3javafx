import javafx.application.Application;
import javafx.application.Platform;
// import javafx.beans.binding.Bindings;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class FenetreConnexion extends Application {

    protected TextField textFielda ;
    protected TextField textFieldb ;
    private MethodeF MethodeF;

    @Override
    public void init(){
        // Initialisation des objects qui ne sont pas dans la scène
        // cad des éléments non graphiques
        this.MethodeF = new MethodeF();
    }

    @Override
    public void start(Stage stage) throws Exception{
        // Construction du graphe de scène
        HBox root = new HBox();

        this.ajouteTitre(root);
        this.ajouteA(root);

        this.ajouteBoutons(root);
        
        Scene scene = new Scene(root);
        stage.setTitle("Convertisseur de MethodeFs");
        stage.setScene(scene);
        textFielda.setTooltip(new Tooltip("Enter user name"));
        textFieldb.setTooltip(new Tooltip("Enter user mdp"));
        stage.show();
    }

    public void effaceTF(){
        this.textFielda.setText("");
        this.textFieldb.setText("");
    }
    
    public double getValueA() throws NumberFormatException{
        return Double.parseDouble(textFielda.getText());
    }

    public double getValueb() throws NumberFormatException{
        return Double.parseDouble(textFieldb.getText());
    }    


    public void majTF(){
        this.textFielda.setText(this.MethodeF +"");
        this.textFieldb.setText(this.MethodeF +"");

    }

    public void quitte(){
        Platform.exit();
    }

    private void ajouteTitre(Pane root){
        HBox hbTitre = new HBox(20);
        Label titre = new Label("tp3");
        hbTitre.setAlignment(Pos.CENTER);
        hbTitre.getChildren().addAll( titre);
        root.getChildren().add(hbTitre);
    }

    private void ajouteA(Pane root){
        GridPane hba = new GridPane();
        hba.setPadding(new Insets(10, 10, 0, 10));
        Label labelA = new Label("identifiant");
        this.textFielda = new TextField();
        Label labelB = new Label("MDP");
        this.textFieldb = new TextField();     
        hba.add(labelA, 0, 0);
        hba.add( this.textFielda, 0, 1);
        hba.add(labelB, 0, 2, 1, 1);
        hba.add( this.textFieldb, 1, 1, 1, 1);
        root.getChildren().add(hba);  
    }







    private void ajouteBoutons(Pane root){
        GridPane hbb = new GridPane();
        hbb.setPadding(new Insets(10, 10, 10, 10));
        Button buttonC = new Button("connection");
        nodeOrange, 0, 3, 3, 1

        // On connecte des controleurs        
        //buttonC.setOnAction(new ControleurBoutonC(this.MethodeF,this));
       


        hbb.getChildren().addAll(buttonC);
        hbb.setAlignment(Pos.BASELINE_RIGHT);
        root.getChildren().add(hbb);
    }


}
