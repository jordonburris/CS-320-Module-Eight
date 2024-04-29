import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskTest {

    @Test
    public void createValidTask() {
        Task task = new Task("1", "Task 1", "Description 1");
        Assert.assertEquals("1", task.getTaskId());
        Assert.assertEquals("Task 1", task.getName());
        Assert.assertEquals("Description 1", task.getDescription());
    }

}
