package org.acme.javafx.conf;

import javafx.fxml.FXMLLoader;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FXMLLoaderProducer {

    @Inject
    Instance<Object> instance;

    @Produces
    public FXMLLoader createLoader() {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(param -> instance.select(param).get());
        loader.setClassLoader(Thread.currentThread().getContextClassLoader());
        return loader;
    }
}