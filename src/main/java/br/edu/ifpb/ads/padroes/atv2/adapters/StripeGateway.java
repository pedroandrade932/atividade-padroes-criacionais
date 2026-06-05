package br.edu.ifpb.ads.padroes.atv2.adapters;
import br.edu.ifpb.ads.padroes.atv2.simulators.StripeSdk;


public class StripeGateway implements PagamentoGateway {
    private final StripeSdk stripeSdk = new StripeSdk();

    @Override
    public boolean processarPagamento(double valor) {
        // Stripe geralmente trabalha com centavos
        return stripeSdk.chargeCard(valor * 100);
    }
}