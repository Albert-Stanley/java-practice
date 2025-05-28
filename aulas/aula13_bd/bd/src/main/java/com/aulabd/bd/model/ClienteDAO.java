
package com.aulabd.bd.model;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class ClienteDAO {


    @Autowired //CONSTROI AUTOMATICAMENTE
	DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	private void initialize() {
		jdbc = new JdbcTemplate(dataSource);
	}

    public void inserirCliente(Cliente cli){
        String sql = "INSERT INTO cliente(nome,cpf) VALUES(?,?)";
        Object[] parametros = new Object[2]; //Um para cada ?
        parametros[0] = cli.getNome();
        parametros[1] = cli.getCpf();
        jdbc.update(sql,parametros);
    }

}
