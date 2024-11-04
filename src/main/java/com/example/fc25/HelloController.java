package com.example.fc25;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;

import java.awt.*;
import java.awt.image.VolatileImage;

public class HelloController {
    private Squadra sq = new Squadra();
    private int length=0;
    private TextField nome,goal;
    private CheckBox captain;
    private TextArea box;
    @FXML
    private void aggiungiGiocatore(){
        /*
        Giocatore g = new Giocatore(nome.getText(), Integer.parseInt(goal.getText()), captain.isSelected());
        Functions.addPlayer(g, nome.getText(), Integer.parseInt(goal.getText()), captain.isSelected());
        arrayGiocatori[length]=g;
        length++;
         */
    }
}