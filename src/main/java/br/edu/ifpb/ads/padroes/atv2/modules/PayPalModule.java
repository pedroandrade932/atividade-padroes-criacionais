package br.edu.ifpb.ads.padroes.atv2.modules;

import com.google.inject.AbstractModule;
import br.edu.ifpb.ads.padroes.atv2.adapters.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.adapters.PayPalGateway;


public class PayPalModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(PayPalGateway.class);
    }
}
