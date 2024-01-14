package org.acme.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.util.AnnotationLiteral;
import org.acme.javafx.conf.StartupScene;

public class FxApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        CDI.current()
            .getBeanManager()
            .getEvent()
            .select(new AnnotationLiteral<StartupScene>() {})
            .fire(primaryStage);
    }

}
