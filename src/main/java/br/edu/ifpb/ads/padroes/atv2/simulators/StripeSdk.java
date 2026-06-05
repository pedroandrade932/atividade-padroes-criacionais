package br.edu.ifpb.ads.padroes.atv2.simulators;


public class StripeSdk {
    public boolean chargeCard(double amountInCents) {
        System.out.println("[Stripe SDK] Cobrando cartão no valor de " + amountInCents + " centavos.");
        return true;
    }
}
