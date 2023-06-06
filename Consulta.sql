use anotacao;

create table cns_consulta (
  cns_id bigint unsigned not null auto_increment,
  cns_descricao varchar(256) not null,
  cns_data_hora datetime not null,
  cns_duracao int not null,
  primary key (cns_id)
);

insert into cns_consulta(cns_descricao, cns_data_hora, cns_duracao)
  values('Primeira', '2023-05-23 19:10', 30);
insert into cns_consulta(cns_descricao, cns_data_hora, cns_duracao)
  values('Retorno', '2023-06-10 15:50', 10);
insert into cns_consulta(cns_descricao, cns_data_hora, cns_duracao)
  values('Segunda', '2023-06-23 13:30', 20);