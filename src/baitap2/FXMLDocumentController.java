/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Admin
 */
public class FXMLDocumentController implements Initializable {
    @FXML private TextField txtChieucao;
    @FXML private TextField txtChieurong;
    
    public void tinhBMIHandeler(ActionEvent event)
    {
        double cao = Double.parseDouble(this.txtChieucao.getText());
        double nang = Double.parseDouble(this.txtChieurong.getText());
        double bmi = nang/Math.pow(cao, 2);
        Alert aler = new Alert(Alert.AlertType.INFORMATION);
        
        aler.setContentText(String.valueOf(bmi));
        aler.show();
        
    }
    
      @Override
      public void initialize(URL url, ResourceBundle rb)
      {}

   
    
}
