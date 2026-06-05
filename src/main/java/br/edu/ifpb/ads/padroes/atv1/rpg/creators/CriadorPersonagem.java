package br.edu.ifpb.ads.padroes.atv1.rpg.creators;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.ComponentesPersonagemFactory;

public abstract class CriadorPersonagem {

    protected abstract ComponentesPersonagemFactory obterFactory();
    protected abstract String obterNomeRaca();

    public Personagem criarPersonagem(String nome, String classe) {
        ComponentesPersonagemFactory factory = obterFactory();
        int[] atributos = factory.obterAtributosBase(classe);

        if (atributos == null) {
            System.out.println("Combinação inválida: " + obterNomeRaca() + " " + classe);
            return null;
        }

        return new Personagem.Builder()
                .setNome(nome)
                .setRaca(obterNomeRaca())
                .setClasse(classe)
                .setAtributos(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4])
                .setArma(factory.criarArma(classe))
                .setArmadura(factory.criarArmadura(classe))
                .setHabilidades(factory.criarHabilidades(classe))
                .build();
    }

    public Personagem criarPersonagemEspecial(String nome, String classe) {
        Personagem base = criarPersonagem(nome, classe);
        if (base == null) return null;

        if (obterNomeRaca().equals("Humano") && classe.equals("Guerreiro")) {
            Personagem especial = base.clone(); 
            especial.setNome(nome + " o Lendário");
            especial.setForca(18);
            especial.setInteligencia(10);
            especial.setAgilidade(12);
            especial.setVida(140);
            especial.setMana(40);
            especial.setArma(new Arma("Excalibur", 35, "Espada"));
            especial.setArmadura(new Armadura("Armadura do Rei", 30, "Pesada"));
            especial.setHabilidades(new String[]{"Investida", "Bloqueio", "Liderança"});
            return especial;
        }

        return base;
    }
}