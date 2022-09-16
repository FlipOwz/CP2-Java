package br.com.fiap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController {

    @FXML private TextField textFieldTitulo;
    @FXML private TextField textFieldIngredientes;
    @FXML private TextField textFieldModo;
    @FXML private TextField textFieldCusto;
    @FXML private TextField textFieldCategoria;

    @FXML private ListView<Receitas> listView;

    private List<Receitas> lista = new ArrayList<>();

    public void salvar(){
        lista.add(guardarReceitaDoCadastro());
        mostrarAlerta("Sua receita foi cadastrada com sucesso!");
        limparFormulario();
        atualizarListView();
    }

    private void atualizarListView() {
        listView.getItems().clear();
        listView.getItems().addAll(lista);
    }

    private void limparFormulario() {
        textFieldTitulo.setText("");
        textFieldIngredientes.setText("");
        textFieldModo.setText("");
        textFieldCusto.setText("");
        textFieldCategoria.setText("");
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }

    private Receitas guardarReceitaDoCadastro() {
        String titulo = textFieldTitulo.getText();
        String ingredientes = textFieldIngredientes.getText();
        String modo = textFieldModo.getText();
        double custo = Double.valueOf( textFieldCusto.getText() );
        String categoria = textFieldCategoria.getText();
        
        return new Receitas(titulo, ingredientes, modo, custo, categoria);
    } 
}