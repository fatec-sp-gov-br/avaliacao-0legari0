package br.edu.poo;

public class Personagem {

    public Personagem(String nome,
                      int vida,
                      int ataque,
                      int defesa) {

    }

    public void atacar(Personagem inimigo) {

    }

    public void receberDano(int dano) {

    }

    public void usarPocao(Pocao pocao) {

    }

    public boolean estaVivo() {
        return false;
    }

    public String getNome() {
        return null;
    }

    public int getVida() {
        return 0;
    }
}
package br.edu.poo;

public class Personagem {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private boolean pocaoUtilizada;

    public Personagem(String nome,
                      int vida,
                      int ataque,
                      int defesa) {

        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.pocaoUtilizada = false;
    }

    public void atacar(Personagem inimigo) {

        int dano = this.ataque - inimigo.defesa;

        if (dano < 1) {
            dano = 1;
        }

        inimigo.receberDano(dano);

        System.out.println(nome + " ataca " + inimigo.getNome());
        System.out.println(inimigo.getNome() +
                " possui " + inimigo.getVida() +
                " de vida\n");
    }

    public void receberDano(int dano) {

        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    public void usarPocao(Pocao pocao) {

        if (!pocaoUtilizada) {

            vida += pocao.getCura();
            pocaoUtilizada = true;

            System.out.println(nome +
                    " usa " + pocao.getNome());

            System.out.println(nome +
                    " possui " + vida +
                    " de vida\n");
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
}
