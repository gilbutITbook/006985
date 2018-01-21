package ch03.sec04;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

// 이 프로그램은 main 메서드가 없지만
// 명령줄에서 다음과 같이 실행할 수 있다.
// java ch03.sec04.ButtonDemo

public class ButtonDemo extends Application {
    public void start(Stage stage) {

        Button button = new Button("Ok");
        button.setOnAction(event -> 
            System.out.println("Thanks for clicking!"));

        Label message = new Label("Hello, JavaFX!");
        message.setFont(new Font(100));
        VBox root = new VBox();
        root.getChildren().addAll(button, message);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
