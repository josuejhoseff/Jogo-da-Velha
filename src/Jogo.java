import java.util.Scanner;

public class Jogo {

	Scanner sc = new Scanner(System.in);
	private Tabuleiro tabuleiro;
	private int rodada = 1, vez = 1;
	private Jogador j1 = new Jogador(1);

	public Jogo() {
		tabuleiro = new Tabuleiro();

		while (Jogar())
			;
	}

	public boolean Jogar() {
		System.out.println("Jogo da Velha \n");
		tabuleiro.exibirJogadores();
		tabuleiro.exibirTabuleiro();
		if (j1.verificarVitoria(tabuleiro) || tabuleiro.tabuleiroCompleto()) {
			return false;
		}
		j1.jogada(tabuleiro);
		if (j1.verificarJogada(tabuleiro)) {
			if (j1.getJogador() == 1) {
				j1.jogar(tabuleiro, j1.getJogada());
				j1.setJogador(2);
			} else {
				j1.jogar(tabuleiro, j1.getJogada());
				j1.setJogador(1);
			}
		}
		tabuleiro.limparTela();
		return true;
	}

}
