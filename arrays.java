package parcial_2;

public class arrays {
    public void mostrarArreglo(String arreglo[])    {
        for(int i = 0; i < arreglo.length; i++)    {
            System.out.println(arreglo[i]);
        }
    }
    public void encontrarValor(String arreglo[], String value)    {
        boolean found = false;
        for(int i = 0; i < arreglo.length; i++)    {
            if(arreglo[i].contains(value))  {
               System.out.println(value + " se encuentra en la posicion " + (i + 1));
               found = true;
            }
        }
        if (found == false) {
            System.out.println(value + " no se encuentra en el arreglo");
        }
    }
    public String[] eliminarValor(String arreglo[], String value) {
        int j;
        for(int i = 0; i < arreglo.length; i++)    {
            if(arreglo[i].contains(value))  {
                for(j = i; j < arreglo.length; j++)  {
                    if (j == arreglo.length - 1)    {
                        arreglo[j] = "";
                    }
                    else {
                        arreglo[j] = arreglo[j + 1];
                    }
               }
            }
        }
        return arreglo;
    }
    public void mostrarArregloInt(int arreglo[])    {
        for(int i = 0; i < arreglo.length; i++)    {
            System.out.println(arreglo[i]);
        }
    }
    public void encontrarValorInt(int arreglo[], int value)    {
        boolean found = false;
        for(int i = 0; i < arreglo.length; i++)    {
            if(arreglo[i] == value)  {
               System.out.println(value + " se encuentra en la posicion " + (i + 1));
               found = true;
            }
        }
        if (found == false) {
            System.out.println(value + " no se encuentra en el arreglo");
        }
    }
    public int[] eliminarValorInt(int arreglo[], int value) {
        int j;
        for(int i = 0; i < arreglo.length; i++)    {
            if(arreglo[i] == value)  {
                for(j = i; j < arreglo.length; j++)  {
                    if (j == arreglo.length - 1)    {
                        arreglo[j] = 0;
                    }
                    else {
                        arreglo[j] = arreglo[j + 1];
                    }
               }
            }
        }
        return arreglo;
    }
}
