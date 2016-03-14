package br.com.bancodeolhosjava.interceptor;

import javax.inject.Inject;

import br.com.bancodeolhosjava.annotation.Public;
import br.com.bancodeolhosjava.controllers.LoginController;
import br.com.bancodeolhosjava.controllers.UsuarioLogado;
import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;

@Intercepts
public class AutorizadorInterceptor {

	@Inject private UsuarioLogado usuarioLogado;
	@Inject private Result result;
	@Inject private ControllerMethod controllerMethod;
	
	@Accepts // Define quem vai ser ou não interceptado
	public boolean accepts(){
		return !controllerMethod.containsAnnotation(Public.class);
	}
	
	@AroundCall // Intercepta todas as requisições que não tem a notação @Public
	public void intercepta(SimpleInterceptorStack stack){
		if(usuarioLogado.getUsuario()==null){
			result.redirectTo(LoginController.class).formulario();
			return;
		}
		stack.next();
	}
}
