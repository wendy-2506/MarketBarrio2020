insert into Tipo_Empleado values (1,'Gerente de tienda')
insert into Tipo_Empleado values (2,'Cajero')

insert into Empleado values (1,'Mendoza', 'Wendy',1,'2018-01-01',1,'2018-01-01','wendym','ultrasecreto',1,1)
insert into Empleado values (2,'Apaza', 'Jhoel',1,'2018-01-01',1,'2018-01-01','jhemapca','jhoelemir10',2,1)
insert into Empleado values (3,'Castillo', 'Daniel',1,'2018-01-01',1,'2018-01-01','danielc','secreto234',2,1)
insert into Empleado values (4,'Grados', 'Jimmy',1,'2018-01-01',1,'2018-01-01','jimmyg','987secret',2,1)

insert into Tipo_Cliente values (1,'Cliente natural')
insert into Tipo_Cliente values (2,'Empresa')

insert into Cliente values (1,1,2,'2018-01-01',2,'2018-01-01','ejemplo123@hotmail.com','967301439','San Miguel',1)
insert into Cliente_Persona values (1,'Vega','Rodrigo',70812943)
insert into Cliente values (2,2,2,'2018-01-01',2,'2018-01-01','empresa@gmail.com','962232158','La molina',1)
insert into Cliente_Empresa values(2,'Empresa El Ejemplo','Mariano Ramirez','10164090588')

insert into Proveedor values(1, 'Ucp Backus y Jonhston', '1798285937001', 'Alonso Fernandez', 'Alonso de Molina 543 - Santiago de Surco', '01-765678')
insert into Proveedor values(2, 'Aje Group', '2698685737201', 'Maria Sanchez', 'Los Geranios 123 - San Miguel', '01-456783')
insert into Proveedor values(3, 'Coca Cola Peru', '459828123001', 'John Smith', 'Av. Los Girasoles 6745 - Callao', '01-123456')
insert into Proveedor values(4, 'Alicorp', '123145123544', 'Juan Perez', 'Micaela Bastidas 546 - San Isidro', '01-123451')
insert into Proveedor values(5, 'Makro Supermayorista S.A.', '20492092313', 'Jose Passano', 'Av. Jorge Chavez Nro. 1218 - Santiago de Surco', '01-6348000')

insert into Tienda values (1,'Market Barrio- Sede Colonial', 'Av.Los Santos 452 - San Borja')
insert into Tienda values (2,'Market Barrio- Sede Bolichera', 'Av.Tupac Amaru 124 - San Juan de Miraflores')

insert into TipDocVenta values (1,'Boleta')
insert into TipDocVenta values (2,'Factura')

insert into SerieDV values(1,2,'2018-01-01',1,001,100,'2019-01-01',1)
