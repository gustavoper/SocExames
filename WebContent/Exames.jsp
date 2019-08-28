<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>SOC - Exames</title>
<style type="text/css">

</style>
</head>
<body>
	<h2>SOC - Exames</h2>
	
		<div style="margin-top: 40px;">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>Paciente</th>
						<th>Médico</th>
						<th>Tipo de Exame</th>
						<th>Ações</th>
					</tr>
				</thead>
				
				<s:iterator value="listExames">
					<tr>
						<td><s:property value="nome_paciente" /></td>
						<td><s:property value="nome_medico" /></td>
						<td><s:property value="tipo_exame" /></td>
						<td>
							<a href="updatedetails.action?submitType=updatedata&uemail=<s:property value="uemail"/>">
								<button class="button-update">Update</button>
							</a>
							<a href="deleterecord.action?uemail=<s:property value="uemail"/>">
								<button class="button-delete">Delete</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
	</div>
	
</body>
</html>
