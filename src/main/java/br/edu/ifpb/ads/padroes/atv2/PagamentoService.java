package br.edu.ifpb.ads.padroes.atv2;
import com.google.inject.Inject;
import br.edu.ifpb.ads.padroes.atv2.adapters.PagamentoGateway;


public class PagamentoService {
    private final PagamentoGateway gateway;

    // A dependência é injetada via construtor
    @Inject
    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public void pagar(double valor) {
        System.out.println("Iniciando fluxo de pagamento...");
        boolean sucesso = gateway.processarPagamento(valor);
        
        if (sucesso) {
            System.out.println("Pagamento concluído com sucesso!\n");
        } else {
            System.out.println("Falha ao processar o pagamento.\n");
        }
    }
}