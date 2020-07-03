package cl.talentodigital.ejerciciolistas;

public class Juegos {

    private String urlCaratula;
    private String titulo;
    private String descripcion;

    public Juegos(String urlCaratula, String titulo, String descripcion) {
        this.urlCaratula = urlCaratula;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getUrlCaratula() {
        return urlCaratula;
    }

    public void setUrlCaratula(String urlCaratula) {
        this.urlCaratula = urlCaratula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
