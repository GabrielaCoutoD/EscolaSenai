package com.escolasenai.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.escolasenai.poo.parte1.Aluno;
import com.escolasenai.poo.parte1.Endereco;
import com.escolasenai.poo.parte1.Pessoa;
import com.escolasenai.poo.parte1.Situacao;
import com.escolasenai.poo.parte1.UnidadeFederal;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
		LocalDate localDate1 = LocalDate.of(2004, 10, 8);
		Date date1 = Date.from(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Endereco end1 = new Endereco("Alexandre Alves Antunes", 755,
				"Casa B", "Petrópolis", UnidadeFederal.RJ, "25730005");


		Pessoa aluno1 = new Aluno(Pessoa.countRegistro,"10211020012", "Gabriela Couto",
				date1, end1, "(24)988424197", "gabrielanadar@gmail.com",
				"176270EM!m", "Curso Desenvolvimento de Software",
				new Date(),Situacao.APROVADO);

		System.out.println(aluno1);

	}
}