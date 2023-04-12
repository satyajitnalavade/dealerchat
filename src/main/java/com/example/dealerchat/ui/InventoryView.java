package com.example.dealerchat.ui;

import com.example.dealerchat.model.Car;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("inventory")
public class InventoryView extends VerticalLayout {

    private Grid<Car> carGrid;
    private TextField makeFilter;
    private TextField modelFilter;
    private Button searchButton;

    public InventoryView() {
        // Set up the UI components
        carGrid = new Grid<>();
        carGrid.addColumn(Car::getMake).setHeader("Make");
        carGrid.addColumn(Car::getModel).setHeader("Model");
        carGrid.addColumn(Car::getYear).setHeader("Year");
        carGrid.addColumn(Car::getPrice).setHeader("Price");

        makeFilter = new TextField("Make");
        modelFilter = new TextField("Model");
        searchButton = new Button("Search", event -> searchCars());

        // Add the components to the layout
        add(makeFilter, modelFilter, searchButton, carGrid);
    }

    private void searchCars() {
        // TODO: Implement the search functionality
    }

}
