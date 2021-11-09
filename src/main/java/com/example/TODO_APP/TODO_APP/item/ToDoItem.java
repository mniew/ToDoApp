package com.example.TODO_APP.TODO_APP.item;

public class ToDoItem{
    private Long id;
    private String name;
    private boolean completed;

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean equalsTo(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDoItem that = (ToDoItem) o;

        if (completed != that.completed) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (completed ? 1 : 0);
        return result;
    }

    public int compareTo(ToDoItem toDoItem) {
        return this.getId().compareTo(toDoItem.getId());
    }

    @Override
    public String toString() {
        return id + ": " + name + " [completed: " + completed + "]";
    }
}