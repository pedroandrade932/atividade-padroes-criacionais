package br.edu.ifpb.ads.padroes.atv1.rpg;

import java.util.Arrays;

import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.armory.Armadura;

public class Personagem implements Cloneable {

    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    private Personagem(Builder builder) {
        this.nome = builder.nome;
        this.raca = builder.raca;
        this.classe = builder.classe;
        this.forca = builder.forca;
        this.inteligencia = builder.inteligencia;
        this.agilidade = builder.agilidade;
        this.vida = builder.vida;
        this.mana = builder.mana;
        this.arma = builder.arma;
        this.armadura = builder.armadura;
        this.habilidades = builder.habilidades;
    }

    @Override
    public Personagem clone() {
        try {
            Personagem clonado = (Personagem) super.clone();
            if (this.habilidades != null) {
                clonado.habilidades = this.habilidades.clone();
            }
            return clonado;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Erro ao clonar personagem.");
        }
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getRaca() { return raca; }
    public String getClasse() { return classe; }
    public int getForca() { return forca; }
    public void setForca(int forca) { this.forca = forca; }
    public int getInteligencia() { return inteligencia; }
    public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }
    public int getAgilidade() { return agilidade; }
    public void setAgilidade(int agilidade) { this.agilidade = agilidade; }
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }
    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }
    public Arma getArma() { return arma; }
    public void setArma(Arma arma) { this.arma = arma; }
    public Armadura getArmadura() { return armadura; }
    public void setArmadura(Armadura armadura) { this.armadura = armadura; }
    public String[] getHabilidades() { return habilidades; }
    public void setHabilidades(String[] habilidades) { this.habilidades = habilidades; }

    @Override
    public String toString() {
        return String.format("%s - %s %s (F:%d, I:%d, A:%d, V:%d, M:%d)",
                nome, raca, classe, forca, inteligencia, agilidade, vida, mana);
    }

    public static class Builder {
        private String nome;
        private String raca;
        private String classe;
        private int forca;
        private int inteligencia;
        private int agilidade;
        private int vida;
        private int mana;
        private Arma arma;
        private Armadura armadura;
        private String[] habilidades;

        public Builder setNome(String nome) { this.nome = nome; return this; }
        public Builder setRaca(String raca) { this.raca = raca; return this; }
        public Builder setClasse(String classe) { this.classe = classe; return this; }
        
        public Builder setAtributos(int forca, int inteligencia, int agilidade, int vida, int mana) {
            this.forca = forca;
            this.inteligencia = inteligencia;
            this.agilidade = agilidade;
            this.vida = vida;
            this.mana = mana;
            return this;
        }

        public Builder setArma(Arma arma) { this.arma = arma; return this; }
        public Builder setArmadura(Armadura armadura) { this.armadura = armadura; return this; }
        public Builder setHabilidades(String[] habilidades) { this.habilidades = habilidades; return this; }

        public Personagem build() {
            return new Personagem(this);
        }
    }
}