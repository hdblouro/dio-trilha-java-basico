/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iphoneclass;

/**
 *
 * @author Henrique Louro
 */

public class IPhone implements Telefone, Tocador, Navegador{

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página web...");
    }

    public void adicionarNovaAba() {
        System.out.println("Acidionando nova aba no navegador...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página web...");
    }
    
}
