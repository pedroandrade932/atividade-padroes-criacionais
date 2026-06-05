package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Armadura;

public class OrcComponentesFactory implements ComponentesPersonagemFactory {
    @Override
    public Arma criarArma(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new Arma("Machado de Guerra", 30, "Machado");
            case "Mago" -> new Arma("Cajado Tribal", 12, "Cajado");
            case "Arqueiro" -> new Arma("Arco de Osso", 24, "Arco");
            default -> null;
        };
    }

    @Override
    public Armadura criarArmadura(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new Armadura("Armadura Brutal", 25, "Pesada");
            case "Mago" -> new Armadura("Vestes Xamânicas", 6, "Leve");
            case "Arqueiro" -> new Armadura("Couro de Besta", 16, "Média");
            default -> null;
        };
    }

    @Override
    public String[] criarHabilidades(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new String[]{"Fúria", "Pancada Devastadora"};
            case "Mago" -> new String[]{"Magia Sombria", "Invocação"};
            case "Arqueiro" -> new String[]{"Tiro Brutal", "Intimidação"};
            default -> null;
        };
    }

    @Override
    public int[] obterAtributosBase(String classe) {
        return switch (classe) {
            case "Guerreiro" -> new int[]{20, 6, 8, 150, 20};
            case "Mago" -> new int[]{10, 14, 6, 100, 120};
            case "Arqueiro" -> new int[]{14, 8, 12, 120, 40};
            default -> null;
        };
    }
}