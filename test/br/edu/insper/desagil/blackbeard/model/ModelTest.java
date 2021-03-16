package br.edu.insper.desagil.blackbeard.model;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModelTest {
	private Model model;

	@BeforeEach
	public void setUp() {
		model = new Model();
	}

	@Test
	public void testNaoAdicionaAluno() {
		assertNull(model.getAluno(1));
	}

	@Test
	public void testAdicionaUmAluno() {
		model.adicionaAluno(1, "João");
		assertEquals("João", model.getAluno(1).getNome());
	}

	@Test
	public void testNaoAdicionaDisciplina() {
		assertNull(model.getDisciplina("DESSOFT"));
	}

	@Test
	public void testAdicionaUmaDisciplina() {
		model.adicionaDisciplina("DESSOFT", "Design de Software");
		assertEquals("Design de Software", model.getDisciplina("DESSOFT").getNome());
	}
}
