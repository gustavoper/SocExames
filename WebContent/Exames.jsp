<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>SOC - Exames</title>
<style type="text/css">

</style>
</head>
<body>
	<h2>SOC - Exames</h2>
	<hr>
	<h3>Novo Exame</h3>
	<s:form action="novoExame.action" method="post">
		<s:textfield label="Nome do Paciente" name="NomePaciente" />
		<s:textfield label="Médico" name="nomeMedico" />
		<s:password label="E-mail do paciente" name="emailPaciente" />
		<s:textarea label="Observação" name="observacaoExame" />
		<s:submit cssClass="button-register" value="Cadastrar" />
	</s:form>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
	<hr>
	
	
		<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>Paciente</th>
						<th>Médico</th>
						<th>E-mail (paciente)</th>
						<th>ID Exame</th>
						<th>Acoes</th>
					</tr>
				</thead>
				<s:iterator value="beanList">
					<tr>
						<td><s:property value="nomePac" /></td>
						<td><s:property value="nomeMedic" /></td>
						<td><s:property value="emailPac" /></td>
						<td><s:property value="exameId" /></td>
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
		</s:if>
		<s:else>
			<div style="color: red;">Sem registros.</div>
		</s:else>
	</div>
	
</body>
</html>
