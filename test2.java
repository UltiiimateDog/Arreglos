package parcial_2;

public class test2 {
    public static void main(String[] args) {
        int[][] x = {{1,2},{3,4},{2,5}};
        int[][] y = {{1,2,6},{3,4,9}};
        Matriz test = new Matriz();
        test.mostrarMatriz(x);
        System.out.print("\n");
        test.mostrarMatriz(y);
        System.out.print("\n");
        int[][] z = test.multiplicacionMatrices(x, y);
        test.mostrarMatriz(z);
        int[][] xInvertida = test.trasponerMatriz(x);
        System.out.print("\n");
        test.mostrarMatriz(xInvertida);
        int diagonal = test.sumaDiagonal(z);
        int mValor = test.mayorValor(z);
        System.out.print("\n" + diagonal + "\t" + mValor + "\n\n");
        int[][] suma = test.sumaMatriz(xInvertida, y);
        test.mostrarMatriz(suma);
        int[][] cx = test.escalar(x, 3);
        System.out.print("\n");
        test.mostrarMatriz(cx);
    }
    
}
