package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Cadastro de Aluno");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("RA: ");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Nome:");
        grid.add(pw, 0, 2);

        TextField pwBox = new TextField();
        grid.add(pwBox, 1, 2);
        
        Label sexo = new Label("Sexo");
        grid.add(sexo, 0, 3);
        
        HBox hbRad = new HBox(2);
        //hbRad.setAlignment(Pos.CENTER);
        grid.add(hbRad, 1, 3);
        
        RadioButton rb = new RadioButton();
        rb.setText("Masc");
        hbRad.getChildren().add(rb);
        
        RadioButton rb2 = new RadioButton();
        rb2.setText("Femin");
        hbRad.getChildren().add(rb2);
        
        Label estado = new Label("Estado");
        grid.add(estado, 0, 4);
        
        ComboBox cb = new ComboBox();
        cb.getItems().addAll(
            "MS",
            "SP",
            "RJ"
        );
        grid.add(cb, 1, 4);
        
        Button btn = new Button("Salvar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 5);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setId("actiontarget");
                actiontarget.setText("Sign in button pressed");
            }
        });
        
        Button limpar = new Button("Limpar");
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(limpar);
        

        Scene scene = new Scene(grid, 325, 275);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Login.class.getResource("Login.css").toExternalForm());
        primaryStage.show();
    }
}