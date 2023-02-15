package parcial_2;

public class Matriz {
    public int[][] multiplicacionMatrices(int[][] x, int[][] y) {
        int[][] result;
        if (x.length == y[0].length)   {
            result = new int[x.length][y[0].length];
            for(int i = 0; i < x.length; i++) {
                for(int j = 0; j < y[0].length; j++) {
                    result[i][j] = 0;
                    for(int k = 0; k < x[0].length; k++) {
                        result[i][j] += x[i][k] * y[k][j];
                    }
                }
            }
        }
        else {
            System.out.println("NO se pueden multiplicar.");
            result = new int[0][0];
        }
        return result;
    }

    public void mostrarMatriz(int[][] matriz)   {
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)  {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public int[][] trasponerMatriz(int[][] matriz)  {
        int[][] newMatriz = new int[matriz[0].length][matriz.length];
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)  {
                newMatriz[j][i] = matriz[i][j];
            }
        }
        return newMatriz;
    }

    public int sumaDiagonal(int[][] matriz)   {
        int suma = 0;
        if (matriz.length == matriz[0].length)  {
            for(int i = 0; i < matriz.length; i++) {
                suma += matriz[i][i];
            }
        }
        else    {
            System.out.println("NO se puede sumar su diagonal.");
        }
        return suma;
    }

    public int mayorValor(int[][] matriz)   {
        int value = matriz[0][0];
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)  {
               if ( value < matriz[i][j])   {
                    value = matriz[i][j];
               }
            }
        }
        return value;
    }

    public int[][] sumaMatriz(int[][] x,int[][] y)   {
        int[][] result;
        if (x.length == y.length && x[0].length == y[0].length) {
            result = new int[x.length][x[0].length];
            for(int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[i].length; j++)  {
                   result[i][j] = x[i][j] + y[i][j];
                }
            }
        }
        else {
            System.out.println("NO se pueden sumar");
            result = new int[0][0];
        }
        return result;
    }

    public int[][] escalar(int[][] matriz, int escalar)  {
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)  {
               matriz[i][j] = escalar * matriz[i][j];
            }
        }
        return matriz;
    }
}
