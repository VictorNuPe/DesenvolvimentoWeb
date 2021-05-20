package br.com.turma.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.modelo.Usuario;
import br.com.turma.simulabanco.Banco;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("txtnome");
		Date dataNascimento = converterParaDate(request.getParameter("txtdatanascimento"));
		String usuario = request.getParameter("txtusuario");
		String senha = request.getParameter("txtsenha");

		Usuario user = new Usuario(nome, dataNascimento, usuario, senha);
		Banco.adiciona(user);

		/*
		 * Somente testando para ver se realmente adicionou Este trecho de c�digo �
		 * tempor�rio Ser� retirado posteriormente
		 */

		for (Usuario listaUsuario : Banco.getUsuarios()) {
			PrintWriter out = response.getWriter();
			out.println(listaUsuario.getNome());
			out.println(listaUsuario.getDataNascimento());
			out.println(listaUsuario.getUsuario());
			out.println(listaUsuario.getSenha());
		}
	}

	private Date converterParaDate(String dataComoString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date dataFormatada = null;
		try {
			dataFormatada = sdf.parse(dataComoString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataFormatada;
	}

}
