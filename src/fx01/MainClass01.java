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
		//�۾�ũ��
		
		Scene scene = new Scene(lb, 200,100);
		//Ʋ ���� ���ǰ��� ���� Scene�� �ִ� �ٰ� ����
		//200�� ���� 100�� ����
		arg0.setScene(scene);
		arg0.setTitle("������");
		//���� setTitle
		arg0.show();
		
	}
}
