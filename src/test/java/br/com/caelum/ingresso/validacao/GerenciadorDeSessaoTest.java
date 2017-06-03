package br.com.caelum.ingresso.validacao;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

public class GerenciadorDeSessaoTest {

	@Test
	public void garanteQueNaoDevePermitirSessaoNoMesmoHorario() {
		
		Filme filme = new Filme();
		filme.setDuracao(120);
		LocalTime horario = LocalTime.now();
		
		Sala sala = new Sala("Sala 1");
		//List<Sessao> = Arrays.asList(new Sessao(horario, filme, sala));
		
		
	}
}
