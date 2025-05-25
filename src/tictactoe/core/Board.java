package tictactoe.core;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

public class Board {

    public static final int SIZE = 3;

    private final Symbol[][] matrix = new Symbol[SIZE] [SIZE];

    public Board() {
        for (Symbol[] symbols : matrix) {
            Arrays.fill(symbols, Symbol.NONE);
        }
    }

    //Sobrescreve as linhas em formato do jogo da velha
    @Override
    public String toString() {
        StringWriter sw = new StringWriter();
        PrintWriter out = new PrintWriter(sw);

        for (int i = 0; i < SIZE; i ++) {

            boolean first = true;
            for (int j = 0; j < SIZE; j ++) {
                if (!first) {
                    out.print(" | ");

                }
                out.print(matrix[i][j] + " ");
                first = false;
            }
            out.println();

           // Previne que seja adicionado a divisão na última linha
            if (i + 1 < SIZE) {
                for (int j = 0; j < SIZE; j ++) {
                    out.print("----");
                }
                out.println();
            }

        }

        return  sw.toString();
    }
}
