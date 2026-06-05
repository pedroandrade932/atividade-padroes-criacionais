package br.edu.ifpb.ads.padroes.atv2.modules;
import com.google.inject.AbstractModule;
import br.edu.ifpb.ads.padroes.atv2.adapters.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.adapters.StripeGateway;


public class StripeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(StripeGateway.class);
    }
}