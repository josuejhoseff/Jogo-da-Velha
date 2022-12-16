import java.util.Scanner;

public class Jogador {
	Scanner sc = new Scanner(System.in);
	private int[] jogada = new int[2];
	private int jogador;
	

	public Jogador(int jogador) {
		super();
		this.jogador = jogador;
	}

	public int[] getJogada() {
		return this.jogada;
	}

	public void setJogada(int[] jogada) {
		this.jogada = jogada;
	}

	public int getJogador() {
		return jogador;
	}

	public void setJogador(int jogador) {
		this.jogador = jogador;
	}

	public void jogada(Tabuleiro tabuleiro) {
		System.out.printf("Vez do jogador %d %n", jogador);
		System.out.print("Linha: ");
		jogada[0] = sc.nextInt();
		System.out.print("Coluna: ");
		jogada[1] = sc.nextInt();
	}

	public boolean verificarJogada(Tabuleiro tabuleiro) {
		if (tabuleiro.getTabuleiro(jogada) == 0) {
			return true;
		} else {
			System.out.println();
			System.out.println("Valor invalido!");
			System.out.println("Pressione 'Enter' para continuar");
			sc.nextLine();
			sc.nextLine();
		}
		return false;
	}

	public void jogar(Tabuleiro tabuleiro, int[] jogada) {
		tabuleiro.setTabuleiro(jogada, jogador);
	}
	
	public boolean verificarVitoria(Tabuleiro tabuleiro) {
		if(tabuleiro.checaLinhas()==-1 || tabuleiro.checaColunas()==-1 || tabuleiro.checaDiagonais()==-1) {
			System.out.println("");
			System.out.println("Jogador 1 venceu!");
			return true;
		}
		if(tabuleiro.checaLinhas()==1 || tabuleiro.checaColunas()==1 || tabuleiro.checaDiagonais()==1) {
			System.out.println("");
			System.out.println("Jogador 2 venceu!");
			return true;
		}
		return false;
	}
	
}
