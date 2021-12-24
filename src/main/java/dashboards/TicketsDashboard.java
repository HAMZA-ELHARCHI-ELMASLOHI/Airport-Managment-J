package dashboards;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Objects;


public class TicketsDashboard extends Application{

    @Override
    public void start(Stage stage)  throws IOException{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(TicketsDashboard.class.getResource("Ticket.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 700);
            stage.setTitle("Airport Nameless");
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new IOException();
        }
    }

}