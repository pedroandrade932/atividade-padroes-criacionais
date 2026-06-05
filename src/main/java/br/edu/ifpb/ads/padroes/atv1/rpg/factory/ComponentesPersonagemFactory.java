package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Armadura;

public interface ComponentesPersonagemFactory {
    Arma criarArma(String classe);
    Armadura criarArmadura(String classe);
    String[] criarHabilidades(String classe);
    int[] obterAtributosBase(String classe);
}