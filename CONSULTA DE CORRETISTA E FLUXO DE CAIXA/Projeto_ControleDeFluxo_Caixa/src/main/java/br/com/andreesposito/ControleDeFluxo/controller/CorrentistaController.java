package br.com.andreesposito.ControleDeFluxo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andreesposito.ControleDeFluxo.dao.CorrentistaDao;
import br.com.andreesposito.ControleDeFluxo.model.Correntista;

@RestController
public class CorrentistaController {
	 
	@Autowired
	private CorrentistaDao dao;
	
	@GetMapping("/correntista")
	public ArrayList<Correntista> recuperarTudo() {
		ArrayList<Correntista> lista = (ArrayList<Correntista>)dao.findAll();
		return lista;
	}
	
}