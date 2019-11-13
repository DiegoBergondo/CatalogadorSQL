/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catalogador;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * Clase que representa a un artículo.
 * @author DiegoBergondo
 */
public class DatosArticulo {
    
    private String titulo, autor, formato, comentario, exDueño, fPago, estado, lugarVenta, tipoVenta, enlace, direccionImagen = "false";
    private int id=0, precio=0, tipo=0, precioVentaInicial=0, precioVentaFinal=0;
    private Image imagen;
    private boolean tengo=false, quiero=false, venta=false, hayImagen=false; 
    private Date fCreacion = new Date();
    private Date fCompra = new Date();
    private Date fPVenta = new Date();

    
     /**
     * Devuelve el ID del artículo (utilizado con la BBDD en SQL).
     * @return
     */
    public int getId() {
        return id;
    }

     /**
     * Asigna el ID del artículo (utilizado con la BBDD en SQL).
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve la imagen del artículo.
     * @return Image
     */
    public Image getImagen(){
        return this.imagen;
    }
    
    /**
     * Asigna la imagen que llega como parámetro.
     * @param imagen
     */
    public void setImagen(Image imagen){
        this.imagen=imagen;
        this.hayImagen=true;
    }
    
    /**
     * Asigna la imagen que está en la dirección que llega como parámetro.
     * @param dImagen
     * @param url
     */
    public void setImagen(String dImagen, boolean url){
        if(!dImagen.equals("false")){
            try {
                BufferedImage image;
                if(url){
                    URL direccion = new URL(dImagen);
                    image = ImageIO.read(direccion);
                }
                else{
                    image = ImageIO.read(new File(dImagen)); 
                }
                this.imagen = image.getScaledInstance(445, 300, Image.SCALE_DEFAULT);
                this.hayImagen=true;
            } catch (IOException ex) {
                Logger.getLogger(pantallaSeleccionImagen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.setDireccionImagen(dImagen);
    }
    
    /**
     * Devuelve la dirección de la imagen.
     * @return
     */
    public String getDireccionImagen(){
        return this.direccionImagen;
    }
    
    /**
     * Asigna la dirección de la imagen.
     * @param dImagen
     */
    public void setDireccionImagen(String dImagen){
        this.direccionImagen=dImagen;
    }
    
    /**
     * Devuelve si hay imagen asignada o no.
     * @return
     */
    public boolean hayImagen(){
        return this.hayImagen;
    }
        
    /**
     * Devuelve el título.
     * @return
     */
    public String getTitulo(){
        return this.titulo;
    }
            
    /**
     * Asigna el título.
     * @param titulo
     */
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
                
    /**
     * Devuelve el autor.
     * @return
     */
    public String getAutor(){
        return this.autor;
    }
    
    /**
     * Asigna el autor.
     * @param autor
     */
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    /**
     * Devuelve el formato.
     * @return
     */
    public String getFormato(){
        return this.formato;
    }
    
    /**
     * Asigna el formato.
     * @param formato
     */
    public void setFormato(String formato){
        this.formato=formato;
    }
    
    /**
     * Devuelve el dueño anterior.
     * @return
     */
    public String getExDueño(){
        return this.exDueño;
    }
    
    /**
     * Asigna el dueño anterior.
     * @param exDueño
     */
    public void setExDueño(String exDueño){
        this.exDueño=exDueño;
    }
    
    /**
     * Devuelve la forma de pago.
     * @return
     */
    public String getFPago(){
        return this.fPago;
    }
    
    /**
     * Asigna la forma de pago.
     * @param fPago
     */
    public void setFPago(String fPago){
        this.fPago=fPago;
    }
    
    /**
     * Devuelve el estado.
     * @return
     */
    public String getEstado(){
        return this.estado;
    }
    
    /**
     * Asigna el estado.
     * @param estado
     */
    public void setEstado(String estado){
        this.estado=estado;
    }
    
    /**
     * Asigna el valor del parámetro para indicar si se tiene.
     * @param tengo
     */
    public void setTengo(boolean tengo){
        this.tengo=tengo;
    }

    /**
     * Devuelve el valor de si se tiene.
     * @return
     */
    public boolean getTengo(){
        return this.tengo;
    }
    
    /**
     * Devuelve el valor de si se tiene en formato binario (adaptado a SQL).
     * @return
     */
    public int getTengoBin(){
        if(this.tengo)
            return 1;
        else 
            return 0;
    }
    
    /**
     * Asigna el valor del parámetro para indicar si se quiere.
     * @param quiero
     */
    public void setQuiero(boolean quiero){
        this.quiero=quiero;
    }

    /**
     * Devuelve el valor de si se quiere.
     * @return
     */
    public boolean getQuiero(){
        return this.quiero;
    }
    
     /**
     * Devuelve el valor de si se quiere en formato binario (adaptado a SQL).
     * @return
     */
    public int getQuieroBin(){
        if(this.quiero)
            return 1;
        else 
            return 0;
    }
    
    /**
     * Asigna el valor del parámetro para indicar si está en venta.
     * @param venta
     */
    public void setVenta(boolean venta){
        this.venta=venta;
    }

    /**
     * Devuelve el valor de si está en venta.
     * @return
     */
    public boolean getVenta(){
        return this.venta;
    }
    
     /**
     * Devuelve el valor de si está en venta en formato binario (adaptado a SQL).
     * @return
     */
    public int getVentaBin(){
        if(this.venta)
            return 1;
        else 
            return 0;
    }
    
    /**
     * Asigna el comentario.
     * @param comentario
     */
    public void setComentario(String comentario){
        this.comentario=comentario;
    }

    /**
     * Devuelve el comentario.
     * @return
     */
    public String getComentario(){
        return this.comentario;
    }
    
    /**
     * Asigna el precio.
     * @param precio
     */
    public void setPrecio(int precio){
        this.precio=precio;
    }

    /**
     * Devuelve el precio.
     * @return
     */
    public int getPrecio(){
        return this.precio;
    }
    
    /**
     * Asigna el tipo.
     * @param tipo
     */
    public void setTipo(int tipo){
        this.tipo=tipo;
    }

    /**
     * Devuelve el tipo.
     * @return
     */
    public int getTipo(){
        return this.tipo;
    }
    
    /**
     * Devuelve la fecha de creación.
     * @return
     */
    public Date getFCreacion(){
        return this.fCreacion;
    }
    
    /**
     * Asigna la fecha de creación.
     * @param dia
     * @param mes
     * @param ano
     */
    public void setFCreacion(int dia, int mes, int ano){
        Date fecha = new GregorianCalendar(ano, mes, dia).getTime();
        this.fCreacion=fecha;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = df.format(fecha);
    }
    
    public void setFCreacion(Date date){
        this.fCreacion=date;
    }
    
    /**
     * Devuelve la fecha de compra.
     * @return
     */
    public Date getFCompra(){
        return this.fCompra;
    }
    
    /**
     * Asigna la fecha de compra.
     * @param dia
     * @param mes
     * @param ano
     */
    public void setFCompra(int dia, int mes, int ano){
        Date fecha = new GregorianCalendar(ano, mes, dia).getTime();
        this.fCompra=fecha;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = df.format(fecha);
    }
    
    public void setFCompra(Date date){
        this.fCompra=date;
    }
    
    /**
     * Devuelve el lugar de venta.
     * @return
     */
    public String getLugarVenta(){
        return this.lugarVenta;
    }
    
    /**
     * Asigna el lugar de venta.
     * @param lVenta
     */
    public void setLugarVenta(String lVenta){
        this.lugarVenta=lVenta;
    }
    
    /**
     * Devuelve la fecha de venta.
     * @return
     */
    public Date getFPVenta(){
        return this.fPVenta;
    }
    
    /**
     * Asigna la fecha de venta.
     * @param dia
     * @param mes
     * @param ano
     */
    public void setFPVenta(int dia, int mes, int ano){
        Date fecha = new GregorianCalendar(ano, mes, dia).getTime();
        this.fPVenta=fecha;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = df.format(fecha);
    }
    
    public void setFPVenta(Date date){
        this.fPVenta=date;
    }
    
    /**
     * Asigna el precio inicial de venta.
     * @param pVentaI
     */
    public void setPrecioVentaInicial(int pVentaI){
        this.precioVentaInicial=pVentaI;
    }

    /**
     * Devuelve el precio inicial de venta.
     * @return
     */
    public int getPrecioVentaInicial(){
        return this.precioVentaInicial;
    }
    
    /**
     * Asigna el precio de venta final.
     * @param pVentaF
     */
    public void setPrecioVentaFinal(int pVentaF){
        this.precioVentaFinal=pVentaF;
    }

    /**
     * Devuelve el precio de venta final.
     * @return
     */
    public int getPrecioVentaFinal(){
        return this.precioVentaFinal;
    }
    
    /**
     * Asigna el tipo de venta.
     * @param tVenta
     */
    public void setTipoVenta(String tVenta){
        this.tipoVenta=tVenta;
    }
    
    /**
     * Devuelve el tipo de venta.
     * @return
     */
    public String getTipoVenta(){
        return this.tipoVenta;
    }
    
    /**
     * Asigna el enlace a la venta.
     * @param enlace
     */
    public void setEnlace(String enlace){
        this.enlace=enlace;
    }
    
    /**
     * Devuelve el enlace a la venta.
     * @return
     */
    public String getEnlace(){
        return this.enlace;
    } 
}