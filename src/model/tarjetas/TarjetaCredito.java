package model.tarjetas;

import model.Producto;

public class TarjetaCredito extends Producto {
        private int claveSeguridad;
    public TarjetaCredito(int banco, int sucursal, int claveSeguridad){
        super(banco,sucursal);
        this.claveSeguridad = claveSeguridad;
    }



   @Override
   public void mostrarProducto(){
       System.out.println("Tarjeta de credito N° " + this.getNumProducto());
   }



}
