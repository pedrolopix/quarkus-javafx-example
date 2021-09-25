package org.acme.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javax.enterprise.inject.spi.CDI;
import javax.enterprise.util.AnnotationLiteral;
import org.acme.javafx.conf.StartupScene;

public class FxApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        CDI.current().getBeanManager().fireEvent(primaryStage, new AnnotationLiteral<StartupScene>() {
        });
    }

}
