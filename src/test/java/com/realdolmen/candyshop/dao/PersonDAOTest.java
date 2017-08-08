package com.realdolmen.candyshop.dao;


import com.realdolmen.candyshop.entities.Person;
import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonDAOTest {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static EntityTransaction tx;
    private static PersonDAOImpl dao;

    @BeforeClass
    public static void setup() {
         emf = Persistence.createEntityManagerFactory("test");
         dao = new PersonDAOImpl();
    }

    @Before
    public void init() {
        em = emf.createEntityManager();
        dao.em = em;
        tx = em.getTransaction();
        tx.begin();
    }


    @After
    public void destroy() {
        tx.rollback();
        em.close();
    }

    @AfterClass
    public static void cleanUp() {

        emf.close();
    }

    @Test
    public void shouldSavePerson() {
        Person p = new Person("Theo", "Tester");
        Long id = dao.createPerson(p);
        assertEquals(new Long(3L), id);
    }

    @Test
    public void shouldFindAllPeople() {
        List<Person> people = dao.findAllPeople();
        assertNotNull(people);
        assertEquals(2, people.size());
    }
}

























