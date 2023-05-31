---
## Descripcion tecnica:

**Aplicación para la gestión fitosanitaria en cultivos de uva.**

*El objetivo principal de esta aplicación será:*
+ Gestión de marcas y productos fitosanitarios
+ Gestión de compras
+ Gestión de manos de sulfato
+ Control de costes.
+ Control de stock.
+ Control de cantidades aplicadas.
----

---
## Diagrama de clases:

```mermaid
classDiagram
class `enum TipoMedida`
`(Abstracto) Modelo`..|>Observable: Implements
`(Abstracto) Modelo`-->Articulo: Extends
`(Abstracto) Modelo`-->CompraArticulo: Extends
`(Abstracto) Modelo`-->ManoSulfatoArticulo: Extends
Articulo..|>Modelo: Implements
CompraArticulo..|>Modelo: Implements
ManoSulfatoArticulo..|>Modelo: Implements
Modelo-->CompraController
Modelo-->CompraArticuloController
Modelo-->ArticuloController
Modelo-->ManoSulfatoArticuloController
CompraArticuloController*--CompraArticuloView
ArticuloController*--ArticuloView
ManoSulfatoArticuloController*--ManoSulfatoArticuloView
CompraArticuloController*--CompraArticuloObserver
ArticuloController*--ArticuloObserver
ManoSulfatoArticuloController*--ManoSulfatoArticuloObserver
`enum TipoMedida`: Kilos
`enum TipoMedida`: Gramos
`enum TipoMedida`: Litros
`enum TipoMedida`: Centilitros
`enum TipoMedida`: Mililitros
Articulo: String
Articulo: Int
Articulo: TipoMedida
Articulo: Double
CompraArticulo: Articulo
CompraArticulo: Int
CompraArticulo: Int
CompraArticulo: Double
CompraArticulo: Double
`(Abstracto) Modelo`: int
ManoSulfatoArticulo: Int
ManoSulfatoArticulo: Articulo
ManoSulfatoArticulo: Int
ManoSulfatoArticulo: TipoMedida
ManoSulfatoArticulo: Double
Modelo: Interface IBaseDatos
Modelo: obtener()
Modelo: añadir()
Modelo: actualizar()
Modelo: eliminar()
CompraController: cargar()
CompraController: eliminar()
CompraController: seleccionar()
CompraController: nuevo()
CompraController: abrirArticuloView()
CompraArticuloController: cargar()
CompraArticuloController: seleccionar()
CompraArticuloController: eliminar()
CompraArticuloController: nuevo()
CompraArticuloController: guardar()
CompraArticuloController: añadir()
CompraArticuloView: CompraView()
ArticuloView: ArticuloView()
ManoSulfatoArticuloView: ManoSulfatoArticuloView()
CompraArticuloObserver: update()
ArticuloController: cargar()
ArticuloController: actualizar()
ArticuloController: nuevo()
ArticuloController: seleccionar()
ArticuloController: eliminar()
ArticuloObserver: update()
ManoSulfatoArticuloController: cargar()
ManoSulfatoArticuloController: seleccionar()
ManoSulfatoArticuloController: nuevo()
ManoSulfatoArticuloController: eliminar()
ManoSulfatoArticuloController: guardar()
ManoSulfatoArticuloController: añadir()
ManoSulfatoArticuloObserver: update()
```

---

## Diagrama de secuencia.
```mermaid
sequenceDiagram
autonumber
actor Usuario
participant ControllerMarca
participant ModelMarca
participant MarcaObserver
participant MenuView
participant MarcaView
Usuario->>MenuView: click del menu
MenuView->>MarcaView: click en crear marca
MarcaView->>ControllerMarca: creamos marca
ControllerMarca->>ModelMarca: crea marca
activate ModelMarca
ModelMarca-->>ControllerMarca: Marca lista
deactivate ModelMarca
ControllerMarca->>MarcaObserver: se ha creado una marca.
activate MarcaObserver
MarcaObserver-->>MarcaView: muestra la marca creada.
deactivate MarcaObserver
```