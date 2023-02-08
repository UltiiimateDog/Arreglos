package parcial_2;

public class menu {
    public static void main(final String[] args)    {
        int enteros[] = new int[15];
        String nombres[] = new String[20];
        Estudiante Students[] = new Estudiante[100];
        arrays arreglos = new arrays();
        enteros[9] = 5;
        nombres[0] = "Francisco";

        for(int i = 1; i < nombres.length; i++) {//Este for solo es para llenar el arreglo de nombres
            if(i % 5 == 0)    {
                nombres[i] = "Jose";
            }
            else if (i % 4 == 0)    {
                nombres[i] = "Marco";
            }
            else if (i % 3 == 0)    {
                nombres[i] = "Pablo";
            }
            else if (i % 2 == 0)    {
                nombres[i] = "Antonio";
            }
            else {
                nombres[i] = "Elizabeth";
            }
        }
        for(int i = 0; i < enteros.length; i++) {//este for solo es para llenar el arreglo enteros 
            if (i < 9) {
                enteros[i] = i*2;
            }
            else if ( i > 9)    {
                enteros[i] = i/2;
            }
        }
        arreglos.mostrarArreglo(nombres);
        arreglos.encontrarValor(nombres, "Antonio");
        nombres = arreglos.eliminarValor(nombres, "Francisco");
        arreglos.mostrarArreglo(nombres);
        arreglos.encontrarValor(nombres, "Antonio");
        arreglos.mostrarArregloInt(enteros);
        arreglos.encontrarValorInt(enteros, 6);
        enteros = arreglos.eliminarValorInt(enteros, 5);
        arreglos.mostrarArregloInt(enteros);
        arreglos.encontrarValorInt(enteros, 6);
    }
}
