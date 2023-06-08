import java.util.ArrayList;

public class Cavalo extends Peca{
    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro) {

        ArrayList<Posicao> possiveisMovimentos = new ArrayList<>();

        Posicao posicaoAtual = this.getPosicao();

        int posicaoNoTabuleiro = tabuleiro.getPosicoes().indexOf(posicaoAtual);

        for (Posicao posicao:
                tabuleiro.getPosicoes()) {
            int indice = tabuleiro.getPosicoes().indexOf(posicao);
            if (indice == posicaoNoTabuleiro - 17 ||
                    indice == posicaoNoTabuleiro - 15 ||
                    indice == posicaoNoTabuleiro - 10 ||
                    indice == posicaoNoTabuleiro - 6 ||
                    indice == posicaoNoTabuleiro + 6 ||
                    indice == posicaoNoTabuleiro + 10 ||
                    indice == posicaoNoTabuleiro + 15 ||
                    indice == posicaoNoTabuleiro + 17){

                //Coluna H
                if ((posicaoNoTabuleiro + 1) % 8 == 0 && !(
                        indice == posicaoNoTabuleiro - 15 ||
                                indice == posicaoNoTabuleiro - 6||
                                indice == posicaoNoTabuleiro + 10||
                                indice == posicaoNoTabuleiro + 17
                        )){
                    verificaPeca(posicao, possiveisMovimentos);
                }

                //Coluna A
                else if (posicaoNoTabuleiro % 8 == 0 && !(
                        indice == posicaoNoTabuleiro + 15 ||
                                indice == posicaoNoTabuleiro + 6||
                                indice == posicaoNoTabuleiro - 10||
                                indice == posicaoNoTabuleiro - 17
                )){
                    verificaPeca(posicao, possiveisMovimentos);
                }

                //Coluna B
                else if (((posicaoNoTabuleiro-1) % 8 == 0) && !(
                        indice == posicaoNoTabuleiro - 10 ||
                                indice == posicaoNoTabuleiro + 6
                )){
                    verificaPeca(posicao, possiveisMovimentos);
                }

                //Coluna G
                else if (((posicaoNoTabuleiro+2) % 8 == 0) && !(
                        indice == posicaoNoTabuleiro - 15 ||
                                indice == posicaoNoTabuleiro + 17
                )){
                    verificaPeca(posicao, possiveisMovimentos);
                }

                else {
                    verificaPeca(posicao, possiveisMovimentos);
                }
            }
        }


        return possiveisMovimentos;
    }
}
