package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Map;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        primaryStage.setTitle("Lab Browser");
        primaryStage.setScene(new Scene(root));
        Rectangle2D screen = Screen.getPrimary().getVisualBounds();
        primaryStage.setX(screen.getMaxX());
        primaryStage.setY(screen.getMaxY());
        primaryStage.setWidth(screen.getWidth());
        primaryStage.setHeight(screen.getHeight());
        primaryStage.setResizable(false);
        primaryStage.setMaximized(true);
        primaryStage.setFullScreen(true);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        Map<String, String> parameters = getParameters().getNamed();
        if (parameters.containsKey("url")) {
            String url = parameters.get("url");
            URLData.getInstance().setUrl(url);
            System.out.println(parameters.get("url"));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
