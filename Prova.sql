use anotacao;

drop table if exists prv_prova;

create table prv_prova (
  prv_id bigint unsigned not null auto_increment,
  prv_data_hora_inicio datetime not null,
  prv_descricao varchar(200) not null,
  prv_nota float,
  primary key (prv_id)
);

insert into prv_prova(prv_data_hora_inicio, prv_descricao, prv_nota) values ('2023-05-22 9:15', 'Prova Tópicos', 5); 
insert into prv_prova(prv_data_hora_inicio, prv_descricao, prv_nota) values ('2023-05-23 19:10', 'Prova Lab IV', 6.5); 
insert into prv_prova(prv_data_hora_inicio, prv_descricao) values ('2023-05-25 19:10', 'Prova Lab V'); 