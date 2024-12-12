module TodoListApp {
    requires  spring.context;
    requires  spring.beans;
    requires java.sql;
    requires org.slf4j;
    requires javafx.fxml;
    requires javafx.controls;

    opens bioskopApp;
    opens bioskopApp.entities;
    opens bioskopApp.repositories;
    opens bioskopApp.services;
    opens bioskopApp.views;
    opens bioskopApp.config;
}