package ru.netology.repository;

import ru.netology.model.Post;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

// Stub
public class PostRepository {
  private int id = 0;
  private ConcurrentHashMap<Integer, Post> postsMap = new ConcurrentHashMap<>();

  public List<Post> all() {
    return Collections.emptyList();
  }

  public Optional<Post> getById(long id) {
    return Optional.empty();
  }

  public synchronized Post save(Post post) {
    if (postsMap.containsKey(id) && id != 0) {
      postsMap.replace(id, post);
    } else {
      id++;
      postsMap.put(id, post);
    }
    return post;
  }

  public void removeById(long id) {
  }
}
