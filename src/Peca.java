import java.util.ArrayList;

public abstract class Peca {

    private String cor;
    private Posicao posicao;

    public void mover(Tabuleiro tabuleiro, Posicao posicao){
        ArrayList<Posicao> possiveisMovimentos = possiveisMovimentos(tabuleiro);
        for (Posicao movimentoPossivel:
             possiveisMovimentos) {
            if (movimentoPossivel == posicao){
                //Atribuindo a peça oara a nova posição no tabuleiro
                posicao.setPeca(this);
                //Removendo a peça da posição anterior no tabuleiro
                this.posicao.setPeca(null);
                //Trocando a posição atual da peça
                this.posicao = posicao;
                break;

            }
        }

    };
    public abstract ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro);
    //public abstract char icone();


    public Posicao getPosicao() {
        return posicao;
    }
}
