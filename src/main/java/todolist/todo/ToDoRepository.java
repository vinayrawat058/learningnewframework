package todolist.todo;

import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<Todo, Integer> {
	
	
}
