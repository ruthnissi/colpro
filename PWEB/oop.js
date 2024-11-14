class Kendaraan {
    constructor(nama, warna) {
        this.nama = nama;
        this.warna = warna;
    }

    mesinHidup(){
        console.log("Menyalakan Mesin");
    }
    klakson(){
        console.log("Bunyikan Klakson");
    }
}

class Mobil extends Kendaraan {
    mesinHidup(){
        console.log("Suara Mobil...");
    }
    klakson(){
        console.log("Klakson Mobil");
    }
}

class Motor extends Kendaraan {
    mesinHidup() {
        console.log("Suara Motor");
    }
    klakson(){
        console.log("Klakson Mobil");
    }
}

const mobil = new Mobil("Mitsubishi", "Hitam");
const motor = new Motor("Yamaha", "Merah");

console.log("Merk mobil =", mobil.nama);
console.log("Warna mobil", mobil.warna);
console.log("Merk motor", motor.nama);
console.log("Warna motor", motor.warna);

mobil.klakson();
mobil.mesinHidup();
motor.mesinHidup();
motor.klakson();