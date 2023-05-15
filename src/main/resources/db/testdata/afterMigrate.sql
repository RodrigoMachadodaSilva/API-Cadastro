set foreign_key_checks = 0;

delete from usuario;
delete from grupo;
delete from permissao;
delete from usuario_grupo;
delete from grupo_permissao;

set foreign_key_checks = 1;

insert into usuario (id, nome, email, senha, data_cadastro) values (1, 'João da Silva', 'joao.ger@algafood.com.br', '$2y$12$NSsM4gEOR7MKogflKR7GMeYugkttjNhAJMvFdHrBLaLp2HzlggP5W', utc_timestamp);
insert into usuario (id, nome, email, senha, data_cadastro) values (2, 'Maria Joaquina', 'maria.vnd@algafood.com.br', '$2y$12$NSsM4gEOR7MKogflKR7GMeYugkttjNhAJMvFdHrBLaLp2HzlggP5W', utc_timestamp);
insert into usuario (id, nome, email, senha, data_cadastro) values (3, 'José Souza', 'jose.aux@algafood.com.br', '$2y$12$NSsM4gEOR7MKogflKR7GMeYugkttjNhAJMvFdHrBLaLp2HzlggP5W', utc_timestamp);
insert into usuario (id, nome, email, senha, data_cadastro) values (4, 'Sebastião Martins', 'sebastiao.cad@algafood.com.br', '$2y$12$NSsM4gEOR7MKogflKR7GMeYugkttjNhAJMvFdHrBLaLp2HzlggP5W', utc_timestamp);
insert into usuario (id, nome, email, senha, data_cadastro) values (5, 'Manoel Lima', 'manoel.loja@gmail.com', '$2y$12$NSsM4gEOR7MKogflKR7GMeYugkttjNhAJMvFdHrBLaLp2HzlggP5W', utc_timestamp);
insert into usuario (id, nome, email, senha, data_cadastro) values (6, 'Débora Mendonça', 'email.teste.aw+debora@gmail.com', '$2y$12$NSsM4gEOR7MKogflKR7GMeYugkttjNhAJMvFdHrBLaLp2HzlggP5W', utc_timestamp);
insert into usuario (id, nome, email, senha, data_cadastro) values (7, 'Carlos Lima', 'email.teste.aw+carlos@gmail.com', '$2y$12$NSsM4gEOR7MKogflKR7GMeYugkttjNhAJMvFdHrBLaLp2HzlggP5W', utc_timestamp);

insert into grupo (id, nome) values (1, 'Administrador'), (2, 'Funcionario');

insert into permissao (id, nome, descricao) values (1, 'EDITAR', 'Permite editar');
insert into permissao (id, nome, descricao) values (2, 'CADASTRAR', 'Permite criar ou editar');
insert into permissao (id, nome, descricao) values (3, 'VISUALIZAR', 'Permite visualizar');

insert into usuario_grupo (usuario_id, grupo_id) values (1, 1), (2, 1), (3, 2), (4, 2), (5, 2);

insert into grupo_permissao (grupo_id, permissao_id) values (1, 1), (1, 2), (1, 3), (2, 3);