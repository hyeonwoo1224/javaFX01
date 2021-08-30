package flowpane;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Quiz01 extends Application {

	public void start(Stage arg0) throws Exception {
		FlowPane flowPane = new FlowPane();
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for (int i=1;i<=num;i++) {
			Button btn = new Button("¹öÆ°" + i);
			flowPane.getChildren().add(btn);
		}
		Scene sc = new Scene(flowPane,200,100);
		arg0.setScene(sc);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
