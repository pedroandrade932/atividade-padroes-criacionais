package br.edu.ifpb.ads.padroes.atv1.rpg.creators;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.ComponentesPersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.HumanoComponentesFactory;

public class CriadorHumano extends CriadorPersonagem {
    @Override
    protected ComponentesPersonagemFactory obterFactory() {
        return new HumanoComponentesFactory();
    }

    @Override
    protected String obterNomeRaca() {
        return "Humano";
    }
}