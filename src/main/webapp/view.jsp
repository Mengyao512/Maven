<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.bdqn.entity.MembersInfo" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <table border="1">
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>年龄</td>
                <td>地址</td>
                <td>email</td>
                <td>操作</td>
            </tr>
            <%
                List<MembersInfo> list = (List<MembersInfo>) request.getAttribute("list");
                for(int i =0;i<list.size();i++){
                    MembersInfo membersInfo = list.get(i);
                %>
                    <tr>
                        <td><%=membersInfo.getId()%></td>
                        <td><%=membersInfo.getMname()%></td>
                        <td><%=membersInfo.getMgender()%></td>
                        <td><%=membersInfo.getMage()%></td>
                        <td><%=membersInfo.getMaddress()%></td>
                        <td><%=membersInfo.getMemail()%></td>
                        <td><a href="view.jsp">删除</a></td>
                    </tr>
            <%}%>



        </table>

</body>
</html>
