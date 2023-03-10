package repositorio;

import java.util.ArrayList;

import modelo.*;

public class CompraRepositorio implements IRepositorio {
    private static final ArrayList<Modelo> Compras = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) throws Exception {
        for (Modelo compras : Compras) {
            if (compras.Id == id) {
                return compras;
            }
        }
        throw new Exception("Compra no encontrado");
    }
    @Override
    public Modelo Añadir(Modelo modelo) {

        Compra compra = (Compra) modelo;
        if (!Compras.isEmpty()) {
            Modelo last = Compras.get(Compras.size() - 1);
            compra.Id = last.Id + 1;
        } else {
            compra.Id = 1;
        }
        int detalleId=0;
        for (CompraArticulo detalleCompra : compra.getArticulos()) {
           detalleCompra.Id =++detalleId;
              detalleCompra.setIdCompra(compra.Id);
            Articulo articulo = detalleCompra.getArticulo();
            articulo.setCantidad(articulo.getCantidad() + detalleCompra.getCantidad());
        }
        Compras.add(compra);
        return compra;
    }
    @Override
    public void Eliminar(Modelo compra) {
        Compras.remove(compra);
    }
    @Override
    public void Modificar(Modelo compra) throws Exception {
        int index = Compras.indexOf(compra);
        if (index > -1) {
            Compras.set(index, compra);
        }
        throw new Exception("No se puede modificar");
    }
    @Override
    public ArrayList<Modelo> ObtenerTodos() {

        return Compras;
    }

}
