public class Libros {
    public int id;
    public String nombre;
    public String isbn;
    public boolean enUso;

    public Libros(int id, String nombre, String isbn) {
        this.id = id;
        this.nombre = nombre;
        this.isbn = isbn;
        this.enUso = false;
    }

    public synchronized boolean intentarObtener() {
        if (!enUso) {
            enUso = true;
            return true;
        }
        return false;
    }

    public synchronized void liberar() {
        enUso = false;
        notify();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "id: " + id + ", nombre: " + nombre + ", ISBN: " + isbn + '}';
    }
}


