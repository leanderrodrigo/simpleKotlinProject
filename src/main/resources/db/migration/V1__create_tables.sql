create table curso (id varchar(255) not null, categoria varchar(255), nome varchar(255), primary key (id));
create table resposta (id varchar(255) not null, data_criacao timestamp, mensagem varchar(255), solucao boolean, autor_id varchar(255), topico_id varchar(255), primary key (id));
create table topico (id varchar(255) not null, data_criacao timestamp, mensagem varchar(255), status varchar(255), titulo varchar(255), autor_id varchar(255), curso_id varchar(255), primary key (id));
create table usuario (id varchar(255) not null, email varchar(255), nome varchar(255), primary key (id));
alter table resposta add constraint FK9999kvnmdq63ah7imctrl06r7 foreign key (autor_id) references usuario;
alter table resposta add constraint FKltuv9rkfjtlmn8b0rb3wdbjsv foreign key (topico_id) references topico;
alter table topico add constraint FKsk04hscorwqdymnafg8882v64 foreign key (autor_id) references usuario;
alter table topico add constraint FKcaaogjo0ynd54updie6kdpxd1 foreign key (curso_id) references curso;
