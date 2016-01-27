package bracode;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.JOptionPane;

/**
 * pacote View
 * 
 * @author Raphael
 *
 */
public class TelaLogin extends Application {

	private AnchorPane pane;
	private Scene scene;

	private Label textLogin;
	private Label textPassword;

	private TextField user;
	private PasswordField password;

	private Button login;
	private Button logout;

	// inicializar os componentes
	private void initComponent() {
		textLogin = new Label("Usuario");
		textLogin.setFont(new Font(16));

		textPassword = new Label("Senha");
		textPassword.setFont(new Font(16));

		user = new TextField();
		user.setPromptText("bracode");

		password = new PasswordField();
		password.setPromptText("bracode");

		login = new Button("Entrar");
		logout = new Button("Sair");
	}

	// definir os layout dos componentes
	private void initLayout() {

		textLogin.setLayoutX((pane.getWidth() - textLogin.getWidth()) / 2);
		textLogin.setLayoutY(40);

		user.setLayoutX((pane.getWidth() - user.getWidth()) / 2);
		user.setLayoutY(70);

		textPassword
				.setLayoutX((pane.getWidth() - textPassword.getWidth()) / 2);
		textPassword.setLayoutY(100);

		password.setLayoutX((pane.getWidth() - password.getWidth()) / 2);
		password.setLayoutY(130);

		login.setLayoutX((pane.getWidth() - login.getWidth()) / 2);
		login.setLayoutY(200);

		logout.setLayoutX((pane.getWidth() - logout.getWidth()) / 2);
		logout.setLayoutY(230);

	}

	@Override
	public void start(Stage stage) throws Exception {
		pane = new AnchorPane();
		scene = new Scene(pane, 600, 400);
		initComponent();

		eventosBotoes();

		// adicionando componentes no painel
		pane.getChildren().addAll(textLogin, textPassword, user, password,
				login, logout);
		// pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, grey 0%, silver 100%);");
		// login.setStyle("-fx-cursor: hand;");
		// login.setStyle("-fx-background-color: linear-gradient(gray,yellow)");
		// logout.setStyle("-fx-cursor: hand; -fx-background-color: linear-gradient(gray,orange)");

		pane.getStyleClass().add("pane");
		login.getStyleClass().add("login");
		logout.getStyleClass().add("logout");

		// adicionar arquivo css na cena
		scene.getStylesheets().add("exemplos/bracode/estilo.css");

		stage.setScene(scene);
		stage.setTitle("Tela de Login");
		stage.show();

		initLayout();

	}

	private void eventosBotoes() {
		// ação do botão Login
		login.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				if (user.getText().equals("bracode")
						&& password.getText().equals("bracode")) {
					JOptionPane.showMessageDialog(null, "Usuario Autenticado",
							"Autenticação", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null,
							"Usuario NÃO Autenticado", "Autenticação",
							JOptionPane.ERROR_MESSAGE);

				}
			}
		});

		// ação do botão Sair
		logout.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}

}
