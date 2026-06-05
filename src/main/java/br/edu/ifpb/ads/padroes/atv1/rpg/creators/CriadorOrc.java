package br.edu.ifpb.ads.padroes.atv1.rpg.creators;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.ComponentesPersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.OrcComponentesFactory;

public class CriadorOrc extends CriadorPersonagem {
    @Override
    protected ComponentesPersonagemFactory obterFactory() {
        return new OrcComponentesFactory();
    }

    @Override
    protected String obterNomeRaca() {
        return "Orc";
    }
}