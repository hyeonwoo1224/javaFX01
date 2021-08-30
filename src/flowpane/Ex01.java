package flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application {
	public void start(Stage arg0) throws Exception {
		FlowPane flowPane = new FlowPane();
		Button btn01 = new Button("��ư01");
		Button btn02 = new Button("��ư02");
		Button btn03 = new Button("��ư03");
		//��ư ����
		
		flowPane.getChildren().add(btn01);
		flowPane.getChildren().add(btn02);
		flowPane.getChildren().add(btn03);
		//������ ��ư flowPane ��������� ���
		Scene sc = new Scene(flowPane,200,100);
		//flowPane ��� ���� 200 ���� 100
		
		arg0.setScene(sc);
		//ȭ�� sc�� ���
		arg0.show();
		}
	public static void main(String[] args) {
		launch(args);
	}

}
