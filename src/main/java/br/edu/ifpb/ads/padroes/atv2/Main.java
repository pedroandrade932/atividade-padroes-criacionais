package br.edu.ifpb.ads.padroes.atv2;
import com.google.inject.Guice;
import com.google.inject.Injector;
import br.edu.ifpb.ads.padroes.atv2.modules.PagSeguroModule;
import br.edu.ifpb.ads.padroes.atv2.modules.StripeModule;
import br.edu.ifpb.ads.padroes.atv2.modules.PayPalModule;

public class Main {
    public static void main(String[] args) {
        double valorCompra = 150.00;

        System.out.println("-=-=-=-= Compra Via Stripe =-=-=-=-");
        Injector injectorStripe = Guice.createInjector(new StripeModule());
        PagamentoService serviceStripe = injectorStripe.getInstance(PagamentoService.class);
        serviceStripe.pagar(valorCompra);
        
        System.out.println("-=-=-=-= Compra Via PagSeguro =-=-=-=-");
        Injector injectorPagSeguro = Guice.createInjector(new PagSeguroModule());
        PagamentoService servicePagSeguro = injectorPagSeguro.getInstance(PagamentoService.class);
        servicePagSeguro.pagar(valorCompra);

        System.out.println("-=-=-=-= Compra Via PayPal =-=-=-=-");
        Injector injectorPayPal = Guice.createInjector(new PayPalModule());
        PagamentoService servicePayPal = injectorPayPal.getInstance(PagamentoService.class);
        servicePayPal.pagar(valorCompra);

    }
}