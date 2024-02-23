/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alen
 */
import java.util.Date;

public class Libro {

    private int id;
    private String titulo;
    private Persona autor;
    private String ISBN;
    private int paginas;
    private int edicion;
    private String editorial;
    private String lugar;
    private Date fechaEdicion;

    public Libro(int id, String titulo, Persona autor, String ISBN, int paginas, int edicion, String editorial, String lugar, Date fechaEdicion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.lugar = lugar;
        this.fechaEdicion = fechaEdicion;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getLugar() {
        return lugar;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", ISBN='" + ISBN + '\'' +
                ", paginas=" + paginas +
                ", edicion=" + edicion +
                ", editorial='" + editorial + '\'' +
                ", lugar='" + lugar + '\'' +
                ", fechaEdicion=" + fechaEdicion +
                '}';
    }
}
