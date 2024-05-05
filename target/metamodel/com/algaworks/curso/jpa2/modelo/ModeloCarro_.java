package com.algaworks.curso.jpa2.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ModeloCarro.class)
public abstract class ModeloCarro_ {

	public static volatile SingularAttribute<ModeloCarro, Long> codigo;
	public static volatile SingularAttribute<ModeloCarro, Categoria> categoria;
	public static volatile SingularAttribute<ModeloCarro, Fabricante> fabricante;
	public static volatile SingularAttribute<ModeloCarro, String> descricao;

}

