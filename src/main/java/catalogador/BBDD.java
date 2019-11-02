/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catalogador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase que gestiona la base de datos.
 * @author murphy
 */
public class BBDD {
    
    private ArrayList<DatosArticulo> Cuadros = new ArrayList<>();
    private ArrayList<DatosArticulo> Libros = new ArrayList<>();
    private ArrayList<DatosArticulo> Musica = new ArrayList<>();
    private ArrayList<DatosArticulo> Videojuegos = new ArrayList<>();
 
    /**
     * Añade artículo a la base de datos.
     * @param articulo
     * @param nuevo boolean que determina si es un artículo nuevo o ya existente.
     */
    public void addArticulo(DatosArticulo articulo, boolean nuevo){
        if(existeTitulo(articulo.getTitulo(),articulo.getTipo()) && nuevo)
            JOptionPane.showMessageDialog(null,"El "+ getTipoArticulo(articulo.getTipo()) + " ya existe en la BBDD");
        else{
            if(articulo.getTipo()==0)
                this.Cuadros.add(articulo);
            else if(articulo.getTipo()==1)
                this.Libros.add(articulo);
            else if(articulo.getTipo()==2)
                this.Musica.add(articulo);        
            else 
                this.Videojuegos.add(articulo);
            if(nuevo)
                JOptionPane.showMessageDialog(null,"El "+ getTipoArticulo(articulo.getTipo()) + " se ha registrado en la BBDD");
        }
    }
    
    /**
     * Modifica un artículo.
     * @param articulo.
     */
    public void modificarArticulo(DatosArticulo articulo){
        this.borrarArticulo(articulo.getTitulo(), articulo.getTipo());
        if(articulo.getTipo()==0)
            this.Cuadros.add(articulo);
        else if(articulo.getTipo()==1)
            this.Libros.add(articulo);
        else if(articulo.getTipo()==2)
            this.Musica.add(articulo);        
        else 
            this.Videojuegos.add(articulo);
        JOptionPane.showMessageDialog(null,"El "+ getTipoArticulo(articulo.getTipo()) + " se ha modificado en la BBDD");      
    }
    
    /**
     * Devuelve los cuadros añadidos.
     * @return array de DatosArticulo.
     */
    public ArrayList<DatosArticulo> getListaCuadros(){
        return this.Cuadros;
    }
    
    /**
     * Devuelve los libros añadidos.
     * @return array de DatosArticulo.
     */
    public ArrayList<DatosArticulo> getListaLibros(){
        return this.Libros;
    }
        
    /**
     * Devuelve los discos o cintas añadidas.
     * @return array de DatosArticulo.
     */
    public ArrayList<DatosArticulo> getListaMusica(){
        return this.Musica;
    }
            
    /**
     * Devuelve los videojuegos añadidos.
     * @return array de DatosArticulo.
     */
    public ArrayList<DatosArticulo> getListaVideojuegos(){
        return this.Videojuegos;
    }
    
    /**
     * Devuelve el String con el nombre del tipo de artículo.
     * @param tipo
     * @return
     */
    public String getTipoArticulo(int tipo){
        if(tipo==0)
            return "cuadro";
        else if(tipo==1)
            return "libro";
        else if(tipo==2)
            return "cinta o cd";
        else
            return "videojuego";
    }
    
    /**
     * Devuelve la media del valor de los cuadros.
     * @return
     */
    public int mediaValorCuadros(){
        int media = 0;
        for(int i=0; i<Cuadros.size(); i++){
            media = media + Cuadros.get(i).getPrecio();
        }
        media = media / Cuadros.size();
        return media;
    }
    
    /**
     * Devuelve la media del valor de los libros.
     * @return
     */
    public int mediaValorLibros(){
        int media = 0;
        for(int i=0; i<Libros.size(); i++){
            media = media + Libros.get(i).getPrecio();
        }
        media = media / Libros.size();
        return media;
    }
        
    /**
     * Devuelve la media del valor de los discos o cintas.
     * @return
     */
    public int mediaValorMusica(){
        int media = 0;
        for(int i=0; i<Musica.size(); i++){
            media = media + Musica.get(i).getPrecio();
        }
        media = media / Musica.size();
        return media;
    }
            
    /**
     * Devuelve la media del valor de los videojuegos.
     * @return
     */
    public int mediaValorVideojuegos(){
        int media = 0;
        for(int i=0; i<Videojuegos.size(); i++){
            media = media + Videojuegos.get(i).getPrecio();
        }
        media = media / Videojuegos.size();
        return media;
    }
    
