<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:choose>
  <c:when test="${not empty tasks}">
    <ul>
      <c:forEach var="task" items="${tasks}">
        <li><strong>${task.title}</strong> - ${task.description}</li>
      </c:forEach>
    </ul>
  </c:when>
  <c:otherwise>
    <p>No tasks found for this month.</p>
  </c:otherwise>
</c:choose>
