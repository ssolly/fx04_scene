package quiz.quiz01.teacher;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable{

	private Parent root;
	LoginService ls;
	
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//초기화
		ls = new LoginServiceImpl();
	}

	public void LoginProc() {
		ls.LoginProc(root);
	}
	
	public void CancelProc() {
		ls.CancelProc(root);
	}
	
	public void OpenMembershipForm() {
		ls.OpenMembershipForm();
	}
}
