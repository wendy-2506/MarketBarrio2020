create database [MARKETBARRIO] on primary
(name = N'MARKETBARRIO', filename = N'D:\DATA\MARKETBARRIO.mdf', size = 6144KB, maxsize = unlimited, filegrowth = 1024kb)
log on
(name = N'MARKETBARRIO_log', filename = N'D:\DATA\MARKETBARRIO_log.ldf', size = 3072KB, maxsize = 2048GB, filegrowth = 10%)
go
-------------
USE  [MARKETBARRIO]
GO

CREATE TABLE Tipo_Empleado (
	idTipoEmp int NOT NULL, 
	descripcion varchar(255),
	PRIMARY KEY(idTipoEmp)
);

CREATE TABLE Empleado(
	idEmpleado int NOT NULL,
	apellidos varchar(255),
	nombres varchar(255),
	idEmpReg int,
	fechReg date,
	idEmpMod int,
	fechMod date,
	usr varchar(255),
	pw varchar (255),
	idTipoEmp int FOREIGN KEY REFERENCES Tipo_Empleado(idTipoEmp),
	estado int,
	PRIMARY KEY (idEmpleado)
);
CREATE TABLE Proveedor (
	idProveedor int NOT NULL,
	razon_Soc varchar(255),
	ruc varchar (255),
	nomb_repre varchar (255),
	direccion varchar (255),
	telefono varchar(255),
	PRIMARY KEY (idProveedor)
);

---------------------
CREATE TABLE Tienda(
	idTienda int NOT NULL,
	descTienda varchar(255),
	direccion varchar(255),
	PRIMARY KEY (idTienda)
);
---------------------
CREATE TABLE Categoria(
	idCategoria int NOT NULL,
	descrip varchar(255),
	PRIMARY KEY (idCategoria)
);
---------------------
CREATE TABLE Marca(
	idMarca int NOT NULL,
	descMarc varchar(255),
	PRIMARY KEY (idMarca)
);
---------------------

CREATE TABLE Tipo_Cliente(
	idTipoCli int NOT NULL,
	descripcion varchar(255),
	PRIMARY KEY (idTipoCli)
);
--------------------

CREATE TABLE Cliente(
	idCliente int NOT NULL,
	idTipoCli int FOREIGN KEY REFERENCES Tipo_CLiente(idTipoCli),
	idEmpReg int FOREIGN KEY REFERENCES Empleado(idEmpleado),
	idEmpMod int FOREIGN KEY REFERENCES Empleado(idEmpleado),
	correo_electr varchar(300),
	fechMod date,
	estado int,
	PRIMARY KEY (idCliente)
);
-------------------
CREATE TABLE Cliente_Persona(
	idCliente int FOREIGN KEY REFERENCES Cliente(idCliente),
	apell varchar(255),
	nomb varchar (255),
	dni float,
	direccion varchar(255),
	telefono varchar(255)
);
---------------------
CREATE TABLE Cliente_Empresa(
	idCliente int FOREIGN KEY REFERENCES Cliente(idCliente),
	razon_Social varchar (255),
	representante varchar (255),
	ruc varchar (255),
	direccion varchar (255),
	telefono varchar(255)
);

---------------------
CREATE TABLE SerieDV (
    idSerie int NOT NULL,
	idEmpReg int FOREIGN KEY REFERENCES Empleado(idEmpleado),
    fechReg date,
	idTienda int FOREIGN KEY REFERENCES Tienda(idTienda),
	numInicio int,
	numFin int,
	fechCierre date,
    estado int,
    PRIMARY KEY (idSerie)
);
---------------------
CREATE TABLE Cab_Entrada (
    idEntrada int NOT NULL,
	idEmpReg int FOREIGN KEY REFERENCES Empleado(idEmpleado),
    fechReg date,
	idTienda int FOREIGN KEY REFERENCES Tienda(idTienda),
	idProveedor int FOREIGN KEY REFERENCES Proveedor(idProveedor),
	idEmpMod int FOREIGN KEY REFERENCES Empleado(idEmpleado),
	fechMod date,
	estado int,
    PRIMARY KEY (idEntrada)
);
----------------------
CREATE TABLE Producto(
	idProducto int NOT NULL,
	descripcion varchar(255),
	idCategoria int FOREIGN KEY REFERENCES Categoria(idCategoria),
	idMarca int FOREIGN KEY REFERENCES Marca(idMarca),
	precioUnit float,
	unidMed varchar(255),
	estado int,
	PRIMARY KEY(idProducto)
);

---------------------
CREATE TABLE Det_Entrada(
	idEntrada int FOREIGN KEY REFERENCES Cab_Entrada(idEntrada),
	idProducto int FOREIGN KEY REFERENCES Producto(idProducto),
	precio float,
	cantidad int
);
---------------------

CREATE TABLE TipDocVenta(
	idTipo int NOT NULL,
	descrip varchar(255),
	PRIMARY KEY (idTipo)
);
-------------------------

CREATE TABLE Cab_DocVenta(
	idVenta int NOT NULL,
	idCliente int FOREIGN KEY REFERENCES Cliente(idCliente),
	fechVenta date,
	idEmpReg int FOREIGN KEY REFERENCES Empleado(idEmpleado),
	idTipo int FOREIGN KEY REFERENCES TipDocVenta(idTipo),
	idTienda int FOREIGN KEY REFERENCES Tienda(idTienda),
	idEmpMod int FOREIGN KEY REFERENCES Empleado(idEmpleado),
	estado int,
	PRIMARY KEY (idVenta)
);
---------------------
CREATE TABLE Factura(
	idFactura int NOT NULL,
	idSerie int FOREIGN KEY REFERENCES SerieDV(idSerie),
	numFac int,
	idVenta int FOREIGN KEY REFERENCES Cab_DocVenta(idVenta),
	PRIMARY KEY (idFactura)
);

---------------------
CREATE TABLE Boleta(
	idBoleta int NOT NULL,
	idSerie int FOREIGN KEY REFERENCES SerieDV(idSerie),
	numBol int,
	idVenta int FOREIGN KEY REFERENCES Cab_DocVenta(idVenta),
	PRIMARY KEY (idBoleta)
);
---------------------

CREATE TABLE Det_DocVenta(
	idVenta int FOREIGN KEY REFERENCES Cab_DocVenta(idVenta),
	idProducto int FOREIGN KEY REFERENCES Producto(idProducto),
	stock int,
);
---------------------



