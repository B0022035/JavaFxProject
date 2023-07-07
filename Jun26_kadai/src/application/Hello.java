package application;

import javafx.application.Application;
//scene
import javafx.scene.Scene;
//Button,Label
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//BroderPane
import javafx.scene.layout.BorderPane;
//stage
import javafx.stage.Stage;

public class Hello extends Application {
	@Override
	public void start(Stage pstage) {
		Button b1 = new Button("ボタン１");
		Button b2 = new Button("ボタン２");
		Label label = new Label("こんにちは");
		BorderPane root = new BorderPane();
		root.setTop(label);
		root.setLeft(b1);
		root.setRight(b2);
		Scene scene = new Scene(root);
		pstage.setScene(scene);
		pstage.setTitle("Hello");
		pstage.sizeToScene();
		pstage.show();
		Image img = new Image("H")
	}
	public static void main(String[] args) {
		launch(args);
	}
}
