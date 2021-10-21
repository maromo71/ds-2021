package com.company.prjveia.modelo;

public class Veia {
    private String matriz[][] = new String[3][3];

    public Veia(){
        //Modelo vai ser construído vazio
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                matriz[i][j] = " ";
            }
        }
    }

    public void jogar(int x, String jogador){
        int coluna = x % 3;
        int linha = x / 3;
        matriz[linha][coluna] = jogador;
    }
    
    public String verVencedor(){
        String jogador = "X";
        boolean temVencedor = false;
        
        if(
            (matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")) ||
            (matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X")) ||
            (matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X")) ||
            (matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X")) ||
            (matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X")) ||
            (matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X")) ||
            (matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")) ||
            (matriz[2][0].equals("X") && matriz[1][1].equals("X") && matriz[0][2].equals("X"))
        ){
            return "Jogador X Venceu a partida!!!!";
        }
        if(
                (matriz[0][0].equals("O") && matriz[0][1].equals("O") && matriz[0][2].equals("O")) ||
                        (matriz[1][0].equals("O") && matriz[1][1].equals("O") && matriz[1][2].equals("O")) ||
                        (matriz[2][0].equals("O") && matriz[2][1].equals("O") && matriz[2][2].equals("O")) ||
                        (matriz[0][0].equals("O") && matriz[1][0].equals("O") && matriz[2][0].equals("O")) ||
                        (matriz[0][1].equals("O") && matriz[1][1].equals("O") && matriz[2][1].equals("O")) ||
                        (matriz[0][2].equals("O") && matriz[1][2].equals("O") && matriz[2][2].equals("O")) ||
                        (matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O")) ||
                        (matriz[2][0].equals("O") && matriz[1][1].equals("O") && matriz[0][2].equals("O"))
        ){
            return "Jogador O Venceu a partida!!!!";
        }
        return "Não houve vencedor";
    }

}