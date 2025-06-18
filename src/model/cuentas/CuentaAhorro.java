package model.cuentas;

import model.Producto;

public class CuentaAhorro extends Producto {


  public CuentaAhorro(int banco, int sucursal){
        super(banco, sucursal);
    }


    @Override
    public void mostrarProducto(){
        System.out.println("Cuenta Ahorro N° " + this.getNumProducto());
    }






}
