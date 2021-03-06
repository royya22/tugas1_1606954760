package com.tugas.apap.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MahasiswaModel {
	private int id;
	private String npm;
	private String nama;
	private String tempat_lahir;
	private String tanggal_lahir;
	private int jenis_kelamin;
	private String agama;
	private String golongan_darah;
	private String status;
	private String tahun_masuk;
	private String jalur_masuk;
	private int id_prodi;
	
	public MahasiswaModel (String npm, String nama, String tempat_lahir, String tanggal_lahir, int jenis_kelamin, String agama,
			String golongan_darah, String status, String tahun_masuk, String jalur_masuk, int id_prodi) {
		this.npm = npm;
		this.nama = nama;
		this.tempat_lahir = tempat_lahir;
		this.tanggal_lahir = tanggal_lahir;
		this.jenis_kelamin = jenis_kelamin;
		this.agama = agama;
		this.golongan_darah = golongan_darah;
		this.status = status;
		this.tahun_masuk = tahun_masuk;
		this.jalur_masuk = jalur_masuk;
		this.id_prodi = id_prodi;
	}

}
