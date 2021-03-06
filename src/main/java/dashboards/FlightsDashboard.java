package dashboards;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FlightsDashboard extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("flights.fxml"));
        Scene scene = new Scene(root);
        //Parent root = FXMLLoader.load(getClass().getResource("flights.fxml"));
        //Scene scene = new Scene(root, 800, 600);

        stage.setScene(scene);
        stage.setMaximized(true);

        stage.show();
    }
}