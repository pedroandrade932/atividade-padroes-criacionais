package br.edu.ifpb.ads.padroes.atv2.adapters;
import br.edu.ifpb.ads.padroes.atv2.simulators.PayPalSdk;


public class PayPalGateway implements PagamentoGateway {
    private final PayPalSdk paypalSdk = new PayPalSdk();

    @Override
    public boolean processarPagamento(double valor) {
        return paypalSdk.executeTransaction(valor);
    }
}