package br.edu.ifpb.ads.padroes.atv2.adapters;

public interface PagamentoGateway {
    boolean processarPagamento(double valor);
}