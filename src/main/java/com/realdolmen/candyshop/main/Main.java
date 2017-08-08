package com.realdolmen.candyshop.main;


import com.realdolmen.candyshop.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("candyshop");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Person person = new Person("John", "Doe");
        em.persist(person);

        tx.commit();



        List<Person> personList = em.createQuery("SELECT p from Person p", Person.class).getResultList();

        personList.forEach(System.out::println);

        emf.close();
        emf.close();
    }
}
