package parcial_2;

public class test {
    public static void main(String[] args) {
        Pilas pila = new Pilas(5);
        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        pila.push('e');
        pila.mostrarStack();
        pila.polindromo();
        pila.stack = pila.invertirStack();
        System.out.println("\n");
        pila.mostrarStack();
        System.out.print("\n" + pila.pop() + "\n");
        System.out.print(pila.pop());
        System.out.println("\n");
        pila.mostrarStack();
        pila.push('d');
        pila.push('e');
        System.out.println("\n");
        pila.mostrarStack();
        pila.polindromo();
        System.out.println("\n\n");
        Colas cola = new Colas(5);
        cola.insert('a');
        cola.insert('b');
        cola.insert('c');
        cola.insert('d');
        cola.mostrarQueue();
        System.out.println("\n");
        cola.delete();
        cola.mostrarQueue();
    }
}
