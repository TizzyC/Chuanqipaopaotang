package chuanqipaopaotang;

public class main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		URL url = getClass().getResource("/res/layout/main_layout.fxml");
		AnchorPane root = FXMLLoader.load(url);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ÏûÃðÅÝÅÝÌÃ-Popstar3");
		primaryStage.setResizable(false);
		primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}