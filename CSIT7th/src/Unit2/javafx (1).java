
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        Border Pane
//        Button btn1 = new Button("b1");
//        Button btn2 = new Button("b2");
//        Button btn3 = new Button("b3");
//        Button btn4 = new Button("b4");
//        Button btn5 = new Button("b5");
//        BorderPane b1 = new BorderPane();
//        b1.setTop(btn1);
//        b1.setCenter(btn2);
//        b1.setBottom(btn3);
//        b1.setLeft(btn4);
//        b1.setRight(btn5);
//Gridpane
Button btn1 = new Button("b1");
        Button btn2 = new Button("b2");
        Button btn3 = new Button("b3");
        Button btn4 = new Button("b4");
        Button btn5 = new Button("b5");
//        BorderPane b1 = new BorderPane();
GridPane gp = new GridPane();
gp.add(btn1, 0, 0);
gp.add(btn2, 1, 1);
gp.add(btn3, 2, 2);
gp.add(btn4, 3, 3);
gp.add(btn5, 4, 4);
        Scene scene = new Scene(gp, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}






import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//creating fx application
public class FirstFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        //handling event on button
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        //layout for javafx: for eg flowlayout in swing
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        //scene is just like windo in swing
        //layout is added to scene
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);//adding scene
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}






import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("b1");
        Button btn2 = new Button("b2");
        Button btn3 = new Button("b3");
        Button btn4 = new Button("b4");
        Button btn5 = new Button("b5");
//        btn.setText("Say 'Hello World'");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        //StackPane root = new StackPane();
        FlowPane fp = new FlowPane(Orientation.HORIZONTAL,5,5);
        fp.setPadding(new Insets(25));
        fp.getChildren().add(btn1);
        fp.getChildren().add(btn2);
        fp.getChildren().add(btn3);
        fp.getChildren().add(btn4);
        fp.getChildren().add(btn5);
        
        Scene scene = new Scene(fp, 300, 250);
        
        primaryStage.setTitle("FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}





import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class HBoxAndVBox extends Application {    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("b1");
        Button btn2 = new Button("b2");
        Button btn3 = new Button("b3");
        Button btn4 = new Button("b4");
        Button btn5 = new Button("b5");
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        
//        HBox hb = new HBox(50);
//        hb.getChildren().add(btn1);
//        hb.getChildren().add(btn2);
//        hb.getChildren().add(btn3);
//        hb.getChildren().add(btn4);
//        hb.getChildren().add(btn5);
        VBox vb = new VBox(10);
        vb.getChildren().add(btn1);
        vb.getChildren().add(btn2);
        vb.getChildren().add(btn3);
        vb.getChildren().add(btn4);
        vb.getChildren().add(btn5);
        Scene scene = new Scene(vb, 300, 250);
        
        primaryStage.setTitle("Hbox and Vbox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}





import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class LoginFormDemoFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
     //creating label
     Text t1 = new Text("Username");
      Text t2 = new Text("Password");
      Label l3 = new Label("gender");
      //creating Text field
      TextField tf1 = new TextField();
      PasswordField tf2 = new PasswordField();
      Button b1 = new Button("submit");
      Button b2 = new Button("reset");
      //creating radio button for gender
      RadioButton r1 = new RadioButton("male");
      RadioButton r2 = new RadioButton("female");
      ToggleGroup tg = new ToggleGroup();
      r1.setToggleGroup(tg);
      r2.setToggleGroup(tg);
      //check box
      Label l4 = new Label("Course");
      CheckBox cb1 = new CheckBox("java");
      CheckBox cb2 = new CheckBox("C++");
      //drop down menu
      Label l5 = new Label("country");
      ChoiceBox country = new ChoiceBox();
      b1.setStyle("-fx-background-color:green;-fx-textfill:white;");
      country.getItems().addAll("Nepal","Japan","Korea","India");
        GridPane gp = new GridPane();
        gp.setStyle("-fx-background-color:grey");
        gp.setPadding(new Insets(10,10,10,10));
        gp.setVgap(10);
        gp.setHgap(10);
        gp.add(t1, 0, 0);
        gp.add(tf1, 1, 0);
        gp.add(t2, 0, 1);
        gp.add(tf2, 1, 1);
        gp.add(l3, 0, 2);
        gp.add(r1, 1, 2);
        gp.add(r2, 2, 2);
        gp.add(l4, 0, 3);
        gp.add(cb1, 1, 3);
        gp.add(cb2, 2, 3);
        gp.add(l5,0,4);
        gp.add(country, 1, 4);
        gp.add(b1,0,5);
        gp.add(b2, 1, 5);
        
        
        
        
        Scene scene = new Scene(gp, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
