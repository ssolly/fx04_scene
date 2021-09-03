package ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		Parent root = loader.load();	//작성한 내용을 실행시킨다
		
		Scene scene = new Scene(root);
		
		Controller ctl = loader.getController();	//컨트롤러 얻어옴
		ctl.setRoot(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("fx04.ex01");
		primaryStage.show();
		
	}
}
