package flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application {
	public void start(Stage arg0) throws Exception {
		FlowPane flowPane = new FlowPane();
		Button btn01 = new Button("버튼01");
		Button btn02 = new Button("버튼02");
		Button btn03 = new Button("버튼03");
		//버튼 생성
		
		flowPane.getChildren().add(btn01);
		flowPane.getChildren().add(btn02);
		flowPane.getChildren().add(btn03);
		//생성한 버튼 flowPane 저장공간에 담기
		Scene sc = new Scene(flowPane,200,100);
		//flowPane 출력 가로 200 세로 100
		
		arg0.setScene(sc);
		//화면 sc를 출력
		arg0.show();
		}
	public static void main(String[] args) {
		launch(args);
	}

}
