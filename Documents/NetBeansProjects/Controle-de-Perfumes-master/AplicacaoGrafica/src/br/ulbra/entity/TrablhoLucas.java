package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TrablhoLucas {

    public ArrayList<String> listaIdeal;
    public ArrayList<String> listaarrumado;

    public TrablhoLucas() {
        listaIdeal = new ArrayList<>();
        listaarrumado = new ArrayList<>();
    }

    public void salvar(String produto) {
        listaIdeal.add(produto);
        listaarrumado.add(produto);
        JOptionPane.showMessageDialog(null, produto + " Salvo com sucesso");
    }

    public String listar() {
        String resultado = "Lista de produtos\n";

        if (!listaarrumado.isEmpty()) {
            for (int i = 0; i < listaarrumado.size(); i++) {
                resultado += listaarrumado.get(i) + "\n";
            }
        } else {
            resultado = "Lista vazia!!";
        }

        return resultado;
    }

    public void excluir(int cod) {
        if (!listaarrumado.isEmpty()) {
            cod = cod - 1;
            if (cod >= 0 && cod < listaarrumado.size()) {
                if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o "
                        + listaarrumado.get(cod), "Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    listaIdeal.remove(cod);
                    listaarrumado.remove(cod);
                    JOptionPane.showMessageDialog(null, "Excluído com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível excluir da lista vazia");
        }
    }

    public int quantidade() {
        return listaIdeal.size();
    }

    public void limparLista() {
        listaIdeal.clear();
        listaarrumado.clear();
    }

    public void alterar(int cod, String novoNome) {
        if (!listaarrumado.isEmpty()) {
            cod = cod - 1;
            if (cod >= 0 && cod < listaarrumado.size()) {
                if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar o "
                        + listaarrumado.get(cod), "Alteração", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    listaIdeal.set(cod, novoNome);
                    listaarrumado.set(cod, novoNome);
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu Algum Erro");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível alterar uma lista vazia");
        }
    }

    public void ordenarAlfabeticamente() {
        listaarrumado.sort(String::compareTo);
    }

    public void resetarLista() {
        listaarrumado.clear();
        listaarrumado.addAll(listaIdeal);
    }

    public void limpar() {
        listaIdeal.clear();
        listaarrumado.clear();
    }
}
