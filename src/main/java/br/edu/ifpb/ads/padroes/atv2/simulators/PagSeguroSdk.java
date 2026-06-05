package br.edu.ifpb.ads.padroes.atv2.simulators;


public class PagSeguroSdk {
    public boolean processarBoleto(double valorBRL) {
        System.out.println("[PagSeguro SDK] Gerando e processando pagamento de R$ " + valorBRL);
        return true;
    }
}