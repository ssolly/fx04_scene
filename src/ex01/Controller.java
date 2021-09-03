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
	
	//root(pane)을 저장하는 메소드 
	//(각 정보 및 변수가 너무 많아서 한번에 전달 후 필요한거 꺼내쓰기, 루트로 활용할 메소드多)
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	public void LoginProc() {
		System.out.println("로그인 버튼 클릭");
		
		//root의 "fxId"를 따라가서 t에 저장 (= fxId.setText();)
		//다만 @FXML어노테이션 사용해서 사용하지 않는 이유는 컨트롤러는 연결해주는 역할만 하기 위해서이다
		TextField t = (TextField)root.lookup("#fxId");
		
		System.out.println(t.getText());
		System.out.print("Annotation사용 : " + fxId.getText());
	}
	

}

/*
 컨트롤러 : 연결시켜주는 역할
		  기능이 크게 필요 없다
*/
