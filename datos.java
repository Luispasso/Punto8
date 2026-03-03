public class datos{
    private String Nombre, Categoria;
    private double peso;
    public datos(String nombre, String categoria, double peso) {
        Nombre = nombre;
        Categoria = categoria;
        this.peso = peso;
    }
    public datos() {
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}