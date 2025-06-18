package model.cuentas;

import model.Producto;

public class CuentaCorriente extends Producto {

    public CuentaCorriente(int banco, int sucursal){
        super(banco,sucursal);
    }


@Override
    public void mostrarProducto(){
    System.out.println("Cuenta corriente N° " + this.getNumProducto());
}


}
