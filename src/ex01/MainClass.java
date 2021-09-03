package ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	public static void main(String[] args) {
		launch(args);
		//main에서 fxml를 로드하고, fxml에 있는 controller가 생성, 만들어진 컨트롤러에 root저장
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//1. 파일 로드 : 파일에 대한 정보를 loader에 저장, fxml에서 셋팅했던 controller 가져올 수 있음
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		
		//2. 파일 정보를 root(pane)에 저장
		Parent root = loader.load();	//작성한 내용을 실행시킨다
		
		//3. 신에 저장 -> 보여줌
		Scene scene = new Scene(root);
		
		//4. fxml에서 셋팅했떤 controller 셋팅
		Controller ctl = loader.getController();	//컨트롤러 얻어옴
		
		//5. root(pane)을 컨트롤러에 세팅
		ctl.setRoot(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("fx04.ex01");
		primaryStage.show();
		
	}
}
