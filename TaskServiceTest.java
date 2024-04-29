import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskServiceTest {

	public class TaskServiceTest {
	    private TaskService taskService;

	    @Before
	    public void setup() {
	        taskService = new TaskService();
	    }

	    @Test
	    public void addValidTask() {
	        taskService.addTask("1", "Task 1", "Description 1");
	    }

}
