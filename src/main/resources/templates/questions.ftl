<html>
<head>
    <title>questions</title>
</head>
<body>
<table class="table table-striped">
    <thead>
    <th>ID</th>
    <th>Description</th>
    <th>Points</th>
    </thead>
    <tbody>
        <#list questions as question>
            <tr>
                <td>${question.id}</td>
                <td>${question.description}</td>
                <td>${question.points}</td>
            </tr>
        </#list>
    </tbody>
</table>
</body>
</html>