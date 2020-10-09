/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileReader;
import java.io.FileWriter;
import domain.Note;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Oadfa
 */
public class NoteServlet extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    String path = this.getServletContext().getRealPath("/WEB-INF/note.txt");
    BufferedReader br = new BufferedReader(new FileReader(new File(path)));
   
    String edit = request.getParameter("edit");
    String note = request.getParameter("note");
    
    if(edit !=null){
        request.setAttribute("note", note);
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
  }
 }

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    
 }
}
   