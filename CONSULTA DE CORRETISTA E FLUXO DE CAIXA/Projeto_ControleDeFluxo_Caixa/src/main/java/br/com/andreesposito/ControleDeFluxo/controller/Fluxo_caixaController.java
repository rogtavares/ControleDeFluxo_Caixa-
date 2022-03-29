package br.com.andreesposito.ControleDeFluxo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andreesposito.ControleDeFluxo.dao.Fluxo_caixaDao;
import br.com.andreesposito.ControleDeFluxo.model.Fluxo_caixa;

@RestController
public class Fluxo_caixaController {

	@Autowired
	private Fluxo_caixaDao dao;
	
	@GetMapping("/fluxo")
	public ArrayList<Fluxo_caixa> recuperarTudo() {
		ArrayList<Fluxo_caixa> lista = (ArrayList<Fluxo_caixa>)dao.findAll();
		return lista;
	}
}