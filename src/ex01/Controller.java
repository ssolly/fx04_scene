package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

	private Parent root;
	@FXML TextField fxId;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	public void LoginProc() {
		System.out.println("로그인 버튼 클릭");
		TextField t = (TextField)root.lookup("#fxId");
		System.out.println(t.getText());
		System.out.print("Annotation사용 : " + fxId.getText());
	}
	

}

/*
 컨트롤러 : 연결시켜주는 역할
		  기능이 크게 필요 없다
*/
