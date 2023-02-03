
public class Tabuleiro {
	
	private int[][] tabuleiro = new int[3][3];
	
	
	public int getTabuleiro(int[] jogada) {
		return tabuleiro[jogada[0]][jogada[1]];
	}
	public void setTabuleiro(int[] jogada, int jogador) {
		if(jogador ==1) {
			tabuleiro[jogada[0]][jogada[1]] = -1;
		}
		else {
			tabuleiro[jogada[0]][jogada[1]] = 1;
		}
	}
	public void exibirJogadores() {
		System.out.println("Jogador 1 - X");
		System.out.println("Jogador 2 - O");
	}

	public void exibirTabuleiro() {
		System.out.println(" 0    1    2  ");
		for(int i=0; i<3;i++) {
			for(int j=0; j<3; j++) {
				if(tabuleiro[i][j] == 0) {
					System.out.print("   ");
				}
				if(tabuleiro[i][j] == -1) {
					System.out.print(" X ");
				}
				if(tabuleiro[i][j] ==1) {
					System.out.print(" O ");
				}
				if(j == 0 || j==1) {
					System.out.print("| ");
				}
			}
			System.out.println(" "+ i);
		}
	}
	
	public int checaLinhas(){
        for(int i=0 ; i<3 ; i++){

            if( (tabuleiro[i][0] + tabuleiro[i][1] + tabuleiro[i][2]) == -3)
                return -1;
            if( (tabuleiro[i][0] + tabuleiro[i][1] + tabuleiro[i][2]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int checaColunas(){
        for(int j=0 ; j<3 ; j++){

            if( (tabuleiro[0][j] + tabuleiro[1][j] + tabuleiro[2][j]) == -3)
                return -1;
            if( (tabuleiro[0][j] + tabuleiro[1][j] + tabuleiro[2][j]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int checaDiagonais(){
        if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == -3)
            return -1;
        if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3)
            return 1;
        if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == -3)
            return -1;
        if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3)
            return 1;
        
        return 0;
    }

    public boolean tabuleiroCompleto(){
    	int contador =0;
        for(int i=0 ; i<3 ; i++) {
            for(int j=0 ; j<3 ; j++) {
                if( tabuleiro[i][j]!=0) {
                	contador++;
                }
            }
        }
        if(contador == 9) {
        	System.out.println();
        	System.out.println("Empate");
        	return true;
        }
		return false;
    }
	
	public void limparTela() {
		for(int i=0; i<200;i++) {
			System.out.println("");
		}
	}
}
