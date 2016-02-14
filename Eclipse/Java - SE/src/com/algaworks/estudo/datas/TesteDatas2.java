package com.algaworks.estudo.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TesteDatas2 {

	public static void main(String[] args) {
		System.out.println("Date SQL: " + new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
		System.out.println("Date SQL: " + new java.sql.Date(new java.util.Date().getTime()));
		System.out.println("Date Util: " + new java.util.Date());

		System.out.println();

		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Formatador Util: " + formatador.format(new java.util.Date()));
		System.out.println(
				"Formatador SQL: " + formatador.format(new java.sql.Date(Calendar.getInstance().getTimeInMillis())));
		System.out.println("Formatador SQL: " + formatador.format(new java.util.Date().getTime()));
	}
}