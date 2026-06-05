package br.edu.ifpb.ads.padroes.atv2.simulators;


public class PayPalSdk {
    public boolean executeTransaction(double amount) {
        System.out.println("[PayPal SDK] Processando transação de USD " + amount);
        return true;
    }
}
