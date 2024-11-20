CREATE TABLE data_mhs_ruthnissi(
	id_mahasiswa serial PRIMARY KEY,
	first_name varchar(30),
	last_name varchar(30),
	nilai_uts INTEGER
);

INSERT INTO data_mhs_ruthnissi VALUES
	(001, 'Julia', 'Bolton', 89),
	(002, 'Aaron', 'Smith', 91),
	(003, 'Genta', 'Mahendra', 87),
	(004, 'Ruthnissi', 'Asmoro', 90),
	(005, 'Felicya', 'Jane', 78),
	(006, 'Putra', 'Dika', 89);
	
SELECT * FROM data_mhs_ruthnissi;

ALTER TABLE data_mhs_ruthnissi ADD nilai_uas INT;

INSERT INTO data_mhs_ruthnissi VALUES(007, 'Xav', 'Grey', 85, 94);

UPDATE data_mhs_ruthnissi
set nilai_uas = 89
WHERE id_mahasiswa = 006;

SELECT * FROM data_mhs_ruthnissi 
WHERE nilai_uts <= 89;


BEGIN
ALTER TABLE data_mhs_ruthnissi ADD keterangan VARCHAR(30);

UPDATE data_mhs_ruthnissi
set keterangan = 'Aktif';

UPDATE data_mhs_ruthnissi
set keterangan = 'Tidak Aktif'
WHERE id_mahasiswa = 005;

COMMIT;
rollback;