    /**
     * Determina si un título de un tipo determinado existe en la base de datos o no.
     * @param titulo
     * @param tipo
     * @return
     */
    public boolean existeTitulo(String titulo, int tipo){
        boolean existe=false;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getTitulo().equals(titulo)){
                    existe = true;
                    break;
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getTitulo().equals(titulo)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getTitulo().equals(titulo)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==3){
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getTitulo().equals(titulo)){
                    existe = true;
                    break;
                }                
            }
        }
        return existe;       
    }
    
    /**
     * Determina si un autor de un tipo determinado existe en la base de datos o no.
     * @param autor
     * @param tipo
     * @return
     */
    public boolean existeAutor(String autor, int tipo){
        boolean existe=false;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getAutor().equals(autor)){
                    existe = true;
                    break;
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getAutor().equals(autor)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getAutor().equals(autor)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==3){
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getAutor().equals(autor)){
                    existe = true;
                    break;
                }                
            }
        }
        return existe;       
    }
        
    /**
     * Determina si un formato de un tipo determinado existe en la base de datos o no.
     * @param formato
     * @param tipo
     * @return
     */
    public boolean existeFormato(String formato, int tipo){
        boolean existe=false;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getFormato().equals(formato)){
                    existe = true;
                    break;
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getFormato().equals(formato)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getFormato().equals(formato)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==3){
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getFormato().equals(formato)){
                    existe = true;
                    break;
                }                
            }
        }
        return existe;       
    }

    /**
     * Determina si una palabra o grupo de letras de un tipo determinado aparecen en algún título de la base de datos o no.
     * @param titulo
     * @param tipo
     * @return
     */
    public boolean existeCoincidenciaTitulo (String titulo, int tipo){
        boolean existe=false;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getTitulo().contains(titulo)){
                    existe = true;
                    break;
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getTitulo().contains(titulo)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getTitulo().contains(titulo)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==3){
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getTitulo().contains(titulo)){
                    existe = true;
                    break;
                }                
            }
        }
        return existe;       
    }

    /**
     * Determina si una palabra o grupo de letras de un tipo determinado aparecen en algún autor de la base de datos o no.
     * @param autor
     * @param tipo
     * @return
     */
    public boolean existeCoincidenciaAutor (String autor, int tipo){
        boolean existe=false;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getAutor().contains(autor)){
                    existe = true;
                    break;
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getAutor().contains(autor)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getAutor().contains(autor)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==3){
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getAutor().contains(autor)){
                    existe = true;
                    break;
                }                
            }
        }
        return existe;       
    }

    /**
     * Determina si una palabra o grupo de letras de un tipo determinado aparecen en algún formato de la base de datos o no.
     * @param formato
     * @param tipo
     * @return
     */
    public boolean existeCoincidenciaFormato (String formato, int tipo){
        boolean existe=false;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getFormato().contains(formato)){
                    existe = true;
                    break;
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getFormato().contains(formato)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getFormato().contains(formato)){
                    existe = true;
                    break;
                }                
            }
        }
        if(tipo==3){
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getFormato().contains(formato)){
                    existe = true;
                    break;
                }                
            }
        }
        return existe;       
    }
    
    /**
     * Devuelve un artículo si hay coincidencia total o parcial en su título.
     * @param titulo
     * @param tipo
     * @return
     */
    public DatosArticulo getArticuloTitulo(String titulo, int tipo){
        DatosArticulo articulo = new DatosArticulo();
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getTitulo().contains(titulo)){
                    articulo=Cuadros.get(i);
                    break;
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getTitulo().contains(titulo)){
                    articulo=Libros.get(i);
                    break;
                }                
            }
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getTitulo().contains(titulo)){
                    articulo=Musica.get(i);
                    break;
                }                
            }
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getTitulo().contains(titulo)){
                    articulo=Videojuegos.get(i);
                    break;
                }                
            }
        }
        return articulo;       
    }

    /**
     * Devuelve un array de artículos con los que presenten coincidencia total o parcial en su título.
     * @param titulo
     * @param tipo
     * @return
     */
    public ArrayList<DatosArticulo> getListaArticuloTitulo(String titulo, int tipo){
        ArrayList<DatosArticulo> listaArticulos = new ArrayList<>();
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getTitulo().contains(titulo)){
                    listaArticulos.add(Cuadros.get(i));
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getTitulo().contains(titulo)){
                    listaArticulos.add(Libros.get(i));
                }                
            }
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getTitulo().contains(titulo)){
                    listaArticulos.add(Musica.get(i));
                }                
            }
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getTitulo().contains(titulo)){
                    listaArticulos.add(Videojuegos.get(i));
                }                
            }
        }
        return listaArticulos;       
    }
    
    /**
     * Devuelve un artículo si hay coincidencia total o parcial en su autor.
     * @param autor
     * @param tipo
     * @return
     */
    public DatosArticulo getArticuloAutor(String autor, int tipo){
        DatosArticulo articulo = new DatosArticulo();
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getAutor().contains(autor)){
                    articulo=Cuadros.get(i);
                    break;
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getAutor().contains(autor)){
                    articulo=Libros.get(i);
                    break;
                }                
            }
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getAutor().contains(autor)){
                    articulo=Musica.get(i);
                    break;
                }                
            }
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getAutor().contains(autor)){
                    articulo=Videojuegos.get(i);
                    break;
                }                
            }
        }
        return articulo;       
    }
    
    /**
     * Devuelve un array de artículos con los que presenten coincidencia total o parcial en su autor.
     * @param autor
     * @param tipo
     * @return
     */
    public ArrayList<DatosArticulo> getListaArticuloAutor(String autor, int tipo){
        ArrayList<DatosArticulo> listaArticulos = new ArrayList<>();
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getAutor().contains(autor)){
                    listaArticulos.add(Cuadros.get(i));
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getAutor().contains(autor)){
                    listaArticulos.add(Libros.get(i));
                }                
            }
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getAutor().contains(autor)){
                    listaArticulos.add(Musica.get(i));
                }                
            }
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getAutor().contains(autor)){
                    listaArticulos.add(Videojuegos.get(i));
                }                
            }
        }
        return listaArticulos;       
    }
    
    /**
     * Devuelve un artículo si hay coincidencia total o parcial en su formato.
     * @param formato
     * @param tipo
     * @return
     */
    public DatosArticulo getArticuloFormato(String formato, int tipo){
        DatosArticulo articulo = new DatosArticulo();
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getFormato().contains(formato)){
                    articulo=Cuadros.get(i);
                    break;
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getFormato().contains(formato)){
                    articulo=Libros.get(i);
                    break;
                }                
            }
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getFormato().contains(formato)){
                    articulo=Musica.get(i);
                    break;
                }                
            }
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getFormato().contains(formato)){
                    articulo=Videojuegos.get(i);
                    break;
                }                
            }
        }
        return articulo;       
    }
    
    /**
     * Devuelve un array de artículos con los que presenten coincidencia total o parcial en su formato.
     * @param formato
     * @param tipo
     * @return
     */
    public ArrayList<DatosArticulo> getListaArticuloFormato(String formato, int tipo){
        ArrayList<DatosArticulo> listaArticulos = new ArrayList<>();
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getFormato().contains(formato)){
                    listaArticulos.add(Cuadros.get(i));
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getFormato().contains(formato)){
                    listaArticulos.add(Libros.get(i));
                }                
            }
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getFormato().contains(formato)){
                    listaArticulos.add(Musica.get(i));
                }                
            }
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getFormato().contains(formato)){
                    listaArticulos.add(Videojuegos.get(i));
                }                
            }
        }
        return listaArticulos;       
    }
    
    /**
     * Realiza y devuelve el cálculo de la media de los artículos de un tipo metido por parámetro que se tienen.
     * @param tipo
     * @return
     */
    public int getMediaTengo(int tipo){
        int media=0, divisor=0;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getTengo()){
                    media=media+Cuadros.get(i).getPrecio();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getTengo()){
                    media=media+Libros.get(i).getPrecio();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getTengo()){
                    media=media+Musica.get(i).getPrecio();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getTengo()){
                    media=media+Videojuegos.get(i).getPrecio();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        return media;
    }
    
    /**
     * Realiza y devuelve el cálculo de la media de los artículos de un tipo metido por parámetro que se quieren.
     * @param tipo
     * @return
     */
    public int getMediaQuiero(int tipo){
        int media=0, divisor=0;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getQuiero()){
                    media=media+Cuadros.get(i).getPrecio();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getQuiero()){
                    media=media+Libros.get(i).getPrecio();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getQuiero()){
                    media=media+Musica.get(i).getPrecio();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getQuiero()){
                    media=media+Videojuegos.get(i).getPrecio();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        return media;
    }

    /**
     * Realiza y devuelve el cálculo de la media del precio inicial de los artículos de un tipo metido por parámetro que se venden.
     * @param tipo
     * @return
     */
    public int getMediaPI(int tipo){
        int media=0, divisor=0;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getVenta()){
                    media=media+Cuadros.get(i).getPrecioVentaInicial();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getVenta()){
                    media=media+Libros.get(i).getPrecioVentaInicial();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getVenta()){
                    media=media+Musica.get(i).getPrecioVentaInicial();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getVenta()){
                    media=media+Videojuegos.get(i).getPrecioVentaInicial();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        return media;
    }
        
    /**
     * Realiza y devuelve el cálculo de la media del precio final de los artículos de un tipo metido por parámetro que se venden.
     * @param tipo
     * @return
     */
    public int getMediaPF(int tipo){
        int media=0, divisor=0;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getVenta()){
                    media=media+Cuadros.get(i).getPrecioVentaFinal();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getVenta()){
                    media=media+Libros.get(i).getPrecioVentaFinal();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getVenta()){
                    media=media+Musica.get(i).getPrecioVentaFinal();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getVenta()){
                    media=media+Videojuegos.get(i).getPrecioVentaFinal();
                    divisor++;
                }                
            }
            if(media>0)
                media=(media/divisor);
        }
        return media;
    }
    
    /**
     * Devuelve el número de artículos de un tipo introducido por parámetro que están en venta.
     * @param tipo
     * @return
     */
    public int getEnVenta(int tipo){
        int enVenta=0;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getVenta())
                    enVenta++;                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getVenta())
                    enVenta++;                
            }
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getVenta())
                    enVenta++;                
            }
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getVenta())
                    enVenta++;                
            }
        }
        return enVenta;
    }
    
    /**
     * Borra de la base de datos el artículo que coincida con el titulo y el tipo introducidos por parámetro.
     * @param titulo
     * @param tipo
     */
    public void borrarArticulo (String titulo, int tipo){
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                if(Cuadros.get(i).getTitulo().contains(titulo)){
                    Cuadros.remove(i);
                }                
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                if(Libros.get(i).getTitulo().contains(titulo)){
                    Libros.remove(i);
                }                
            }
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                if(Musica.get(i).getTitulo().contains(titulo)){
                    Musica.remove(i);
                }                
            }
        }
        else {
            for(int i=0; i<Videojuegos.size(); i++){
                if(Videojuegos.get(i).getTitulo().contains(titulo)){
                    Videojuegos.remove(i);
                }                
            }
        }
    }
    
    /**
     * Devuelve el número total de artículos de un tipo.
     * @param tipo
     * @return
     */
    public int getTotales(int tipo){
       if(tipo==0)
           return this.Cuadros.size();
       else if(tipo==1)
           return this.Libros.size();
       else if(tipo==2)
           return this.Musica.size();
       else if(tipo==3)
           return this.Videojuegos.size();
       else 
           return 0;
    }
    
    /**
     * Devuelve la cantidad total gastada en artículos de un tipo.
     * @param tipo
     * @return
     */
    public int getTotalGastado(int tipo){
        int total = 0;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                total = total + Cuadros.get(i).getPrecio();
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                total = total + Libros.get(i).getPrecio();
            }
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                total = total + Musica.get(i).getPrecio();
            }
        }
        else if(tipo==3){
            for(int i=0; i<Videojuegos.size(); i++){
                total = total + Videojuegos.get(i).getPrecio();
            }
        }
        return total;
    }
    
    /**
     * Devuelve la cantidad total ingresada en artículos de un tipo.
     * @param tipo
     * @return
     */
    public int getTotalRecibido(int tipo){
        int total = 0;
        if(tipo==0){
            for(int i=0; i<Cuadros.size(); i++){
                total = total + Cuadros.get(i).getPrecioVentaFinal();
            }
        }
        else if(tipo==1){
            for(int i=0; i<Libros.size(); i++){
                total = total + Libros.get(i).getPrecioVentaFinal();
            }
        }
        else if(tipo==2){
            for(int i=0; i<Musica.size(); i++){
                total = total + Musica.get(i).getPrecioVentaFinal();
            }
        }
        else if(tipo==3){
            for(int i=0; i<Videojuegos.size(); i++){
                total = total + Videojuegos.get(i).getPrecioVentaFinal();
            }
        }
        return total;
    }
    
}