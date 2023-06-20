/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio.dio.banco;

/**
 *
 * @author Henrique Louro
 */

public class DesafioDioBanco {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Henrique");
        
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        
        cc.depositar(100);
        cc.transferir(cc.getSaldo(), cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
    
}
