package br.com.casadocodigo.loja.conf;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	//Sobe as configurações quando o sistema subir
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{SecurityConfiguration.class, AppWebConfiguration.class, JPAConfiguration.class};
	}
	//Sobe as configurações quando acessa a primeira vez o sistema
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		return new Filter[]{characterEncodingFilter};
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		// Como o arquivo vem, sera enviado para o servidor, por isso o construtor recebe uma string vazia
		registration.setMultipartConfig(new MultipartConfigElement(""));
	}
}
