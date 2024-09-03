package com.africacoding.app;

import java.lang.reflect.Method;
import java.util.List;

public class MainDemo {

    public static void main(String[] args) {


      try {
          List<Person> persons = List.of(new Juge(), new Medecin(), new Developer());


          for (Person person: persons){

              Class<? extends Person> classe = person.getClass();

              if (classe.isAnnotationPresent(ServiteurDeEtat.class)) {
                  ServiteurDeEtat annotation = classe.getAnnotation(ServiteurDeEtat.class);
                  System.out.println("Vous un citoyen d'honneur, vous etes au service de l'Etat depuis "
                          + annotation.experience() + " ans comme "+annotation.name());

              }else {
                  System.out.println("Vous etes certainement une personne talentueuse mais pas au service de l'Etat");
              }

//              for (Method methode : classe.getDeclaredMethods()) {
//                  methode.invoke(classe.getDeclaredConstructor().newInstance());
//              }
          }
      }catch (Exception e){
          e.printStackTrace();
      }
    }
}
