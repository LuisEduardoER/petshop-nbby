package com.sun.javaee.blueprints.petstore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Handler interface implemented by all actions associated with a ServletController
 * @author Inderjeet Singh
 */
public interface ControllerAction {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
