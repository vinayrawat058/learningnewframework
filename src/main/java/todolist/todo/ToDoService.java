package todolist.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository toDoRepository;

	
	public List<Todo>getAllToDos() {
		List<Todo> todos = new ArrayList<>();
		toDoRepository.findAll().forEach(todos::add);
		return todos;
	}
	
	
	public Todo getToDo(Integer id)
	{
		return toDoRepository.findOne(id);
	}

	public void createToDo(Todo todo) {
		// TODO Auto-generated method stub
		 toDoRepository.save(todo);
	}
	


	public void updateToDo(Integer id, Todo todo) {
		// TODO Auto-generated method stub
		toDoRepository.save(todo);
	}

	public void deleteToDo(Integer id) {
		// TODO Auto-generated method stub
		toDoRepository.deleteById(id);
	}
		
}
