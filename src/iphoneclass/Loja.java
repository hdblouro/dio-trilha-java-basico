/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iphoneclass;

/**
 *
 * @author hdblo
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        // Métodos Telefone
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        // Métodos Tocador
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        //Métodos Navegador
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
    }
    
}
