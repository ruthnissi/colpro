CREATE TABLE mahasiswa(
	id INT(11) NOT NULL AUTO_INCREMENT,
    nama VARCHAR(255) NOT NULL,
    npm VARCHAR(20) NOT NULL, 
    ipk FLOAT NOT NULL,
    semester INT NOT NULL,
    PRIMARY KEY (id)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;
