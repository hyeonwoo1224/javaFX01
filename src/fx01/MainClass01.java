package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Label lb = new Label("Hello world!!");
		lb.setFont(new Font(20));
		//글씨크기
		
		Scene scene = new Scene(lb, 200,100);
		//틀 안의 장판같은 역할 Scene에 넣는 다고 생각
		//200은 가로 100은 세로
		arg0.setScene(scene);
		arg0.setTitle("연습중");
		//제목 setTitle
		arg0.show();
		
	}
}
