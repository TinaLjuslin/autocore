package com.wac.autocore.gui.controller;

import com.wac.autocore.gui.launcher.ConsoleRedirector;
import com.wac.autocore.gui.launcher.GarageServiceBridge;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML
    private TextArea consoleOutput;

    @FXML
    public void initialize() {
        // Omdirigera System.out till rutan i botten
        ConsoleRedirector.redirectTo(consoleOutput);

        System.out.println("Systemet startat via FXML-arkitektur.");
        GarageServiceBridge.getInstance().showCustomers();
    }
}