import java.util.ArrayList;

public class Bispo extends Peca{
    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro) {
        Posicao posicaoAtual = this.getPosicao();

        int possicaoNoTabuleiro = tabuleiro.getPosicoes().indexOf(posicaoAtual);

        ArrayList<Posicao> possiveisMovimentos = new ArrayList<>();


        for (int i = (possicaoNoTabuleiro % 8 == 0 ?
                64 : possicaoNoTabuleiro+7); // IF ternário //
                i < tabuleiro.getPosicoes().size(); i+=7) {

            Posicao posicao = tabuleiro.getPosicoes().get(i);
            verificaPeca(posicao, possiveisMovimentos);
            if (i%8==0){
                break;
            }

        }

        for (int i = (possicaoNoTabuleiro % 8 == 0 ? -1 : possicaoNoTabuleiro-7); i > 0; i-=7) {
            Posicao posicao = tabuleiro.getPosicoes().get(i);

            verificaPeca(posicao, possiveisMovimentos);


            if ((i + 1) %8==0){
                break;
            }
        }

        for (int i = (possicaoNoTabuleiro % 8 == 0 ? 64 : possicaoNoTabuleiro+9); i < tabuleiro.getPosicoes().size(); i+=9) {
            Posicao posicao = tabuleiro.getPosicoes().get(i);

            verificaPeca(posicao, possiveisMovimentos);

            if ((i + 1) %8==0){
                break;
            }
        }

        for (int i = (possicaoNoTabuleiro % 8 == 0 ? -1 : possicaoNoTabuleiro-9); i > 0; i-=9) {
            Posicao posicao = tabuleiro.getPosicoes().get(i);
            verificaPeca(posicao, possiveisMovimentos);
            if (i %8==0){
                break;
            }
        }

//        for (Posicao posicaoFor:
//                tabuleiro.getPosicoes()) {
//
//        }
        return possiveisMovimentos;
    }


}
