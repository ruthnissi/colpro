CREATE TABLE barang(
    id_barang serial PRIMARY KEY NOT NULL,
    nama_barang varchar(20) NOT NULL,
    stok int,
    harga int
);

INSERT INTO barang VALUES (1,'baju',3,15000);
INSERT INTO barang VALUES (2,'celana',5,10000);
INSERT INTO barang VALUES (3,'jaket',6,25000);
INSERT INTO barang VALUES (4,'kemeja',2,30000);
INSERT INTO barang VALUES (5,'sepatu',3,20000);

SELECT * FROM barang;


CREATE TABLE pembeli(
    id_pembeli serial PRIMARY KEY NOT NULL,
    nama varchar(20) NOT NULL,
    alamat varchar(50)
);

INSERT INTO pembeli VALUES(1,'gerald ahmad','jl.maruki');
INSERT INTO pembeli VALUES(2,'farizi setya','jl.andayani');
INSERT INTO pembeli VALUES(3,'freya azzahra','jl.mahunten');
INSERT INTO pembeli VALUES(4,'annisa salsabilla','jl.zendana');
INSERT INTO pembeli VALUES(5,'anne samanda','jl.tinizoa');

SELECT * FROM pembeli;

CREATE TABLE penjualan (
    id_penjualan serial primary key not null,
    cabang varchar (20),
    hari_jual varchar(10),
    penjual varchar(10),
    jumlah_beli int,
    id_barang int not null,
    id_pembeli int not null
);

INSERT INTO penjualan VALUES (1,'Depok','Kamis','cece',2,3,4);
INSERT INTO penjualan VALUES (2,'Jakarta','Rabu','jennifer',1,2,1);
INSERT INTO penjualan VALUES (3,'Cibubur','Jumat','cece',4,3,3);
INSERT INTO penjualan VALUES (4,'Jakarta','Kamis','ahmad',2,1,2);
INSERT INTO penjualan VALUES (5,'Depok','Rabu','cece',1,4,5);

SELECT * FROM penjualan;

SELECT * FROM penjualan
JOIN pembeli
ON penjualan.id_pembeli = pembeli.id_pembeli;

SELECT penjualan.cabang, penjualan.hari_jual, barang.nama_barang, penjualan.jumlah_beli
FROM penjualan, barang
WHERE penjualan.id_barang = barang.id_barang;

select jual.cabang, jual.hari_jual, brg.nama_barang, jual.jumlah_beli
from penjualan jual, barang brg
where jual.id_barang = brg.id_barang;

SELECT brg.nama_barang, jual.hari_jual, jual.jumlah_beli, jual.cabang
FROM penjualan jual, barang brg
WHERE jual.id_barang = brg.id_barang;

SELECT customer.nama, jual.hari_jual, jual.cabang, jual.penjual, brg.nama_barang
FROM pembeli customer, penjualan jual, barang brg
WHERE jual.id_pembeli = customer.id_pembeli
AND jual.id_barang = brg.id_barang;