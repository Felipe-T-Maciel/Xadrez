import java.util.ArrayList;

public abstract class Peca {
    private String cor;
    private Posicao posicao;

    public Posicao getPosicao() {
        return posicao;
    }

    public void mover(Tabuleiro tabuleiro,
                      Posicao posicao){
        ArrayList<Posicao> possiveisPosicoes = possiveisMovimentos(tabuleiro);
        for (Posicao posicaoFor:
             possiveisPosicoes) {
            if(posicaoFor == posicao){
                posicao.setPeca(this); //Atribuindo a peça ara a nova posição no tabuleiro
                this.posicao.setPeca(null); //Removendo a peça da posição anterior
                this.posicao = posicao; //Trocando a posição atual da peça
                break;
            }
        }
        this.posicao = posicao;
    }

    public abstract ArrayList<Posicao> possiveisMovimentos(
            Tabuleiro tabuleiro
    );

    //public abstract char icone();


}
