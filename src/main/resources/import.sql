insert into cozinha (nome) values ('tailandesa')
insert into cozinha (nome) values ('indiana')

insert into restalrante (nome,taxa_frete,cozinha_id) values ('bigmac','10','1')
insert into restalrante (nome,taxa_frete,cozinha_id) values ('macdonalts','12','1')

insert into forma_pagamento (descricao) values ('dinheiro')
insert into forma_pagamento (descricao) values ('cartao')

insert into estado (nome) values ('minasgerais')
insert into estado (nome) values ('espiritosanto')

insert into cidade (nome,estado_id) values ('paracatu','1')
insert into cidade (nome,estado_id) values ('belohorizonte','1')

insert into permissao (descricao,nome) values ('administrador','henrique')