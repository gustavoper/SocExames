create table exame
(
    id mediumint(8) unsigned not null primary key auto_increment,
    id_paciente mediumint(8) unsigned not null,
    id_medico mediumint(8) unsigned not null,
	id_tipo_exame mediumint(8) unsigned not null,
    email_paciente varchar(255) not null, 
    observacao_exame text null,
    id_externo_exame varchar(200) not null
);



create table medico
(
	id mediumint(8) unsigned not null primary key auto_increment,
	nome varchar(255) not null,
	ativo tinyint(1) unsigned not null default 1

);


create table paciente
(
	id mediumint(8) unsigned not null primary key auto_increment,
	nome varchar(255) not null,
	ativo tinyint(1) unsigned not null default 1
);


create table tipoExame
(
	id mediumint(8) unsigned not null primary key auto_increment, 
	nome varchar(200) not null,
	ativo tinyint(1) unsigned not null default 1
);