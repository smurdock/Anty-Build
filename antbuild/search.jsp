<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-form.tld" prefix="form" %>

<html:html>
<body>
  <h1>Search for an Element</h1>
    
  <form:form action="/searchsubmit.do">
    symbol <form:text property="symbol"/> 
  <html:submit value="Search"/>
  </form:form>

  <html:errors/>

</body>
</html:html>




