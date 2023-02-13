package parcial_2;

public class Colas {
    char[] stack;
    int size,tail;

    public Colas(int size)   {
        this.size = size;
        this.tail = 0;
        this.stack = new char[size];

    }
    public Colas()    {
        this(10);
    }

    public void mostrarQueue()  {
        for (int i = 0; i < this.tail; i++)   {
            System.out.println(this.stack[i]);
        }
    }

    public void insert(char data)  {
        if (this.tail == this.size) {
            System.out.println("El queue esta lleno.");
        }
        else {
            this.stack[this.tail] = data;
            this.tail++;
        }
    }

    public char delete()    {
        char data;
        if (this.tail == 0) {
            System.out.println("El queue esta vacio.");
            return '#';
        }
        else {
            data = this.stack[0];
            for(int i = 0; i < this.tail; i++)    {
                this.stack[i] = this.stack[i + 1];
            }
            this.tail--;
            this.stack[this.tail] =' ';
            return data;
        }
    }
}
