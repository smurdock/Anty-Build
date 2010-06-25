<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:html>
  <h1>Periodic Element</h1>
  Name: <bean:write name="element" property="name"/><br>
  Symbol: <bean:write name="element" property="symbol"/><br>
  Number: <bean:write name="element" property="number"/><br>
  Mass: <bean:write name="element" property="mass"/><br>

  <html:link forward="search">Search</html:link><p>

  Your IP address is <bean:write name="ip"/><br>
</html:html>




