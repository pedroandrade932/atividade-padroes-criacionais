package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;
import br.edu.ifpb.ads.padroes.atv1.rpg.creators.CriadorElfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.creators.CriadorHumano;
import br.edu.ifpb.ads.padroes.atv1.rpg.creators.CriadorOrc;
import br.edu.ifpb.ads.padroes.atv1.rpg.creators.CriadorPersonagem;

public class Main {
        public static void main(String[] args) {
        ConfiguracaoJogo config = ConfiguracaoJogo.getInstance();
        config.setNivelDificuldade(3);

        CriadorPersonagem criadorHumano = new CriadorHumano();
        CriadorPersonagem criadorOrc = new CriadorOrc();

        Personagem magoHumano = criadorHumano.criarPersonagem("Gandalf", "Mago");
        Personagem guerreiroOrc = criadorOrc.criarPersonagem("Thrall", "Guerreiro");
        Personagem guerreiroLendario = criadorHumano.criarPersonagemEspecial("Aragorn", "Guerreiro");
                                                                                                                                                                                   
        System.out.println(magoHumano);
        System.out.println(guerreiroOrc);
        System.out.println(guerreiroLendario);
    }
}
