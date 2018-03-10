package com.william.support;

import io.swagger.jaxrs.config.BeanConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class SwaggerBootstrap extends HttpServlet {

  @Override
  public void init(ServletConfig config) throws ServletException {
      super.init(config);
      BeanConfig beanConfig = new BeanConfig();
      beanConfig.setVersion("1.0.0");
      beanConfig.setSchemes(new String[]{"http"});
      beanConfig.setHost("localhost:8282");
      beanConfig.setBasePath("/resteasy");
      beanConfig.setResourcePackage("com.william.service");
      beanConfig.setScan(true);
  }
}
