package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ListView<Vehicle> vehiclesListView;

    //ArrayList<Vehicle> vehicles = new ArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //have to interact with ObservableList Collection
        ObservableList<Vehicle> vehicles = vehiclesListView.getItems();

        Vehicle vehicle1 = new Vehicle("Mazda5",2018);
        Vehicle vehicle2 = new Vehicle("Mazda3", 2019);
        Vehicle vehicle3 = new Vehicle("Audi A4", 2020);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);
    }



}
