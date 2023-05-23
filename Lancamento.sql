use anotacao;

create table lnc_lancamento (
  lnc_id bigint unsigned not null auto_increment,
  lnc_justificativa varchar(256) not null,
  lnc_data_hora_inicio datetime not null,
  lnc_data_hora_fim datetime not null,
  lnc_tipo char(1) not null,
  primary key (lnc_id)
);

insert into lnc_lancamento(lnc_justificativa, lnc_data_hora_inicio, lnc_data_hora_fim, lnc_tipo)
  values('Prova', '2023-05-23 19:10', '2023-05-23 21:15', 'N');
insert into lnc_lancamento(lnc_justificativa, lnc_data_hora_inicio, lnc_data_hora_fim, lnc_tipo)
  values('Trabalho 1', '2023-05-23 23:30', '2023-05-24 03:00', 'E');
insert into lnc_lancamento(lnc_justificativa, lnc_data_hora_inicio, lnc_data_hora_fim, lnc_tipo)
  values('Trabalho 2', '2023-05-24 22:00', '2023-05-24 23:00', 'E');