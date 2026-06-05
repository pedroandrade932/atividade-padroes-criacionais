package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Armadura;

public class HumanoComponentesFactory implements ComponentesPersonagemFactory {
    @Override
    public Arma criarArma(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new Arma("Espada de Ferro", 25, "Espada");
            case "Mago" -> new Arma("Cajado Mágico", 15, "Cajado");
            case "Arqueiro" -> new Arma("Arco Élfico", 20, "Arco");
            default -> null;
        };
    }

    @Override
    public Armadura criarArmadura(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new Armadura("Armadura de Placas", 20, "Pesada");
            case "Mago" -> new Armadura("Vestes Mágicas", 8, "Leve");
            case "Arqueiro" -> new Armadura("Armadura de Couro", 12, "Média");
            default -> null;
        };
    }

    @Override
    public String[] criarHabilidades(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new String[]{"Investida", "Bloqueio"};
            case "Mago" -> new String[]{"Bola de Fogo", "Cura"};
            case "Arqueiro" -> new String[]{"Tiro Certeiro", "Chuva de Flechas"};
            default -> null;
        };
    }

    @Override
    public int[] obterAtributosBase(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new int[]{15, 8, 10, 120, 30};
            case "Mago" -> new int[]{6, 18, 8, 80, 150};
            case "Arqueiro" -> new int[]{10, 12, 16, 100, 70};
            default -> null;
        };
    }
}