package com.algaworks.curso.jpa2.modelo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Aluguel.class)
public abstract class Aluguel_ {

	public static volatile SingularAttribute<Aluguel, Carro> carro;
	public static volatile SingularAttribute<Aluguel, Long> codigo;
	public static volatile SingularAttribute<Aluguel, Motorista> motorista;
	public static volatile SingularAttribute<Aluguel, BigDecimal> valorTotal;
	public static volatile SingularAttribute<Aluguel, Date> dataEntrega;
	public static volatile SingularAttribute<Aluguel, Calendar> dataPedido;
	public static volatile SingularAttribute<Aluguel, ApoliceSeguro> apoliceSeguro;
	public static volatile SingularAttribute<Aluguel, Date> dataDevolucao;

}

