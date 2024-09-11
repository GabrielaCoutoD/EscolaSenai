package com.escolasenai.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.escolasenai.poo.parte1.Aluno;
import com.escolasenai.poo.parte1.Endereco;
import com.escolasenai.poo.parte1.Menu;
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
		
		Menu.menuFinal();
	}
}