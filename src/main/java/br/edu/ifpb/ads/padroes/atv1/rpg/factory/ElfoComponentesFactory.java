package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Armadura;

public class ElfoComponentesFactory implements ComponentesPersonagemFactory {
    @Override
    public Arma criarArma(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new Arma("Lâmina Élfica", 22, "Espada");
            case "Mago" -> new Arma("Cajado da Natureza", 18, "Cajado");
            case "Arqueiro" -> new Arma("Arco Longo Élfico", 28, "Arco");
            default -> null;
        };
    }

    @Override
    public Armadura criarArmadura(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new Armadura("Cota de Malha Élfica", 15, "Média");
            case "Mago" -> new Armadura("Mantos Élficos", 10, "Leve");
            case "Arqueiro" -> new Armadura("Armadura de Couro Élfico", 14, "Média");
            default -> null;
        };
    }

    @Override
    public String[] criarHabilidades(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new String[]{"Dança das Lâminas", "Agilidade Élfica"};
            case "Mago" -> new String[]{"Magia da Natureza", "Teleporte"};
            case "Arqueiro" -> new String[]{"Tiro Múltiplo", "Camuflagem"};
            default -> null;
        };
    }

    @Override
    public int[] obterAtributosBase(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new int[]{12, 14, 16, 100, 60};
            case "Mago" -> new int[]{4, 20, 14, 70, 180};
            case "Arqueiro" -> new int[]{8, 16, 20, 90, 100};
            default -> null;
        };
    }
}