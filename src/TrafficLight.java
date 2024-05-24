import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TrafficLight extends Application {

    private Circle redLight;
    private Circle yellowLight;
    private Circle greenLight;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Traffic Light");


        redLight = createLight(Color.RED, 100);
        yellowLight = createLight(Color.GRAY, 100); // Initially gray
        greenLight = createLight(Color.GRAY, 100); // Initially gray

        Button redButton = new Button("Red");
        redButton.setOnAction(e -> switchToRed());

        Button yellowButton = new Button("Yellow");
        yellowButton.setOnAction(e -> switchToYellow());

        Button greenButton = new Button("Green");
        greenButton.setOnAction(e -> switchToGreen());


        VBox vbox = new VBox(10, redLight, yellowLight, greenLight, redButton, yellowButton, greenButton);
        vbox.setStyle("-fx-background-color: black; -fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(vbox, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Circle createLight(Color color, int radius) {
        Circle light = new Circle(radius);
        light.setFill(color);
        return light;
    }

    private void switchToRed() {
        redLight.setFill(Color.RED);
        yellowLight.setFill(Color.GRAY);
        greenLight.setFill(Color.GRAY);
    }

    private void switchToYellow() {
        redLight.setFill(Color.GRAY);
        yellowLight.setFill(Color.YELLOW);
        greenLight.setFill(Color.GRAY);
    }

    private void switchToGreen() {
        redLight.setFill(Color.GRAY);
        yellowLight.setFill(Color.GRAY);
        greenLight.setFill(Color.GREEN);
    }
}
