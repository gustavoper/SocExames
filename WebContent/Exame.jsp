<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Novo Exame</title>
</head>
<body>
<s:form action="" method="post">
		<s:textfield label="Nome do Paciente" name="NomePaciente" />
		<s:textfield label="Médico" name="nomeMedico" />
		<s:password label="E-mail do paciente" name="emailPaciente" />
		<s:textarea label="Observação" name="observacaoExame" />
		<s:submit cssClass="button-register" value="Cadastrar" />
	</s:form>
</body>
</html>