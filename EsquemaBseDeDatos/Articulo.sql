set datestyle = "ISO, DMY";
set datestyle to DMY, SQL;
show datestyle;
drop table if exists Marca cascade ;
drop table if exists TipoMedida cascade ;
drop table if exists Inventario cascade ;
drop table if exists Articulo cascade;
drop table if exists Compra cascade ;
drop table if exists ManoSulfato cascade;
drop table if exists CompraArticulo cascade ;
drop table if exists ManoSulfatoArticulo cascade;

CREATE TABLE Marca 
    ( 
     IdMarca integer NOT NULL,
     Nombre varchar (50) NOT NULL ,  
     PRIMARY KEY (IdMarca)
    );
CREATE TABLE TipoMedida 
    ( 
     IdMedida integer NOT NULL, 
     Nombre varchar (50) NOT NULL ,  
     PRIMARY KEY (IdMedida)
   );


CREATE TABLE Inventario
    ( 
     IdInventario integer NOT NULL ,
     Cantidad real  NOT NULL ,  
     PRIMARY KEY ( IdInventario) 
     );


CREATE TABLE Articulo 
    ( 
     IdArticulo integer NOT NULL, 
     IdMarca integer NOT NULL,
     IdMedida integer NOT NULL, 
     IdInventario integer NOT NULL ,
     Nombre varchar  (50)  NOT NULL , 
     Cantidad real  NOT NULL , 
     PRIMARY KEY ( IdArticulo),
	 FOREIGN KEY (IdMarca)  REFERENCES Marca (IdMarca),
	 FOREIGN KEY (IdMedida)  REFERENCES TipoMedida (IdMedida),
	 FOREIGN KEY (IdInventario)  REFERENCES Inventario (IdInventario)
    );


CREATE TABLE Compra 
    ( 
     IdCompra integer NOT NULL, 
     Fecha Date, 
     PRIMARY KEY ( IdCompra )
     
   );


CREATE TABLE ManoSulfato 
    ( 
     IdManoSulfato integer NOT NULL, 
     Fecha Date , 
     PRIMARY KEY ( IdManoSulfato )
     
  );

CREATE TABLE CompraArticulo
    ( 
	 IdArticulo integer NOT NULL, 
     IdCompra integer NOT NULL, 
     Cantidad real  NOT NULL ,  
     Precio INTEGER,
     PRIMARY KEY (IdArticulo,IdCompra ) ,
     FOREIGN KEY (IdArticulo)  REFERENCES Articulo (IdArticulo),
	 FOREIGN KEY (IdCompra)  REFERENCES Compra (IdCompra)

  );



CREATE TABLE ManoSulfatoArticulo
    ( 
     IdArticulo integer NOT NULL, 
     IdManoSulfato integer NOT NULL, 
	 IdMedida integer NOT NULL, 
     Cantidad real  NOT NULL ,  
     PRIMARY KEY ( IdArticulo, IdManoSulfato, IdMedida ),
     FOREIGN KEY (IdArticulo)  REFERENCES Articulo (IdArticulo),
     FOREIGN KEY (IdManoSulfato)  REFERENCES ManoSulfato(IdManoSulfato),
     FOREIGN KEY (IdMedida)  REFERENCES TipoMedida (IdMedida) 
    ) ;
INSERT INTO Marca (IdMArca, Nombre)
VALUES (5465, 'Samsung');
INSERT INTO TipoMedida (IdMedida, Nombre)
VALUES (6969, 'Kilo');
INSERT INTO Inventario (IdInventario, Cantidad)
VALUES (9595, 5);
INSERT INTO Articulo (IdArticulo, Nombre, Cantidad,IdMArca,IdMedida,IdInventario)
VALUES (5858, 'Apple', 3,5465, 6969,9595);
INSERT INTO Compra (IdCompra, Fecha)
VALUES (5656, '5/12/2022');
INSERT INTO ManoSulfato (IdManoSulfato, Fecha)
VALUES (1818, '10/03/2022');
INSERT INTO CompraArticulo (IdArticulo,IdCompra,Cantidad, Precio)
VALUES (5858,5656,3,150 );
INSERT INTO ManoSulfatoArticulo (IdArticulo,IdManoSulfato,IdMedida, Cantidad)
VALUES (5858,1818,6969,3 );

