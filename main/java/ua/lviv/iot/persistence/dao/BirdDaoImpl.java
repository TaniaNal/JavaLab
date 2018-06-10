package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.model.Bird;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

    @Named
    @Dependent
    public class BirdDaoImpl extends AbstractDao<Bird> implements BirdDao, Serializable {

        private static final long serialVersionUID = 1L;

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        protected Class<Bird> getEntityClass() {
            return Bird.class;
        }

        //@Resource
        //private UserTransaction userTransaction;

    }


