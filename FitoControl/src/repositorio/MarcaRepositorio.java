package repositorio;

import java.util.ArrayList;

import modelo.Modelo;

/**
 * @author Windar
 */
public class MarcaRepositorio implements IRepositorio {

    private final ArrayList<Modelo> Marcas = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) throws Exception {

        for (Modelo marca : Marcas) {

            if (marca.Id == id) {

                return marca;
            }
        }
        throw new Exception(" Marca no encontrado");
    }

    @Override
    public Modelo Añadir(Modelo marca) {

        if (!Marcas.isEmpty()) {

            Modelo last = Marcas.get(Marcas.size() - 1);

            marca.Id = last.Id + 1;
        } else {

            marca.Id = 1;
        }
        Marcas.add(marca);

        return marca;
    }

    @Override
    public void Eliminar(Modelo marca) {

        Marcas.remove(marca);
    }

    @Override
    public void Modificar(Modelo marca) {

        int index = Marcas.indexOf(marca);

        if (index > -1) {

            Marcas.set(index, marca);
        }
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {

        return Marcas;
    }

}
