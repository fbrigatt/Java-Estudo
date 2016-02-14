package com.thenewboston.tableview;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewWindow extends Application {

	private Scene scene;
	private Stage window;
	TableView<Product> table;
	TextField nameInput, priceInput, quantityInput;
	private Button addButton;
	private Button deleteButton;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("TableView");

		// Name Column
		TableColumn<Product, String> nameColumn = new TableColumn<>("Nome");
		nameColumn.setMinWidth(100);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

		// Price Column
		TableColumn<Product, Double> priceColumn = new TableColumn<>("Pre�o");
		priceColumn.setMinWidth(100);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

		// Quantity Column
		TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Quantidade");
		quantityColumn.setMinWidth(50);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

		// Name Input
		nameInput = new TextField();
		nameInput.setPromptText("Nome");
		nameInput.setMinWidth(100);

		// Price Input
		priceInput = new TextField();
		priceInput.setPromptText("Preço");
		priceInput.setMinWidth(100);

		// Name Input
		quantityInput = new TextField();
		quantityInput.setPromptText("Quantidade");
		quantityInput.setMinWidth(100);

		// Button
		addButton = new Button("Adicionar");
		addButton.setOnAction(e -> {
			addButtonClicked();
		});
		addButton.defaultButtonProperty().bind(addButton.focusedProperty());

		deleteButton = new Button("Deletar");
		deleteButton.setOnAction(e -> {
			deleteButtonClicked();
		});
		deleteButton.defaultButtonProperty().bind(deleteButton.focusedProperty());

		// HBox para os botoes
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);

		// Table
		table = new TableView<>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
		table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		// Layout
		VBox layout = new VBox();
		layout.getChildren().addAll(table, hBox);

		// Scene
		scene = new Scene(layout);
		window.setScene(scene);
		window.show();
	}

	private void addButtonClicked() {
		Product p = new Product();
		try {
			p.setName(nameInput.getText());
			p.setPrice(Double.parseDouble(priceInput.getText()));
			p.setQuantity(Integer.parseInt(quantityInput.getText()));
			// if (p.getName().isEmpty()) {
			// System.out.println("vazio");
			// }

			table.getItems().add(p);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor Vazio");
		}
		nameInput.clear();
		priceInput.clear();
		quantityInput.clear();
	}

	private void deleteButtonClicked() {
		ObservableList<Product> produtoSelecionado, todosProdutos;
		todosProdutos = table.getItems();
		produtoSelecionado = table.getSelectionModel().getSelectedItems();

		// boolean answer = ConfirmBox.display("Title of Window ...",
		// "Tem certeza que deseja excluir esses arquivos ?");
		// if (answer) {
		//
		// }
		produtoSelecionado.forEach(todosProdutos::remove);

	}

	// Get all of the products
	public ObservableList<Product> getProduct() {

		ObservableList<Product> produtos = FXCollections.observableArrayList();
		produtos.add(new Product("Laptop", 859.00, 20));
		produtos.add(new Product("Camiseta", 39.00, 198));
		produtos.add(new Product("TV", 1759.00, 50));
		produtos.add(new Product("Short", 59.00, 120));
		produtos.add(new Product("Smartphone", 959.00, 10));

		return produtos;
	}

}