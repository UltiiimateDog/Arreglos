package parcial_2;

public class Pilas {
    char[] stack;
    int size,top;

    public Pilas(int size)   {
        this.size = size;
        this.top = 0;
        this.stack = new char[size];

    }
    public Pilas()    {
        this(10);
    }

    public void mostrarStack()  {
        for (int i = 0; i < this.top; i++)   {
            System.out.println(this.stack[i]);
        }
    }

    public void push(char data)  {
        if (this.top == this.size) {
            System.out.println("El stack esta lleno.");
        }
        else {
            this.stack[this.top] = data;
            this.top++;
        }
    }

    public char pop()   {
        char data;
        if (this.top == 0)   {
            System.out.println("El stack esta vacio.");
            return '#';
        }
        else {
            this.top--;
            data = this.stack[this.top];
            this.stack[this.top] = ' ';
            return data;
        }
    }

    public char[] invertirStack()   {
        char[] stackInvertido = new char[this.size];
        int i = 0;
        int top = this.top;
        if (top == 0)   {
            System.out.println("El stack esta vacio.");
        }
        else    {
            while (top > 0)  {
                top--;
                stackInvertido[i] = stack[top];
                i++;
            }
        }
        return stackInvertido;
    }

    public void polindromo()    {
        char[] stackInvertido = new char[this.size];
        int i = 0;
        boolean si = false;
        int top = this.top;
        if (this.top == 0)   {
            System.out.println("El stack esta vacio.");
        }
        else    {
            while (top > 0)  {
                top--;
                stackInvertido[i] = this.stack[top];
                if (stackInvertido[i] == this.stack[i])  {
                    si = true;
                }
                else {
                    si = false;
                    break;
                }
                i++;
            }
        }
        if (si)   {
            System.out.println("Es polindromo.");
        }
        else {
            System.out.println("No es polindromo.");
        }
    }
}
