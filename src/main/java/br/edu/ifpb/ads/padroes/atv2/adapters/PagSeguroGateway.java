package br.edu.ifpb.ads.padroes.atv2.adapters;
import br.edu.ifpb.ads.padroes.atv2.simulators.PagSeguroSdk;

public class PagSeguroGateway implements PagamentoGateway {
    private final PagSeguroSdk pagSeguroSdk = new PagSeguroSdk();

    @Override
    public boolean processarPagamento(double valor) {
        return pagSeguroSdk.processarBoleto(valor);
    }
}