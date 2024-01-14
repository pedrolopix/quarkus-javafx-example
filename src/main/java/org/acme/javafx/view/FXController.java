package org.acme.javafx.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.acme.javafx.service.Greeter;

@Singleton
public class FXController {

    @FXML
    Label lblMessage;

    @FXML
    TextField txtName;

    @Inject
    Greeter greeter;

    public void updateMessage() {
        String greeting = greeter.greet(txtName.getText());
        lblMessage.setText(greeting);
    }

}
