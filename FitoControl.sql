set datestyle = "ISO, DMY";
set datestyle to DMY, SQL;
show datestyle;
drop table if exists Marca cascade ;
drop table if exists TipoMedida cascade ;
drop table if exists Articulo cascade;
drop table if exists Compra cascade ;
drop table if exists ManoSulfato cascade;
drop table if exists CompraArticulo cascade ;
drop table if exists ManoSulfatoArticulo cascade;

CREATE TABLE Marca 
    ( 
     IdMarca SERIAL NOT NULL,
     Nombre varchar (50) NOT NULL ,  
     PRIMARY KEY (IdMarca)
    );

CREATE TABLE TipoMedida 
    ( 
     IdMedida integer NOT NULL, 
     Nombre varchar (50) NOT NULL ,  
     PRIMARY KEY (IdMedida)
   );


CREATE TABLE Articulo 
    ( 
     IdArticulo SERIAL NOT NULL, 
     IdMarca integer NOT NULL,
     IdMedida integer NOT NULL, 
     Nombre varchar  (50)  NOT NULL , 
     Cantidad real  NOT NULL , 
     PRIMARY KEY ( IdArticulo),
	 FOREIGN KEY (IdMarca)  REFERENCES Marca (IdMarca),
	 FOREIGN KEY (IdMedida)  REFERENCES TipoMedida (IdMedida)
    );


CREATE TABLE Compra 
    ( 
     IdCompra SERIAL NOT NULL, 
     Fecha Date, 
     PRIMARY KEY ( IdCompra )     
   );


CREATE TABLE ManoSulfato 
    ( 
     IdManoSulfato SERIAL NOT NULL, 
     Fecha Date NOT NULL,
     PRIMARY KEY ( IdManoSulfato )
     
  );

CREATE TABLE CompraArticulo
    ( 
	 IdCompraArticulo Serial not null,
     IdArticulo INTEGER NOT NULL, 
     IdCompra INTEGER NOT NULL, 
     Cantidad real  NOT NULL ,  
     Precio INTEGER,
     PRIMARY KEY (IdCompraArticulo ) ,
     FOREIGN KEY (IdArticulo)  REFERENCES Articulo (IdArticulo),
	 FOREIGN KEY (IdCompra)  REFERENCES Compra (IdCompra)

  );

CREATE TABLE ManoSulfatoArticulo
    ( 
	IdManoSulfatoArticulo Serial not null,
     IdArticulo INTEGER NOT NULL, 
     IdManoSulfato INTEGER NOT NULL, 
	 IdMedida INTEGER NOT NULL, 
     Cantidad real  NOT NULL ,  
     PRIMARY KEY ( IdManoSulfatoArticulo),
     FOREIGN KEY (IdArticulo)  REFERENCES Articulo (IdArticulo),
     FOREIGN KEY (IdManoSulfato)  REFERENCES ManoSulfato(IdManoSulfato),
     FOREIGN KEY (IdMedida)  REFERENCES TipoMedida (IdMedida) 
    ) ;
	
INSERT INTO TipoMedida (IdMedida, Nombre)
VALUES (0,'Kilos');

INSERT INTO TipoMedida (IdMedida, Nombre)
VALUES  (1,'Gramos');

INSERT INTO TipoMedida (IdMedida, Nombre)
VALUES (2,'Litros');

INSERT INTO TipoMedida (IdMedida, Nombre)
VALUES (3,'Centilitros');

INSERT INTO TipoMedida (IdMedida, Nombre)
VALUES (4,'Mililitros');


INSERT INTO Marca (Nombre)
VALUES ('Delan Pro');
INSERT INTO Marca (Nombre)
VALUES ('Enervin Pro');
INSERT INTO Marca (Nombre)
VALUES ('Enervin SC');


INSERT INTO Articulo (Nombre, Cantidad,IdMArca,IdMedida)
VALUES ( 'fungicida', 3, 2, 1);


