package com.algaworks.curso.jpa2.modelo;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ApoliceSeguro.class)
public abstract class ApoliceSeguro_ {

	public static volatile SingularAttribute<ApoliceSeguro, Long> codigo;
	public static volatile SingularAttribute<ApoliceSeguro, Boolean> protecaoRoubo;
	public static volatile SingularAttribute<ApoliceSeguro, Boolean> protecaoCausasNaturais;
	public static volatile SingularAttribute<ApoliceSeguro, BigDecimal> valorFranquia;
	public static volatile SingularAttribute<ApoliceSeguro, Boolean> protecaoTerceiro;

}

