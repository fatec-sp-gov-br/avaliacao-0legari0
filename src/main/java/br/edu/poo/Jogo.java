package br.edu.poo;

public class Jogo {

    public static void main(String[] args) {

        // Implemente a batalha aqui

    }

}
package br.edu.poo;

public class Jogo {

    public static void main(String[] args) {

        Personagem artemis = new Personagem(
                "Artemis", 30, 8, 2);

        Personagem goblin = new Personagem(
                "Goblin", 20, 5, 1);

        Pocao pequena = new Pocao(
                "Poção Pequena", 10);

        System.out.println("=== BATALHA INICIADA ===\n");

        artemis.atacar(goblin);

        goblin.atacar(artemis);

        goblin.usarPocao(pequena);

        while (artemis.estaVivo() &&
               goblin.estaVivo()) {

            artemis.atacar(goblin);

            if (!goblin.estaVivo()) {
                break;
            }

            goblin.atacar(artemis);
        }

        System.out.println("\n=== FIM DA BATALHA ===\n");

        if (artemis.estaVivo()) {
            System.out.println(
                "Vencedor: " + artemis.getNome());
        } else {
            System.out.println(
                "Vencedor: " + goblin.getNome());
        }
    }
}
