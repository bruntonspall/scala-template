package com.gu.example

import javax.servlet._


class ExampleFilterServlet extends Filter {
  def init(filterConfig: FilterConfig) { }
  def destroy() { }
  def doFilter(servletRequest: ServletRequest, servletResponse: ServletResponse, next: FilterChain) {
    servletResponse.getWriter.println("Testing")
  }
}