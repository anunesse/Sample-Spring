package com.samplespring.dao;

import com.samplespring.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandre on 10/6/14.
 */
/* Ce DAO est managé par Spring, c'est un singleton */
@Repository
public class UserDao {

  /*
    Création en dure d'une liste d'utilisateurs
    Cette liste simule une base de donnée quelconque
    Initialisée avec les valeures suivantes
  */
  List<User> users = new ArrayList<>();
  {
    users.add(new User("John","Doe","123456789"));
    users.add(new User("Alex","Alex","123456789"));
  }

  /* CRUD Repository Operations: */
  /* CREATE */
  public void create(User user){
    users.add(user);
  }

  /* READ */
  public List<User> readAll(){
    return users;
  }

  /* UPDATE */
  public User update(int index, User user){
    users.remove(index);
    users.add(index, user);
    return users.get(index);
  }

  /* DELETE */
  public void delete(int index){
    users.remove(index);
  }

}
