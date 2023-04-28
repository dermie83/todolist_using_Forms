package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Todo;

import play.Logger;
import play.mvc.Controller;

public class Admin extends Controller
{
    public static void index()
    {
        Logger.info("Rendering Admin");

        List<Todo> todoList = Todo.findAll();
        render ("admin.html", todoList);
    }
}