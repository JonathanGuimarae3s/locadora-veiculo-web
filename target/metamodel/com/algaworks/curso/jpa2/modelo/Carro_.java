package com.algaworks.curso.jpa2.modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Carro.class)
public abstract class Carro_ {

	public static volatile SingularAttribute<Carro, Date> dataModificacao;
	public static volatile SingularAttribute<Carro, Long> codigo;
	public static volatile SingularAttribute<Carro, BigDecimal> valorDiaria;
	public static volatile SingularAttribute<Carro, String> cor;
	public static volatile SingularAttribute<Carro, String> chassi;
	public static volatile ListAttribute<Carro, Acessorio> acessorios;
	public static volatile ListAttribute<Carro, Aluguel> alugueis;
	public static volatile SingularAttribute<Carro, ModeloCarro> modelo;
	public static volatile SingularAttribute<Carro, Date> dataCriacao;
	public static volatile SingularAttribute<Carro, String> placa;

}

