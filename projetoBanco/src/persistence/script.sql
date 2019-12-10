create database banconoite;

use banconoite;

create table produto(
id int primary key auto_increment,
nome varchar(50),
preco double,
imagem varchar(255)
);
#comida de natal
#JPG,JPEG ou png

insert into produto values(null,'panetone',20,'https://www.viverbemsaudavel.com.br/wp-content/uploads/2017/11/Panetone-fundo-branco.jpg');
insert into produto values(null,'bolino de bacalhau',30,'https://t2.rg.ltmcdn.com/pt/images/7/2/1/img_bolinho_de_bacalhau_127_600.jpg');
insert into produto values(null,'salada de macarrrão',50,'http://www.receitasnestle.com.br/images/default-source/recipes/salada_de_macarrao.jpg');

select * from produto;
